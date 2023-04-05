import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.List;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> list = new HashSet<>();
        HashSet<Integer> list1 = new HashSet<>();
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