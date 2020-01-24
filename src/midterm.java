import java.util.Arrays;

public class midterm {
    private int speedLimit;

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 4, 2, 7};
        int[] num2 = {-1, -3, 4, 2};
        System.out.println("the smallest missing positive integer :" + missingNum(num));
        System.out.println("the smallest missing positive integer:" + missingNum(num2));
        int[] line = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        System.out.println(Arrays.toString(getElement(line)));

    }

    private static int missingNum(int[] numbers) {
        Arrays.sort(numbers);
        int i = 1;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == i) {
                i++;
            }
        }
        return i;
    }


    private static int[] getElement(int[] num) {
        int count = 0;
        int target = 24;
        for (int numbers : num) {
            if (target == numbers) {
                count++;
                if (count == 0) {
                    return num;
                }

                int[] res = new int[num.length - count];
                int index = 0;
                for (int value : num) {
                    if (value != target) {
                        res[index] = value;
                        index++;

                    }
                }
                num = null;

            }
        }
        return res;
    }


}























