package AbstractFactoryMethodExample;

import AbstractFactoryMethodExample.File.ReadFile;
import AbstractFactoryMethodExample.FileFactory.ExcelReadFileAbstractFactory;
import AbstractFactoryMethodExample.FileFactory.PdfReadFileAbstractFactory;
import AbstractFactoryMethodExample.FileFactory.ReadFileFactory;

public class FileReader {
    public static void main(String[] args) {

       //abstract factory design pattern
      ReadFile pdfReadFile=   ReadFileFactory.readInputFile(new PdfReadFileAbstractFactory());
      ReadFile excelReadFile=   ReadFileFactory.readInputFile(new ExcelReadFileAbstractFactory());

      //factory design pattern
        ReadFile readFile =ReadFileFactory.getFileType(Constants.FileType.EXCEL);




    }
}
