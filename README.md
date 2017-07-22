TODO:

1. publishing to nexus (normal project, no spring boot)
- no javadoc but
- with sources jar
2. sonar (coverage etc.)
3. invoking some external command
4. spring boot
5. separate unit vs integration tests (https://dzone.com/articles/integration-testing-with-gradle) & check with sonar
6. convert to new plugin declaration (https://plugins.gradle.org/plugin/org.sonarqube#new-plugin-mechanism-info-body)

PROCEDURE RELEASE:
Prerequisites:
nexus: 
	e:\dev\nexus-2.14.4-03-bundle\nexus-2.14.4-03\bin>nexus console
	http://localhost:8081/nexus/#welcome
	
sonar: 
	E:\dev\sonarqube-5.6.6\sonarqube-5.6.6\bin\windows-x86-64> .\StartSonar.bat
	http://localhost:9000/
	(run in gradle) gradle sonarqube