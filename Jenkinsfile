pipeline {
  agent any
  stages {
    stage('Code Checkingout') {
      steps {
        git(credentialsId: 'ssh id', url: 'git@git.epam.com:paila_naidu/automation.git')
      }
    }
    stage('Running Tests') {
      steps {
          catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
        bat '''cd SeleniumAutomationWithCucumber
mvn test -Dmaven.test.failure.ignore -Dcucumber.filter.tags="@Regression"'''
      }
      }
    }
       stage('Zipping the results') {
            steps{
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
               bat "del Results.zip"


               zip zipFile: 'Results.zip', archive: false, dir: 'SeleniumAutomationWithCucumber/target/cucumber/cucumber-reports/cucumber-html-reports/'
                }
            }
        }
    }




    post {
        always {
            emailext attachmentsPattern: 'SeleniumAutomationWithCucumber/Results.zip', body: '''${SCRIPT, template="groovy-html.template"}''',
                    subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.currentResult}",
                    mimeType: 'text/html',to: "sunnygadumadeinvizag@gmail.com,paila_naidu@epam.com"
            }

    }

  }
