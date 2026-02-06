import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

       // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 카운팅 정렬 예시
         */

        /*
        int[] array = {0,1,3,0,1};

        CountingSort countingSort = new CountingSort(5,array);
        countingSort.doCountingSort();

         */

        /* 병합 정렬 예시
         */

        /*
        int[] arr = {
                42, 17, 8, 99, 23,
                5, 77, 61, 14, 3,
                88, 34, 55, 1, 90,
                2, 76, 19, 100, 50
        };

        MergeSort.mergeSort(arr);

        for (int j : arr) {
                sb.append(j).append(" ");
        }

        System.out.print(sb);

         */


        // 2026-01-31
        /* 백준 - 1920번 : 수 찾기
         */

        /*
        // 입력받기
        int input = scanner.nextInt();
        HashSet<Integer> inputSet = new HashSet<>();

        for(int i=0; i<input; i++){
            inputSet.add(scanner.nextInt());
        }

        int input2 = scanner.nextInt();
        List<Integer> inputList = new ArrayList<>();

        for(int i=0; i<input2; i++){
            inputList.add(scanner.nextInt());
        }

        inputList
                .stream()
                .map(x -> inputSet.contains(x) ?1:0)
                .forEach(System.out::println);
        */


        /* 백준 - 2750번 : 수 정렬하기
         */

        /*
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for( int i=0;i<n;i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for(int i:array){
            sb.append(i).append("\n");
        }

        System.out.print(sb);

         */

        /* 백준 - 10989번 : 수 정렬하기 3
         */

        /*
        int number = Integer.parseInt(br.readLine());
        int[] array = new int[10001];

        for(int i=0;i<number;i++){
            int scan = Integer.parseInt(br.readLine());
            array[scan]++;
        }

        for(int i=1;i<=10000;i++){
            while(array[i]>0){
                sb.append(i).append("\n");
                array[i]--;
            }
        }

        System.out.print(sb);

         */

        /* 백준 - 10815번 : 숫자 카드
         */

        /*
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<n2;i++){
            list.add(Integer.parseInt(st2.nextToken()));
        }

        for(int x:list){
            sb.append(set.contains(x) ? 1 : 0).append(" ");
        }

        System.out.print(sb);
        
         */

        /* 백준 - 1026번 : 보물
         */

        /*
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] array2 = new int[n];
        int total=0;

        CountingSort countingSort = new CountingSort(n,array2);

        // 첫 번째 배열 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 두 번째 배열 입력받기
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            array2[i] = Integer.parseInt(st2.nextToken());
        }

        // 첫 번째 배열 : 오름차순 , 두 번째 배열 : 내림차순
        Arrays.sort(array);
        int[] array2Sorted = countingSort.reverseArray();


        // 최소합 구하기
        for(int i=0;i<n;i++){
            total = total + array[i]*array2Sorted[i];
        }

        System.out.print(total);
         */


    }
}
