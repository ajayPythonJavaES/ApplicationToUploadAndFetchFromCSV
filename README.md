# ApplicationToUploadAndFetchFromCSV
Tech-stack used: Java 11, Spring Boot 2.6.7, JPA 2.x, H2-Database and POSTMAN(for testing the APIs').
Built-tool used: Maven
Following are the end points for various APIs: 
1. http://localhost:8080/upload - API to upload the file, need to pass a request parameter as "file"
	eg: http://localhost:8080/upload?file=<UploadFileName.csv>
	
2. http://localhost:8080/data/code/{code} - API to fetch data by code

3. http://localhost:8080/data/fetch/all - API to fetch all data

4. http://localhost:8080/data/delete/all - API to delete all uploaded data.
