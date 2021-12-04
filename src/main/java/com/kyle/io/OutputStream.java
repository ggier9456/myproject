package com.kyle.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStream  {
    public static void main(String[] args) throws IOException {
        File jk =new File("D:\\jk\\ko");
        jk.mkdirs();
        FileWriter fw  =new FileWriter("D:\\jk\\ko\\abc.txt");
        fw.write("哈哈");
        fw.flush();
        fw.close();
    }



}
