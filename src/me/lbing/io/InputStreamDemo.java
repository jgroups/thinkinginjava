package me.lbing.io;

import java.io.*;

/**
 * Created by King on 2016/5/17.
 */
public class InputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] bytes = new byte[10];
        int offset = 3;
        int length = 5;
        InputStream byteArray1 = new ByteArrayInputStream(bytes);
        InputStream byteArray2 = new ByteArrayInputStream(bytes,offset,length);

        InputStream sb = new StringBufferInputStream("String 字符串");

        InputStream f1 = new FileInputStream("String字符串");
        InputStream f2 = new FileInputStream(new File(""));
        InputStream f3 = new FileInputStream(FileDescriptor.in);

        DataInputStream di = new DataInputStream(f1);

        RandomAccessFile raf = new RandomAccessFile("","");

    }
}
