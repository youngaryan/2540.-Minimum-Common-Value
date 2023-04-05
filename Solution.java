import java.util.ArrayList;
import java.util.List;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        for (int j : nums1) {
            l.add(j);
        }
        for (int j : nums2) {
            m.add(j);
        }

        if (l.size()>m.size())
            for (int i = 0; i < l.size(); i++) {
                if (l.contains(m.get(i)))
                    return m.get(i);
            }
        else{
            for (int i = 0; i < m.size(); i++) {
                if (m.contains(l.get(i)))
                    return l.get(i);
            }
        }
        return -1;
    }
}