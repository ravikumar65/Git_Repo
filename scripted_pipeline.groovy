pipeline{
    agent any

    stages {
        stage ('Compile stage..') {
            steps{
                withMaven(maven :'Maven3.6.3'){
                    sh 'mvm clean compile'
                }
                
            }
        }
        stage ('test stage..') {
            steps{
                withMaven(maven :'Maven3.6.3'){
                    sh 'mvm test'
                }
            }
        }
        stage ('deploy stage..'){
            steps{
                withMaven(maven :'Maven3.6.3'){
                    sh 'mvm deploy'
                }
            }
        }
    }
}