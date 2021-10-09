package gp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int inline = 0;
        int L = 0;
        int N = 0;
        while ((line = in.readLine()) != null) {
            String lines[] = line.split(" ");
            if(N==0) {
                L = Integer.parseInt(lines[0]);
                N = Integer.parseInt(lines[1]);
                System.out.println("L :" + L + ", N :" + N);

            }

            Map<Integer, Integer> map = new HashMap<>();

            if(inline>0 && inline<=N) {
                System.out.println("0 : "+lines[0]+" - 1 : "+lines[1]);
                map.put(Integer.parseInt(lines[0]), Integer.parseInt(lines[1]));
            }

            inline++;

            if(inline==N+1) {
                Map<Integer, Integer> treeMap = new TreeMap<>(map);
                for (Integer str : treeMap.keySet()) {
                    System.out.println(str);
                }
            }
        }
    }
}

https://api.telegram.org/1759266808:AAG-eMAqmm5qBD8kcQreeHpldmqdTgAfPwk/sendMessage?text=hallo&chat_id=1759266808
https://api.telegram.org/bot1759266808:AAG-eMAqmm5qBD8kcQreeHpldmqdTgAfPwk/getMe
