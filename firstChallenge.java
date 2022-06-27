/*
ID: boltstrike77
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class test {
  public static void main (String [] args) throws IOException {
    BufferedReader bReader = new BufferedReader(new FileReader("test.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    StringTokenizer strToken = new StringTokenizer(bReader.readLine());
    int i1 = Integer.parseInt(strToken.nextToken());   
    int i2 = Integer.parseInt(strToken.nextToken());
    out.println(i1+i2);
    out.close();
    bReader.close();
  }
}