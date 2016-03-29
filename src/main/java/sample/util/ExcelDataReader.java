package sample.util;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sample.model.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelDataReader {

    public static List<Person> readFile(String filePath) {
        List<Person> personList = new ArrayList<Person>();
        FileInputStream fileInputStream = null;
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

            int numberOfSheets = workbook.getNumberOfSheets();

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
                //iterating over each row
//                while (rowIterator.hasNext()) {
//
//                    Person person = new Person();
//                    Row row = rowIterator.next();
//                    Iterator cellIterator = row.cellIterator();

                    //Iterating over each cell (column wise)  in a particular row.
//                    while (cellIterator.hasNext()) {
//
//                        Cell cell = cellIterator.next();
//                        //The Cell Containing String will is name.
//                        if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
//                            person.setCodeSMO(cell.getNumericCellValue());
//
//                            //The Cell Containing numeric value will contain marks
//                        } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
//
//                            //Cell with index 1 contains marks in Maths
//                            if (cell.getColumnIndex() == 1) {
//                                student.setMaths(String.valueOf(cell.getNumericCellValue()));
//                            }
//                            //Cell with index 2 contains marks in Science
//                            else if (cell.getColumnIndex() == 2) {
//                                student.setScience(String.valueOf(cell.getNumericCellValue()));
//                            }
//                            //Cell with index 3 contains marks in English
//                            else if (cell.getColumnIndex() == 3) {
//                                student.setEnglish(String.valueOf(cell.getNumericCellValue()));
//                            }
//                        }
//                    }
                    //end iterating a row, add all the elements of a row in list

//                }
            }

            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }
}
