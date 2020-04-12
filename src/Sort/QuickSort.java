package Sort;

public class QuickSort {
    static void QuickSort(int[] list,int low,int high){
        int i=low;
        int j=high;
        if(low>=high||list==null){
            return;
        }
        int mid=(low+high)/2;
        while (i<=j){
            while (list[i]<list[mid]){
                i++;
            }
            while (list[j]>list[mid]){
                j--;
            }
            if(i<j){
                int temp=list[i];
                list[i]=list[j];
                list[j]=temp;
                i++;
                j--;
            }else if(i==j){
                i++;
            }
        }
        QuickSort(list,low,j);
        QuickSort(list,i,high);
    }
    public static void main(String[] args) {
        int[] list={4,23,52,321,35,53,2};
        QuickSort(list,0,list.length-1);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }

    }
}
