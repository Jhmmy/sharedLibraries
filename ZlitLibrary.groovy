#!groovy

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