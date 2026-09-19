public class BasicSorts {

    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static int comparisons;
    public static int writes;
    public static int swaps;

    static void resetCounters() {
        comparisons = 0;
        writes = 0;
        swaps = 0;
    }

    public static void bubbleSort(int[] arr) {
        resetCounters();
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    writes += 3;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void selectionSort(int[] arr) {
        resetCounters();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
                swaps++;
                writes += 3;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        resetCounters();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    writes++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
            writes++;
        }
    }

    public static void sortStudentsByGrade(Student[] students) {
        resetCounters();
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0) {
                comparisons++;
                if (students[j].grade > key.grade) {
                    students[j + 1] = students[j];
                    writes++;
                    j--;
                } else {
                    break;
                }
            }
            students[j + 1] = key;
            writes++;
        }
    }

    public static void sortStudentsByName(Student[] students) {
        resetCounters();
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0) {
                comparisons++;
                if (students[j].name.compareTo(key.name) > 0) {
                    students[j + 1] = students[j];
                    writes++;
                    j--;
                } else {
                    break;
                }
            }
            students[j + 1] = key;
            writes++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void traceBubbleSort(int[] arr) {
        System.out.println("=== Bubble Sort Trace ===");
        System.out.print("Initial: ");
        printArray(arr);
        int n = arr.length;
        int[] copy = arr.clone();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(copy);
            if (!swapped) break;
        }
    }

    public static void traceSelectionSort(int[] arr) {
        System.out.println("=== Selection Sort Trace ===");
        System.out.print("Initial: ");
        printArray(arr);
        int n = arr.length;
        int[] copy = arr.clone();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (copy[j] < copy[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = copy[i];
                copy[i] = copy[minIdx];
                copy[minIdx] = temp;
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(copy);
        }
    }

    public static void traceInsertionSort(int[] arr) {
        System.out.println("=== Insertion Sort Trace ===");
        System.out.print("Initial: ");
        printArray(arr);
        int n = arr.length;
        int[] copy = arr.clone();
        for (int i = 1; i < n; i++) {
            int key = copy[i];
            int j = i - 1;
            while (j >= 0 && copy[j] > key) {
                copy[j + 1] = copy[j];
                j--;
            }
            copy[j + 1] = key;
            System.out.print("Pass " + i + ": ");
            printArray(copy);
        }
    }

    public static void main(String[] args) {
        int[] traceArray = {7, 3, 9, 2, 5};
        
        System.out.println("Manual tracing for [7, 3, 9, 2, 5]:");
        System.out.println();
        
        traceBubbleSort(traceArray);
        System.out.println();
        
        traceSelectionSort(traceArray);
        System.out.println();
        
        traceInsertionSort(traceArray);
        System.out.println();
    }
}