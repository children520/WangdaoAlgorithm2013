package Sort;

public class MergeSort {
    public static void Merge(int[] list,int low,int mid,int high){
        int firstListLength=mid-low+1;
        int twoListLength=high-mid;
        int first[]=new int[firstListLength];
        int two[]=new int[twoListLength];
        for (int i=0;i<firstListLength;i++){
            first[i]=list[low+i];
        }
        for (int j=0;j<twoListLength;j++){
            two[j]=list[mid+1+j];
        }
        int i=0,j=0;
        int k=low;
        while (i<firstListLength&&j<twoListLength){
            if (first[i]<=two[j]){
                list[k]=first[i];
                i++;
            }
            else {
                list[k]=two[j];
                j++;
            }
            k++;
        }
        while (i<firstListLength){
            list[k]=first[i];
            i++;
            k++;
        }
        while (j<twoListLength){
            list[k]=two[j];
            j++;
            k++;
        }
    }
    static void MergeSort(int[] list,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            MergeSort(list,low,mid);
            MergeSort(list,mid+1,high);
            Merge(list,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] list={424,523,231,64,32};
        MergeSort(list,0,list.length-1);
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
