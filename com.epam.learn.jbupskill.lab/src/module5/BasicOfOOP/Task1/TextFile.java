package module5.BasicOfOOP.Task1;

public class TextFile {

    private Directory directory;
    private File file;

    public TextFile(String file) {
        this.file = new File(file, new Directory("D://"));
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }




}
