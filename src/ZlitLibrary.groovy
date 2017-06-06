#!groovy
package com.proximus.servicing;

@Grab('org.jsoup:jsoup:1.8.1')
import org.jsoup.nodes.Document

def hello(){
    println "hello test"
}


/*@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes
def parallelize(int count){
  if (!Primes.isPrime(count)){
    error "${count} was not prime"
  }
}*/

def hello(){
    print "hello"
    
}

def sayHelloToName(def name) {
	println "Hello " +name;
}

def sayGoodbyeToName(def name) {
	println "Goodbye " +name;
}

def checkout(def repo, def isUseCredentials, def credentialsId){
	def credentials = isUseCredentials ? credentialsId : ''
	git url: repo[0][0], branch: [0][1], credentialsId: credentials
}