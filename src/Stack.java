public class Stack {

    int[] stack;
    int top; // 스택의 크기이자 다음에 들어갈 위치

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
        return -1; // push는 출력 없음
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
