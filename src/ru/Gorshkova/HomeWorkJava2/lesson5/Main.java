package ru.Gorshkova.HomeWorkJava2.lesson5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.csv"));
        String headers = br.readLine();
        if (headers != null){
            String[] colums = headers.split(";");
            System.out.println(headers);
        }
        String data = br.readLine();
        if (data != null){
            String[] col = data.split(";");
            System.out.println(data);
        }
        String data2 = br.readLine();
        if (data2 != null){
            String[] col2 = data2.split(";");
            System.out.println(data2);
        }

    }

    }


