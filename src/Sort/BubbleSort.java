package Sort;

public class BubbleSort {
    static void BubbleSort(int[] notSortList){
        for(int i=0;i<notSortList.length;i++){
            for (int j=i+1;j<notSortList.length;j++){
                if(notSortList[i]>notSortList[j]){
                    //System.out.println(notSortList[i]+" "+notSortList[j]);
                    int temp=notSortList[i];
                    notSortList[i]=notSortList[j];
                    notSortList[j]=temp;

                    //System.out.println(notSortList[i]+" "+notSortList[j]);
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] list={4,23,52,321,35,53,2};
        BubbleSort(list);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }

    }

}
