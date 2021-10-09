import java.io.*;
import java.util.*;



public class Q3_NAGARAJU_RAVURI {

    static int bunnyEar(int n) {

        int result = 0;

        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                result++;
            }else{
                result = result*2;
            }
            if(i == 0){
                result = 1;
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException{

        // BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("output"));

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int result = bunnyEar(n);
            System.out.println(result);
            bufferedwriter.write(String.valueOf(result));
            bufferedwriter.newLine();
        }
        bufferedwriter.close();
        scanner.close();
    }

}
