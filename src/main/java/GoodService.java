public class GoodService {

    public int getValue(int x) {
        return x * 2;
    }

    public int findItem(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }
}
