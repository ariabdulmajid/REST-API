
# REST API


## Requirement

- Java Version 8

- MySQL database


## Run Locally

1. Before running, create database with name "test" or other.
2. Configuration credential in file "application.properties" for username and password database.
3. Compile and install all modules:
   * Online mode (use it for the first time to download dependencies):  
   `mvn clean install`
   * (Optional) or use the Offline mode, if you already have all dependencies in your Maven local repository:  
   `mvn -o clean install`
4. Run the application:  
`java -jar .\target\restApi-0.0.1-SNAPSHOT.jar`
5. Access the application using this URL (it will also generate the database structure) with a Postman or other application (already included for the collection API):
   * login : [http://localhost:8080/api/login](http://localhost:8080/api/login) (POST)
     * check in Body (username : admin, password : admin)
   * job list : [http://localhost:8080/api/job/list](http://localhost:8080/api/job/list) (GET) 
     * check in Headers, Authorization : Bearer (copy and paste response in LOGIN API "access_token")
   * job detail : [http://localhost:8080/api/job/detail/32bf67e5-4971-47ce-985c-44b6b3860cdb](http://localhost:8080/api/job/detail/32bf67e5-4971-47ce-985c-44b6b3860cdb) (GET) 
     * check in Headers, Authorization : Bearer (copy and paste response in LOGIN API "access_token")

## Authors

- [@ariabdulmajid](https://www.github.com/ariabdulmajid)
 

