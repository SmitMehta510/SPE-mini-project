pipeline {
    agent any

    tools {
        maven "Maven3"
    }

    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/SmitMehta510/SPE-mini-project.git'
            }
        }
        stage('Maven build') {
            steps {
                sh "mvn clean install"
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t smitmehta510/scientific_calculator .'
                }
            }
        }
        stage('Stop and Remove Existing Container') {
            steps {
                script {
                    sh 'docker stop scientific_calculator || true'
                    sh 'docker rm -f scientific_calculator || true'
                }
            }
        }
        stage('Docker image push'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'smit', variable: 'DockerCredential')]) {
                        sh 'docker login -u smitmehta510 -p ${DockerCredential}' 
                    }
                    sh 'docker push smitmehta510/scientific_calculator'
                }
            }
        }
        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }
    }
}
