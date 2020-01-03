pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''stage(\'npm-build\')
{
    agent {
        docker {
            image \'node:10.17.0\'
        }
    }

    steps {
        echo "Branch is ${env.BRANCH_NAME}..."

        withNPM(npmrcConfig:\'my-custom-npmrc\') {
            echo "Performing npm build..."
            sh \'npm install\'
        }
    }
}'''
      }
    }

  }
}