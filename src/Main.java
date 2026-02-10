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


        /* 백준 - 1181번 : 단어 정렬
         */

        /*
        Set<String> inputString = new HashSet<>();

        int input = Integer.parseInt(br.readLine());
        for(int i=0;i<input;i++){
            inputString.add(br.readLine());
        }

        List<String> list = new ArrayList<>(inputString);
        list.sort( (a,b)->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            } return a.length() - b.length();
                });

        for(String s : list){
            sb.append(s).append("\n");
        }

        System.out.print(sb);
         */


        /* 백준 - 11650번 : 좌표 정렬하기
         */

        /*
        int input = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();

        for(int i=0;i<input;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }

        Collections.sort(points);

        for(int i=0;i<input;i++){

            sb
                    .append(points
                            .get(i).x)
                    .append(" ")
                    .append(points
                            .get(i).y)
                    .append("\n");
        }

        System.out.print(sb);

         */


        /* 백준 - 11651번 : 좌표 정렬하기2
         */

        /*
        int number = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();
        for(int i=0;i<number;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }

        Collections.sort(points);

        for(int i=0;i<number;i++){

            sb
                    .append(points
                            .get(i).x)
                    .append(" ")
                    .append(points
                            .get(i).y)
                    .append("\n");
        }

        System.out.print(sb);

         */



        /* 백준 - 10867번 : 중복 빼고 정렬하기
         */

        /*
        HashSet<Integer> set = new HashSet<>();

        int number = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        set.stream()
                .sorted()
                .forEach(x -> sb.append(x).append(" "));

        System.out.print(sb);

         */


        /* 백준 - 10816번 : 숫자 카드2
         */

        /*
        HashMap<Integer,Integer> map = new HashMap<>();

        int number = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreElements()){
            int key = Integer.parseInt(st.nextToken());
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int number2 = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        while(st2.hasMoreElements()){
            sb
                    .append(map.getOrDefault(Integer.parseInt(st2.nextToken()),0))
                    .append(" ");
        }

        System.out.print(sb);

         */


        /* 백준 - 10828번 : 스택
         */

        /*
        Stack stack = new Stack(10000);

        int input = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < input ; i++ ){

            StringTokenizer st = new StringTokenizer(br.readLine());

            String first = st.nextToken();
            if(first.equals("push")){
                stack.doMethod("push",Integer.parseInt(st.nextToken()));
            } else {
                sb
                        .append(stack
                                .doMethod(first,0))
                        .append("\n");

            }

        }

        System.out.print(sb);

         */


        /* 백준 - 10845번 : 큐
         */

        Queue queue = new Queue(10000);

        int length = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < length ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){

                queue.doMethod("push",Integer.parseInt(st.nextToken()));

            } else {
                sb
                        .append(queue
                                .doMethod(command, 0))
                        .append("\n");
            }
        }

        System.out.print(sb);
    }

    static class Queue{

        int length;
        int[] queue;

        int front; // 맨 앞줄
        int rear; // 맨 뒷줄

        public Queue(int length){

            this.length = length;
            queue = new int[length];
            this.front = 0;
            this.rear = 0;

        }

        public int doMethod(String input, int data){
            return switch (input) {
                case "push" -> push(data);
                case "pop" -> pop();
                case "size" -> size();
                case "empty" -> empty();
                case "front" -> front();
                case "back" -> back();
                default -> -1;
            };
        }

        public int push(int data){

            queue[rear++] = data;
            return -1;
        }

        public int pop(){

            return  (front == rear) ? -1 : queue[front++];

        }

        public int size(){

            return (rear-front);

        }

        public int empty(){
            return (front==rear) ? 1 : 0;

        }

        public int front(){
            return (front == rear) ? -1 : queue[front];

        }

        public int back(){
            return (front == rear) ? -1 : queue[rear-1];
        }

    }

    /*
    static class Stack {

        int[] stack;
        int top;

        public Stack(int size){
            stack = new int[size];
            top = 0;
        }

        public int doMethod(String input, int number){
            return switch (input) {
                case "push" -> push(number);
                case "pop" -> pop();
                case "size" -> size();
                case "empty" -> empty();
                case "top" -> top();
                default -> -1;
            };
        }

        public int push(int number){
            stack[top++] = number;
            return -1;
        }

        public int pop(){
            if (top == 0) return -1;
            return stack[--top];
        }

        public int size(){
            return top;
        }

        public int empty(){
            return top == 0 ? 1 : 0;
        }

        public int top(){
            if (top == 0) return -1;
            return stack[top - 1];
        }
    }

     */


    /*
    static class Point implements Comparable<Point> {
        // Collections.sort(point)를 사용하면 내부의 CompareTo() 메소드를 채택하여 사용한다.

        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            /*if(this.x != o.x) return this.x - o.x;
            return this.y - o.y;


            if(this.y != o.y) return this.y- o.y;
            return this.x - o.x;
        }
    }

     */

}