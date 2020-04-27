package Sort;

public class SelectSort {
    public static void selectSort(int[] list){
        for(int i=0;i<list.length;i++){
            int index=i;
            int min=list[index];
            for(int j=i+1;j<list.length-1;j++){
                if(list[j]<min){
                    min=list[j];
                    index=j;
                }
            }
            int temp=list[index];
            list[index]=list[i];
            list[i]=temp;


        }
    }

    public static void main(String[] args) {
        int[] list={3,42,25,24,52};
        selectSort(list);
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
