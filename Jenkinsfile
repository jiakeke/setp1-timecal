pipeline {
    agent any
    stages {
        stage('checking') {
            steps {
                git branch: 'main', url: 'https://github.com/jiakeke/setp1-timecal.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
