import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class leetcode {
    public static void main(String[] args) {

    }
    public static List<List<String>> accountsMerge( List<List<String>> accounts) {
        ArrayList<ArrayList<String>> lists=new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (int j = 0; j < accounts.size(); j++) {
            for (int i = 1; i < accounts.get(j).size(); i++) {
                if(map.containsKey(accounts.get(j).get(i))){
                    map.put(accounts.get(j).get(i), accounts.get(j).get(0));
                }else {
                    //lists.add(accounts.get(j));

                }

            }
            System.out.print(map.toString());

        }
        return null;
    }
}
