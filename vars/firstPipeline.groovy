//import 
import com.i27academy.builds.Calculator


def call(Map pipelineParams){
    
    //instance of calculaotr
    Calculator calculator = new Calculator(this)
    pipeline{
        agent{
            label 'java-slave'
        }
        environment{
            APPLICATION_NAME = "${pipelineParams.appName}"
        }
        stages{
            stage('calculator'){
                steps{
                    script{
                        echo "calling add method"
                        echo  "printinf the sum of values"
                        println calculator.add(4,5)
                    }
                }
            }
            stage('Build'){
                steps{
                    echo "*****build the application****"
                    echo "****I am Building for ${env.APPLICATION_NAME}"
                }
            }
            stage('Test'){ 
                steps{
                    echo "********Application testing********"
                }
            }
            stage('DeploytoDev'){
                steps{
                    echo "Deploying to dev environment"
                }
            }
            stage('Deploytostage'){
                steps{
                    echo "Deploy to stage environment"
                }
            }
            stage('DeploytoProd'){
                steps{
                    echo "Deploy to prod environment"
                }
            }
        }
    }
}
