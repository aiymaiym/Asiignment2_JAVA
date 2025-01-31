/* Variant 2: Merge Sort (von Neumann Algorithm)
Algorithm: von Neumann algorithm (merge sort). Initially, the entire array is considered
as a set of ordered groups of one element each. By merging adjacent groups, we obtain ordered groups, each of which contains two elements (except, perhaps, the last group for which no matching group is found). Furthermore, the ordered groups are enlarged in the same way.
Va */

public class labka {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = java.util.Arrays.copyOfRange(arr, 0, mid);
        int[] right = java.util.Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = {36, 27, 4, 3, 3, 9, 88, 10};
        System.out.println(java.util.Arrays.toString(arr));
    }
}

