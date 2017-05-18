#!groovy

def sayHelloToName(def name) {
	println "Hello " +name;
}

def sayGoodbyeToName(def name) {
	println "Goodbye " +name;
}

def checkout(def repo, def isUseCredentials, def credentialsId){
	/*def credentials = isUseCredentials ? credentialsId : ''
	println "Credentials: " + credentials
	println "Repo URL: " + repo[0][0]
	println "Branch: " + repo[0][1]*/
	//git url: repo[0][0], branch: repo[0][1], credentialsId: credentials
	bat "git clone repo[0][0]"
}