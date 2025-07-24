//defining methods and later  these are called by our application pipelines

//define a package 
package com.i27academy.builds;

//defining a  calculator class 
class Calculator{
     
     //define a variable to hold the jenkins content 
     def jenkins 

     Calculator(jenkins){
        this.jenkins = jenkins
     }

     //create a method to perofrm add of 2 numbers
     def add(firstNumber, secondNumber){
    
        //logic to add numbers
        return firstNumber + secondNumber
     }
}






