pipeline{
    agent any

    stages {
        stage ('build stage..') {
            steps{
                sh 'echo "building"'
            }
        }
        stage ('test stage..') {
            steps{
                sh 'echo "testing"'
            }
        }
        stage ('deploy stage..'){
            steps{
                sh 'echo "deploying"'
            }
        }
    }
}