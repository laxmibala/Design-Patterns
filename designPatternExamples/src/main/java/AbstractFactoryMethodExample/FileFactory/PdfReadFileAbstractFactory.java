package AbstractFactoryMethodExample.FileFactory;

import AbstractFactoryMethodExample.File.PdfReadFile;
import AbstractFactoryMethodExample.File.ReadFile;

public class PdfReadFileAbstractFactory implements ReadFileAbstractFactory {

    @Override
    public ReadFile readFile() {
        return new PdfReadFile();
    }
}
