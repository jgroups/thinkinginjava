package me.lbing.io;

import java.io.*;

/**
 * Created by King on 2016/5/17.
 */
public class BufferedInputFile {
    public static void main(String[] args) throws IOException {
//        bufferReadLine();
//        memoryInput();
        DataInputStream di = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.bufferReadLine("C:\\Users\\King\\Desktop\\readme.txt").getBytes()));
        byte b;
        while(di.available()!=0){
            System.out.print((char) di.readByte());
        }
    }

    private static void memoryInput() throws IOException {
        StringReader sr = new StringReader(BufferedInputFile.bufferReadLine("C:\\Users\\King\\Desktop\\readme.txt"));
        int ch;
        while ((ch = sr.read()) != -1) {
            System.out.print((char) ch);
        }
    }

    private static String bufferReadLine(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "GBK"));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        br.close();
        return sb.toString();
    }
}
