package ru.Gorshkova.HomeWorkJava2.lesson5;


import java.util.Arrays;


public class AppData {
    private String[] headers;
    private int[][] data = new int[2][3];

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "headers=" + Arrays.toString(headers) +
                ", data=" + Arrays.toString(data) +
                '}';
    }
    





}
