public class secondMax {

                public static int secondMax(int[] arr) {
                                int max = Integer.MIN_VALUE;
                                int secMax = Integer.MIN_VALUE;

                                for (int each : arr) {
                                                if (each > max) {
                                                                secMax = max;
                                                                max = each;

                                                }

                                }

                                return secMax;

                }

                public static void main(String[] args) {
                                int[] arr = { 4, 53, 2, 643, 63246, 23 };
                                System.out.println(secondMax(arr));

                }

}
