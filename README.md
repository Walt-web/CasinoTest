##Automated testing project. Paramore exercise. 
This project contains two automated test cases, programmed in java with selenium and Junit dependencies. The first case validates the user creation form and the second one the login to the page with a valid user and the access to the tournaments menu option. 

### Configuration
To be able to execute the project it is necessary to have eclipse installed and to have Java installed and the JAVA_OPTION variables configured in the system of the pc with windows10 operating system. 
You must also have google chrome installed. 
The chromedriver.exe file that exists in the resources folder is compatible with google chrome version 97.0.4692.71. In case the execution failed because the version of google chrome is not compatible with your version, you should look for the version of chromedriver.exe compatible with your version. I share a path where you can download  [path](https://chromedriver.chromium.org/downloads "path")

###Other comments
The data input for the execution of the tests is done through the data that exists in the file located in the path ./src/test/resources/dataFile/leerCSV.csv to modify some input data this file must be modified. 