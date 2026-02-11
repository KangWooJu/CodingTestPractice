import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 백준 - 10866번 : 덱
         */

        Deque deque = new Deque(20001);

        int number = Integer.parseInt(br.readLine());

        for(int i = 0; i < number; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push_front":
                    deque.doMethod(command, Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.doMethod(command, Integer.parseInt(st.nextToken()));
                    break;
                default:
                    sb.append(deque.doMethod(command,0)).append("\n");
                    break;
            }
        }

        System.out.print(sb);

    }
}