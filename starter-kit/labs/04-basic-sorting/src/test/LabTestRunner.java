public class LabTestRunner {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        System.out.println("=== Lab 04 Basic Sorting Tests ===\n");

        // 1. Empty array test
        if (testEmptyArray()) {
            passed++;
        } else {
            failed++;
        }

        // 2. Single item test
        if (testSingleItem()) {
            passed++;
        } else {
            failed++;
        }

        // 3. Already sorted test
        if (testAlreadySorted()) {
            passed++;
        } else {
            failed++;
        }

        // 4. Reverse sorted test
        if (testReverseSorted()) {
            passed++;
        } else {
            failed++;
        }

        // 5. Duplicates test
        if (testDuplicates()) {
            passed++;
        } else {
            failed++;
        }

        // 6. Stable tie test (Student objects by grade)
        if (testStableTieStudents()) {
            passed++;
        } else {
            failed++;
        }

        // 7. Student sort by name test
        if (testSortStudentsByName()) {
            passed++;
        } else {
            failed++;
        }

        // 8. Manual trace verification
        testManualTrace();

        System.out.println("\n=== Results ===");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

        if (failed > 0) {
            System.exit(1);
        }
    }

    static boolean testEmptyArray() {
        System.out.print("Test 1: Empty array... ");
        int[] arr = {};
        int[] expected = {};
        BasicSorts.bubbleSort(arr);
        if (java.util.Arrays.equals(arr, expected) && BasicSorts.comparisons == 0 && BasicSorts.swaps == 0) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", swaps=" + BasicSorts.swaps + ")");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static boolean testSingleItem() {
        System.out.print("Test 2: Single item... ");
        int[] arr = { 42 };
        int[] expected = { 42 };
        BasicSorts.insertionSort(arr);
        if (java.util.Arrays.equals(arr, expected) && BasicSorts.comparisons == 0 && BasicSorts.writes == 0) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", writes=" + BasicSorts.writes + ")");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static boolean testAlreadySorted() {
        System.out.print("Test 3: Already sorted... ");
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        BasicSorts.selectionSort(arr);
        if (java.util.Arrays.equals(arr, expected)) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", swaps=" + BasicSorts.swaps + ")");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static boolean testReverseSorted() {
        System.out.print("Test 4: Reverse sorted... ");
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        BasicSorts.bubbleSort(arr);
        if (java.util.Arrays.equals(arr, expected)) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", swaps=" + BasicSorts.swaps + ")");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static boolean testDuplicates() {
        System.out.print("Test 5: Duplicates... ");
        int[] arr = { 2, 2, 1, 3, 1, 2 };
        int[] expected = { 1, 1, 2, 2, 2, 3 };
        BasicSorts.insertionSort(arr);
        if (java.util.Arrays.equals(arr, expected)) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", writes=" + BasicSorts.writes + ")");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static boolean testStableTieStudents() {
        System.out.print("Test 6: Stable tie (Student by grade)... ");
        BasicSorts.Student[] students = {
                new BasicSorts.Student("Alice", 85),
                new BasicSorts.Student("Bob", 85),
                new BasicSorts.Student("Carol", 90)
        };

        String[] expectedOrder = { "Alice", "Bob", "Carol" };
        BasicSorts.sortStudentsByGrade(students);

        if (students[0].name.equals("Alice")
                && students[1].name.equals("Bob")
                && students[2].name.equals("Carol")) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", writes=" + BasicSorts.writes + ")");
            return true;
        } else {
            System.out.println("FAIL");
            System.out.println("  Expected: Alice, Bob, Carol");
            System.out.println("  Got: " + students[0].name + ", " + students[1].name + ", " + students[2].name);
            return false;
        }
    }

    static boolean testSortStudentsByName() {
        System.out.print("Test 7: Sort Students by name... ");
        BasicSorts.Student[] students = {
                new BasicSorts.Student("Charlie", 80),
                new BasicSorts.Student("Alice", 90),
                new BasicSorts.Student("Bob", 85)
        };

        String[] expectedOrder = { "Alice", "Bob", "Charlie" };
        BasicSorts.sortStudentsByName(students);

        if (students[0].name.equals("Alice")
                && students[1].name.equals("Bob")
                && students[2].name.equals("Charlie")) {
            System.out.println("PASS (comparisons=" + BasicSorts.comparisons + ", writes=" + BasicSorts.writes + ")");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static void testManualTrace() {
        System.out.println("Test 8: Manual trace for [7, 3, 9, 2, 5]");
        BasicSorts.main(new String[] {});
    }
}