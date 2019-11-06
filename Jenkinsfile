pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    environment {
    registry = "docker.io/anatolyalexei/r6g3sys"
    registryCredential = 'dockerhub'
    dockerImage = ''
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                
            }
        }
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
       stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
                sh 'mvn dockerfile:push'
              /*  sh 'sudo docker login -u anatolyalexei -p be3e14df-c305-4cd0-8575-79645372cbd3' */
                
            }
        }
      /*   stage('Push Docker') {
            steps {
                 sh 'sudo docker login -u anatolyalexei -p be3e14df-c305-4cd0-8575-79645372cbd3' 
                sh 'sudo docker push anatolyalexei/r6g3sys:1.0.0'
                sh 'sudo docker push anatolyalexei/r6g3sys:latest'
            }
        }
        */
    /*    stage('Building image') {
            steps{
                script {
                    unstash 'target'
                    sh 'ls -l -R'
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploy Image') {
            steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                    dockerImage.push()
                    }
                }
            }
        }
        stage('Remove Unused docker image') {
            steps{
                script {
                    sh "docker rmi -f $registry:$BUILD_NUMBER"
                }
            }
        }
        */
    }
}
