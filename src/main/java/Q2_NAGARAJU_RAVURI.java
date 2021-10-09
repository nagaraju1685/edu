import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Q2_NAGARAJU_RAVURI {



    static int jumpingRace(int k, int[] hillHeights) {

        int maxhill = 0;
        int result = 0;
        for (int i = 0; i < hillHeights.length; i++) {
             if(hillHeights[i]>maxhill){
                 maxhill = hillHeights[i];
             }
        }

        if(maxhill - k>0)
            result = maxhill - k;

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("output.txt"));
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] hillHeight = new int[n];


        String[] hillHeightsItems = scanner.nextLine().split(" ");


        for (int i = 0; i < n; i++) {
            int hillHeightItem = Integer.parseInt(hillHeightsItems[i]);
            hillHeight[i] = hillHeightItem;
        }


        int result = jumpingRace(k, hillHeight);

        System.out.println(result);

        bufferedwriter.write(String.valueOf(result));

        bufferedwriter.newLine();

        bufferedwriter.close();

        scanner.close();

    }

}

