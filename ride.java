/*
ID: boltstrike77
LANG: JAVA
PROG: ride
*/
import java.io.*;

class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        String comet = b.readLine();
        String group = b.readLine();
        int[] c = new int[comet.length()];
        int[] g = new int[group.length()];
        int cTotal = 1;
        int gTotal = 1;
        for (int i = 0; i < comet.length(); i++) {
            c[i] = alphabet(comet.substring(i, i+1));
            cTotal *= c[i];
        }
        for (int i = 0; i < group.length(); i++) {
            g[i] = alphabet(group.substring(i, i+1));
            gTotal *= g[i];
        }

        if ((cTotal % 47) == (gTotal % 47)) {
            out.println("GO");
        } else {
            out.println("STAY");
        }


        b.close();
        out.close();
    }

    public static int alphabet(String letter) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U","V", "W", "X", "Y", "Z"};
        for (int i = 0; i < 26; i++) {
            if (letter.equals(alphabet[i])) {
                return (i+1);
            }
        }
        return -1;
    }
}
