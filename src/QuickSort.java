public class QuickSort {
    private int arr[];
    QuickSort(int[] arr)
    {
        this.arr=arr;
    }

    public int[] getArr() {
        return arr;
    }
    public void printArray(){
        for(int i: this.arr)
        {
            System.out.println(i);
        }
    }
    public void applyQuickSort()
    {
        this.arr=quickSort(arr,0,arr.length-1);
    }
    private int partition(int a[],int l,int h){
        int temp = a[h];
        int i=l-1;

        for(int j=l;j<=h-1;j++)
        {
            if(a[j]<=temp)
            {

                int thirdvariable = a[++i];
                a[i] = a[j];
                a[j] = thirdvariable;
            }
        }
        int thirdVariable = a[h];
        a[h]=a[i+1];
        a[i+1]=thirdVariable;
        return i+1;
    }
    private int[] quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;

    }

}
