import java.util.ArrayList;
import java.util.Collections;

public class ArrayOrganizer {

    public ArrayList<Integer> concatAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
<<<<<<< HEAD
        Collections.sort(result, Collections.reverseOrder());
=======
        result.addAll(list3);
        Collections.sort(result);
>>>>>>> origin/feature-branch
        return result;
    }

}
