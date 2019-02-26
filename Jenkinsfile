pipeline{
	 agent {
        label 'master'
    }
stages{
    stage('unittests'){
	steps{
	bat 'mvn test'
	}}
stage('mutation tests'){
steps{
bat 'mvn org.pitest:pitest-maven:mutationCoverage' 

}
post{
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }	
}}
}
