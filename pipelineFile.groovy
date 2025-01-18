pipeline {
    agent any

    stages {
        stage('Hello World') {
            steps {
                echo "Hello,world"
                sh 'mkdir -p ~/testerfromRepo'
            }
        }
    }
}