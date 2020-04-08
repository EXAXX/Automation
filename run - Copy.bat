set projectLocation=C:\Users\Murugan Ethiraj\OneDrive\Documents\GitHub\Automation
cd %projectLocation%
set classpath=%projectLocation%\bin\login;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
