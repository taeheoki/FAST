package Chapter8.ch2;

public class BinarySearchProblem {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 83;

        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;

        int temp = numbers[mid];
        boolean find = false;

        while (left <= right) {
            if (temp == target) {
                find = true;
                break;
            }
            else if (temp < target) {
                left = mid + 1;
            }
            else
                right = mid - 1;
            mid = (left + right) / 2;
            temp = numbers[mid];
        }
        if (find == true) {
            mid++;
            System.out.println("찾는 수는 " + mid + "번째 있습니다.");
        }
        else
            System.out.println("찾는 수가 없습니다.");
    }
}
