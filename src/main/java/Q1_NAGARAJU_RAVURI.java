import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q1_NAGARAJU_RAVURI {


    public static List<Integer> winDraw(List<Integer> x,List<Integer> y){

        List<Integer> compareResult =  new ArrayList<>();
        int xcount = 0;
        int ycount = 0;

        for (int i = 0; i < x.size(); i++) {
            if(x.get(i)>y.get(i)){
                xcount++;
            }
            if(x.get(i)<y.get(i)){
                ycount++;
            }
        }
        compareResult.add(xcount);
        compareResult.add(ycount);

        System.out.println(xcount+" "+ycount);
        return compareResult;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

     //   BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("output.txt"));

        String[] xItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < xItems.length; i++) {
            int xItem = Integer.parseInt(xItems[i]);
            x.add(xItem);
        }

        String[] yItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < yItems.length; i++) {
            int yItem = Integer.parseInt(yItems[i]);
            y.add(yItem);
        }

        List<Integer> compareResult = winDraw(x, y);

        for (int i = 0; i < compareResult.size(); i++) {
            bufferedwriter.write(String.valueOf(compareResult.get(i)));

            if (i != compareResult.size() - 1) {
                bufferedwriter.write(" ");

            }
        }

            bufferedwriter.newLine();
            bufferedReader.close();
            bufferedwriter.close();

        }

    }



















