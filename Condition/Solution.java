package Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        if (!fs.st.hasMoreTokens() && fs.next() == null) return;
        
        int t = fs.nextInt();

        while (t-- > 0) {
            solve(fs);
        }
    }
   
    private static void solve(FastScanner fs) {
        int n = fs.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }

        long maxSoFar = arr[0];
        long currentMax = arr[0];

        for (int i = 1; i < n; i++) {
            currentMax = Math.max((long) arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println(maxSoFar);
    }
}