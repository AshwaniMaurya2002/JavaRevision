public class isSorted {

                public static boolean isSortedArray(int[] arr) {

                                for (int j = 0; j < arr.length; j++) {
                                                if (arr[j] > arr[j + 1]) {
                                                                return false;

                                                }
                                }

                                return true;

                }

                public static void rotateArray(int[] arr) {

                }

                public static void main(String[] args) {
                                int[] arr = { 3, 4, 5, 1, 2 };

                }
}
