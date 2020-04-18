def call(Map pipelineParams) {
    pipeline {
        agent any
        stages {
            stage('hello') {
                steps {
                    echo 'Hello World' 
                }
            }
        }
    }
}
