public class BigONatation {

    
    public static int getFirstElement(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(
                    "Array cannot be null or empty."
            );
        }

        return arr[0];
    }

    
    public static boolean isEven(int n) {

        return (n & 1) == 0;
    }


   
    public static int binarySearch(int[] sortedArr, int target) {

        if (sortedArr == null) {
            return -1;
        }

        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (sortedArr[mid] == target) {
                return mid;
            }

            if (sortedArr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }


    public static int findMax(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(
                    "Array cannot be null or empty."
            );
        }

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static long sumArray(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException(
                    "Array cannot be null."
            );
        }

        long sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }


    public static void mergeSort(
            int[] arr,
            int left,
            int right) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);

        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    
    private static void merge(
            int[] arr,
            int left,
            int mid,
            int right) {

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


    public static void bubbleSort(int[] arr) {

        if (arr == null) {
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }

   
    public static void printDuplicatePairs(int[] arr) {

        if (arr == null) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(
                            "Duplicate pair: ("
                                    + arr[i]
                                    + ", "
                                    + arr[j]
                                    + ")"
                    );
                }
            }
        }
    }


    public static int[][] multiplyMatrices(
            int[][] A,
            int[][] B) {

        int n = A.length;

        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static void threeSum(int[] arr) {

        if (arr == null) {
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {

                        System.out.println(
                                "Triplet: ["
                                        + arr[i]
                                        + ", "
                                        + arr[j]
                                        + ", "
                                        + arr[k]
                                        + "]"
                        );
                    }
                }
            }
        }
    }


    public static long fibonacciExponential(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "n cannot be negative."
            );
        }

        if (n <= 1) {
            return n;
        }

        return fibonacciExponential(n - 1)
                + fibonacciExponential(n - 2);
    }

    
    public static void printAllSubsets(int[] arr) {

        if (arr == null) {
            return;
        }

        int n = arr.length;

       
        if (n >= 31) {
            throw new IllegalArgumentException(
                    "Array is too large for this demonstration."
            );
        }

        int total = 1 << n;

        for (int mask = 0; mask < total; mask++) {

            System.out.print("{ ");

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println("}");
        }
    }


   
    public static void generatePermutations(
            int[] arr,
            int start) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (start == arr.length - 1) {

            printArray(arr);

            return;
        }

        for (int i = start; i < arr.length; i++) {

            // Choose
            swap(arr, start, i);

            // Explore
            generatePermutations(arr, start + 1);

            // Undo choice
            swap(arr, start, i);
        }
    }

    
    private static void swap(
            int[] arr,
            int i,
            int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;
    }

    private static void printArray(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }


    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {


        System.out.println("=== O(1) - Constant ===");

        int[] sample = {
                10, 20, 30, 40, 50
        };

        System.out.println(
                "First element : "
                        + getFirstElement(sample)
        );

        System.out.println(
                "Is 42 even?   : "
                        + isEven(42)
        );


        System.out.println(
                "\n=== O(log n) - Logarithmic ==="
        );

        int[] sorted = {
                1, 3, 5, 7, 9, 11, 13
        };

        System.out.println(
                "Index of 7    : "
                        + binarySearch(sorted, 7)
        );

        System.out.println(
                "Index of 6    : "
                        + binarySearch(sorted, 6)
        );


        System.out.println(
                "\n=== O(n) - Linear ==="
        );

        int[] nums = {
                4, 2, 9, 1, 7, 3
        };

        System.out.println(
                "Max value     : "
                        + findMax(nums)
        );

        System.out.println(
                "Sum           : "
                        + sumArray(nums)
        );


        System.out.println(
                "\n=== O(n log n) - Linearithmic ==="
        );

        int[] toSort = {
                5, 3, 8, 4, 2
        };

        mergeSort(
                toSort,
                0,
                toSort.length - 1
        );

        System.out.print(
                "Merge sorted  : "
        );

        printArray(toSort);

        System.out.println(
                "\n=== O(n^2) - Quadratic ==="
        );

        int[] bubbleArr = {
                64, 34, 25, 12, 22, 11
        };

        bubbleSort(bubbleArr);

        System.out.print(
                "Bubble sorted : "
        );

        printArray(bubbleArr);

        System.out.println(
                "Duplicate pairs in {1,2,3,1,2}:"
        );

        printDuplicatePairs(
                new int[]{1, 2, 3, 1, 2}
        );

        System.out.println(
                "\n=== O(n^3) - Cubic ==="
        );

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int[][] C = multiplyMatrices(A, B);

        System.out.println(
                "Matrix multiply result:"
        );

        System.out.println(
                "["
                        + C[0][0]
                        + ", "
                        + C[0][1]
                        + "]"
        );

        System.out.println(
                "["
                        + C[1][0]
                        + ", "
                        + C[1][1]
                        + "]"
        );

        System.out.println(
                "3-Sum triplets in {-1,0,1,2,-1,-4}:"
        );

        threeSum(
                new int[]{
                        -1, 0, 1, 2, -1, -4
                }
        );


        // --------------------------------------------------------
        // O(2^n)
        // --------------------------------------------------------

        System.out.println(
                "\n=== O(2^n) - Exponential ==="
        );

        System.out.println(
                "Fibonacci(10) : "
                        + fibonacciExponential(10)
        );

        System.out.println(
                "All subsets of {1,2,3}:"
        );

        printAllSubsets(
                new int[]{1, 2, 3}
        );

        System.out.println(
                "\n=== O(n!) - Factorial ==="
        );

        System.out.println(
                "All permutations of {1,2,3}:"
        );

        generatePermutations(
                new int[]{1, 2, 3},
                0
        );

        System.out.println(
                "\n=== O(sqrt n) - Square Root ==="
        );

        System.out.println(
                "Is 97 prime?  : "
                        + isPrime(97)
        );

        System.out.println(
                "Is 100 prime? : "
                        + isPrime(100)
        );

        System.out.println(
                "\n=== Program Finished ==="
        );
    }
}