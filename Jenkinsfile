pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Compile') {
            steps {
                 sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Unit Tests') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
         stage('Integration Tests') {
            steps {
                sh 'mvn failsafe:integration-test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/TEST-*.xml'
        }
        failure {
            mail to: 'apedemonte@gmail.com', subject: 'The Pipeline failed :(', body:'The Pipeline failed :('
        }
    }
}
