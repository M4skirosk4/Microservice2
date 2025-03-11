pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/M4skirosk4/Microservice2.git'
            }
        }
        stage('Build') {
                steps {
                    script {
                         echo 'Building the project...'
                        sh 'mvn clean package'
                            }
                        }
                }
        stage('Resolve Dependencies') {
            steps {
                script {
                    echo 'Resolving dependencies...'
                    sh 'mvn dependency:resolve'
                }
            }
        }
        stage('Test') {
                steps {
                    script {
                        echo 'Running tests...'
                        sh 'mvn test -e'
                            }
                    }
                }
    }
}

