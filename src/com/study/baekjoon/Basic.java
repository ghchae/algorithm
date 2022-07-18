package com.study.baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic {
    public static void main(String[] args) throws IOException {
//        빠른A더하기B();
        빠른더하기_split();
    }

    public static void 빠른A더하기B() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            StringTokenizer arr = new StringTokenizer(str, " ");
            while (arr.hasMoreTokens()) {
                sum = sum + Integer.parseInt(arr.nextToken());
            }
            bw.write(String.valueOf(sum) + "\n");
            sum = 0;
        }
        bw.flush();
        bw.close();
    }

    public static void 빠른더하기_split() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            bw.write(A + B + "\n");
        }
        bw.flush();
        bw.close();
    }
}
