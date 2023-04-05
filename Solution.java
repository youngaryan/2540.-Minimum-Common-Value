import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        TreeSet<Integer> list = new TreeSet<>();
        TreeSet<Integer> list1 = new TreeSet<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
            list2.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list1.add(nums2[i]);
            list2.add(nums2[i]);
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list1.contains(list2.get(i)) && list.contains(list2.get(i)))
                return list2.get(i);
        }
        return -1;
    }
}