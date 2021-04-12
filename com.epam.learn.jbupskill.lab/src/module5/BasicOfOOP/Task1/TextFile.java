package module5.BasicOfOOP.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TextFile {

    private Directory directory;
    private File file;

    public TextFile(Directory directory, File file) {
        this.directory = directory;
        this.file = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    private Path getPath() {
        String path = directory.getFolderPath() + file.getFileName();
        return Path.of(path);
    }

    public void createTextFile() throws IOException {
        Files.createFile(getPath());
    }

    public void renameTextFile(String s1) throws IOException {
        Files.move(getPath(), getPath().getParent().resolve(s1));
    }

    public void printTextFile() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = Files.newBufferedReader(getPath());
        String line;
        while ((line = bufferedReader.readLine()) != null)
            lines.add(line);
        System.out.println(lines);
    }

    public void addToTextFile(String text) throws IOException {
        Files.writeString(getPath(), text);
    }

    public void deleteOfTextFile() throws IOException {
        Files.delete(getPath());
    }


}
