package chapter15;

public class Folder {
    
    public String concatPath (String folder, String file) {
        if (!folder.endsWith ("\\")) {
            folder += "\\";
        }
        return folder + file;
    }
}
