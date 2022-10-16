/**
 * 
 */
package com.csv.operations.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import com.csv.operations.entity.DataFromFile;

/**
 * @author Ajay Sarvasiddhi
 *
 */
public class CSVHelper {

	private static final String FILE_TYPE = "text/csv";

	public static boolean isCSV(MultipartFile file) {
		if (!FILE_TYPE.equals(file.getContentType()))
			return false;

		return true;
	}

	public static List<DataFromFile> convertCSV(InputStream inputStream) throws IOException {
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, "UTF_8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

			List<DataFromFile> recordsList = new ArrayList<DataFromFile>();

			for (CSVRecord record : csvParser.getRecords()) {
				DataFromFile entry = new DataFromFile(record.get("source"), record.get("codeList"), record.get("code"),
						record.get("displayValue"), record.get("longDescription"), record.get("fromDate"),
						record.get("toDate"), Integer.parseInt(record.get("sortingPriority")));

				recordsList.add(entry);
			}
			return recordsList;
		}
	}

}
