package sample.util;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sample.model.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelDataReader {

    public static List<Person> readFile(String filePath) {
        List<Person> personList = new ArrayList<>();
        FileInputStream fileInputStream;
        String codeSMO;
        String polisVersion;
        String polisNumber;
        String firstName;
        String secondName;
        String lastName;
        String birthday;
        try {
            fileInputStream = new FileInputStream(filePath);

            // Using XSSF for xlsx format, for xls use HSSF
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            //looping over each workbook sheet
            for (int i = 1; i < 2; i++) {
                Sheet sheet = workbook.getSheetAt(i);

                for (int j =19; j < sheet.getPhysicalNumberOfRows(); j++) {
                    Row row = sheet.getRow(j);
                    codeSMO = String.valueOf((int) row.getCell(2).getNumericCellValue());
                    polisVersion = String.valueOf((int) row.getCell(3).getNumericCellValue());
                    polisNumber = row.getCell(4).getStringCellValue();
                    firstName = row.getCell(5).getStringCellValue();
                    secondName = row.getCell(6).getStringCellValue();
                    lastName = row.getCell(7).getStringCellValue();
                    birthday = String.valueOf((int)row.getCell(8).getNumericCellValue());

                    Person person = new Person(codeSMO , polisVersion, polisNumber, firstName, secondName, lastName, birthday );
                    personList.add(person);
                }

            }

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }
}
