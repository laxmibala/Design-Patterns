package AbstractFactoryMethodExample.FileFactory;

import AbstractFactoryMethodExample.File.ExcelReadFile;
import AbstractFactoryMethodExample.File.ReadFile;

public class ExcelReadFileAbstractFactory implements ReadFileAbstractFactory {

    @Override
    public ReadFile readFile() {
        return new ExcelReadFile();
    }
}
