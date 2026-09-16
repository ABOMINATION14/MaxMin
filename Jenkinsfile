pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning code...'
                git branch: 'main', url: 'https://github.com/YOUR_USERNAME/maxmin-app.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Compiling...'
                sh 'javac MaxMin.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running program...'
                sh 'java MaxMin'
            }
        }
    }
}