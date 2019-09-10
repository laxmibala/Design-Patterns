package AbstractFactoryMethodExample.File;

public class ExcelReadFile implements ReadFile {

    public ExcelReadFile(){
        ReadFile();
    }

    @Override
    public void ReadFile() {
        System.out.println("File downloaded in XLS format");
    }
}
