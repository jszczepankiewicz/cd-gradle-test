TODO:

3. invoking some external command
4. spring boot
5. separate unit vs integration tests (https://dzone.com/articles/integration-testing-with-gradle) & check with sonar

PROCEDURE RELEASE:
Prerequisites:
nexus: 
	e:\dev\nexus-2.14.4-03-bundle\nexus-2.14.4-03\bin>nexus console
	http://localhost:8081/nexus/#welcome
	
sonar: 
	E:\dev\sonarqube-5.6.6\sonarqube-5.6.6\bin\windows-x86-64> .\StartSonar.bat
	http://localhost:9000/
	(run in gradle) gradle sonarqube
	

release:
	
Q&A:
Where to store credentials: https://stackoverflow.com/questions/12749225/where-to-put-gradle-configuration-i-e-credentials-that-should-not-be-committe
WARNING: can not invoke in one release and publish!
http://axion-release-plugin.readthedocs.io/en/latest/configuration/publishing.html

has to be two separate calls!	