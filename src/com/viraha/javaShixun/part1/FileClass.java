package com.viraha.javaShixun.part1;
import java.io.File;
import java.io.IOException;

public class FileClass {
    private static File f;
    private static File path;
    private static File f2;

    public static void main(String[] args) throws IOException{
        System.out.println("C:\\Users\\86159\\Desktop\\4.26作业\\报告.txt");
        char c;
        StringBuffer buf = new StringBuffer();
        try {
            while ((c = (char) System.in.read()) != '\n')
                buf.append(c);
        } catch (java.io.IOException e) {
            System.out.println("Error" + e.toString());
        }
        File file = new File(buf.toString().trim());
        if (file.exists()) {
            System.out.println("File name:" + file.getName());
            System.out.println("path :" + file.getPath());
            System.out.println("Abs path:" + file.getAbsolutePath());
            System.out.println("Writeable :" + file.canWrite());
            System.out.println("Readlable:" + file.canRead());
            System.out.println("Length:" + file.length());


            System.out.println("exist:              " + file.exists());
            System.out.println("parent:             " + file.getParent());
            System.out.println("is a file :         " + file.isFile());
            System.out.println("is a directory:     " + file.isDirectory());
            System.out.println("last modified:      " + file.lastModified());
            f.setLastModified(file.lastModified() + 1102304);
            System.out.println("last modified:      " + file.lastModified());
            System.out.println("Canonical Path:" + file.getCanonicalPath());
            File newF = new File("newFile.class");
            System.out.println("-----Rename " + file + "-------");
            f.renameTo(newF);
            System.out.println("name :             " + newF.getName());
            System.out.println(file + " exist?           " + file.exists());
            System.out.println(newF + " exist?           " + file.exists());
            System.out.println("convert to URI:" + file.toURI());
            System.out.println("compare file to path:" + file.compareTo(path));
            System.out.println("compare file to f2:" + file.compareTo(f2));
            System.out.println("-----delete " + newF + "-------");
            newF.delete();
            System.out.println(newF + " exist? " + newF.exists());
        }
        else System.out.println("Sorry, file not found");
    }

}


