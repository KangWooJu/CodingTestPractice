public class Deque {

    int length;
    int[] deque;

    int front;
    int back;


    public Deque(int length){
        this.length = length;
        deque = new int[length];
        front = length/2;
        back = length/2;
    }

    public int doMethod(String method,
                        int value){

        return switch (method){
            case "push_front" -> push_front(value);
            case "push_back" -> push_back(value);
            case "pop_front" -> pop_front();
            case "pop_back" -> pop_back();
            case "size" -> sizeDeque();
            case "empty" -> empty();
            case "front" -> front();
            case "back" -> back();
            default -> -1;
        };
    }

    public int push_front(int value){

        deque[--front] = value;
        return 1;
    }

    public int push_back(int value){
        deque[back++] = value;
        return 1;
    }

    public int pop_front(){

        return (empty()==1)
                ? -1
                : deque[front++];


    }

    public int pop_back(){

        return (empty()==1)
                ? -1
                : deque[--back];

    }

    public int sizeDeque(){

        return back - front;
    }

    public int empty(){

        return (front==back)
                ? 1
                : 0;
    }

    public int front(){

        return (front!=back)
                ? deque[front]
                : - 1;
    }

    public int back(){

        return (front !=back)
                ? deque[back-1]
                : - 1;
    }
}
