public class CountingSort {


    // 정렬전 데이터
    int[] array;
    int arraySize;

    public CountingSort(int arraySize,int[] array){
        this.arraySize = arraySize;
        this.array = array;
    }

    public void doCountingSort(){

        int max = 0;

        // 정렬된 배열
        int[] sortedArray = new int[arraySize];

        for(int i : array){
            max = Math.max(max,i);
        }

        // 1. 카운팅 배열 생성
        int[] countingSort = new int[max+1];

        // 2. 갯수 세기
        for(int i : array){
            countingSort[i]++;
        }

        // 3. 누적합 생성
        for(int i = 0; i<max; i++){
            countingSort[i+1] = countingSort[i+1] + countingSort[i];
        }

        // 정렬 배열 값 넣기
        for(int i = arraySize - 1; i >= 0; i--){
            int value = array[i];
            int index = countingSort[value] - 1;
            sortedArray[index] = value;
            countingSort[value]--;
        }

        for (int i : sortedArray){
            System.out.print(i+" ");
        }
    }
}
