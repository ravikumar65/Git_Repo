node {
    stage ("bulding..")
    {
        echo "build job"
        sh "echo build"
    }
    stage ("testing..")
    {
        echo "Testing job"
    }
}