package AbstractFactoryMethodExample.FileFactory;

import AbstractFactoryMethodExample.Constants;
import AbstractFactoryMethodExample.File.ExcelReadFile;
import AbstractFactoryMethodExample.File.PdfReadFile;
import AbstractFactoryMethodExample.File.ReadFile;

public interface ReadFileFactory {
   public static ReadFile getFileType(Constants.FileType fileType){
       ReadFile readFile =null;
        switch (fileType){
            case PDF:
                readFile =new PdfReadFile();
                break;
            case EXCEL:
                readFile=new ExcelReadFile();
                break;
        }
        return  readFile;
   }

    public static ReadFile readInputFile(ReadFileAbstractFactory readFileAbstractFactory){
        return readFileAbstractFactory.readFile();

    }




}
