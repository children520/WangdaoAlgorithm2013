package Sort;
/*
未完成
 */
public class InsertSort {
    static void InsertSort(int[] notSortList){
        for(int i=1;i<notSortList.length;i++){
            int start=notSortList[i];
            int j=i-1;
            while (j>=0&&start<notSortList[j]){
                notSortList[j+1]=notSortList[j];
                j--;
            }
            notSortList[j+1]=start;
        }
    }
    public static void main(String[] args) {
        int[] list={4,23,52,321,35,53,2};
        InsertSort(list);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }

    }
}
