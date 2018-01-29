public class Main {
    public static void main(String[] args) {
        int arr[]={5,4,22,3,66,111};
        QuickSort quickSortObj = new QuickSort(arr);
        quickSortObj.applyQuickSort();
        quickSortObj.printArray();
    }
}
