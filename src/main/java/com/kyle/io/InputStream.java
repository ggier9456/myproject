package com.kyle.io;

import java.io.*;

public class InputStream {
    public static void main(String[] args) {
        try {
            BufferedReader br =new BufferedReader(new FileReader("data.txt"));
            String n=br.readLine();
            while (n!=null){
                System.out.println(n);
                n= br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        fileReader();
//        inputStream();
    }

    private static void fileReader() {
        try {
            FileReader fr =new FileReader("data.txt");
            int n =fr.read();
            while (n != -1){
                System.out.print((char) n);
                n= fr.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
            int n= is.read();
            while (n!=-1){
                System.out.print((char) n);
                n=is.read();
            }
            System.out.println();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println("message");
        }catch(IOException io){
            io.printStackTrace();
        }
    }

}
