package com.paramo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/*
 * This class reads data from a scv file located at path ./src/test/resources/dataFile/leerCSV.csv 
 * It was imported and belongs to the project files.
 * To modify any test input data, the comma delimited file must be modified.
 * 
 */
public class DataFileCSV {

	String email1 = null;
	String password1 = null;
	String login = null;
	String name = null;
	String lastName = null;
	String middleName = null;
	String nickName = null;
	String addres = null;
	String city = null;
	String postalCode = null;
	String secretQuestion = null;
	String user2 = null;
	String passwrd2 = null;

	public void readDataCsv() {

		
		Path filePath = Paths.get("./src/test/resources/dataFile/leerCSV.csv");
		try {
			
			BufferedReader bufferedReader = Files.newBufferedReader(filePath);
			String linea;
			linea = bufferedReader.readLine();
			String[] datosdeLinea = linea.split(",");

			email1 = datosdeLinea[0];
			password1 = datosdeLinea[1];
			login = datosdeLinea[2];
			name = datosdeLinea[3];
			lastName = datosdeLinea[4];
			middleName = datosdeLinea[5];
			nickName = datosdeLinea[6];
			addres = datosdeLinea[7];
			city = datosdeLinea[8];
			postalCode = datosdeLinea[9];
			secretQuestion = datosdeLinea[10];
			user2 = datosdeLinea[11];
			passwrd2 = datosdeLinea[12];

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getEmail() { readDataCsv(); return email1; }
	public String getPassword() { readDataCsv(); return password1;	}
	public String getLogin() { readDataCsv(); return login;}
	public String getName() { readDataCsv(); return name; }
	public String getLastName() { readDataCsv(); return lastName; }
	public String getMiddleName() { readDataCsv(); return middleName; 	}
	public String getNickName() { readDataCsv(); return nickName; }
	public String getAddres() { readDataCsv(); return addres; }
	public String getCity() { readDataCsv(); return city; }
	public String getPostalCode() { readDataCsv(); return postalCode; }
	public String getSecretQuestion() { readDataCsv(); return secretQuestion; }
	public String getSeUser2() { readDataCsv(); return user2; }
	public String getPasswrod2() { readDataCsv(); return passwrd2; }

}
