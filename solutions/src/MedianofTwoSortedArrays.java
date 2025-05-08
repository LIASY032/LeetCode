/**
 * @author: Jack Liang
 * @date: 4/5/2025
 */

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        int m = nums1.length;
        int n = nums2.length;
        int median = (m + n) / 2;
        int longest = m > n ? m : n;
        int currentM = 0;
        int currentN = 0;
        int count = 0;
        double output = 0;
        for (int i = 0; i < longest; i++) {

            if ((count == median) || ((m + n) % 2 == 0 && count == median - 1)) {
                if (nums1[currentM] > nums2[currentN]) {
                    output += nums2[currentN];
                    currentN++;
                } else {
                    output += nums1[currentM];
                    currentM++;
                }

                if ((m + n) % 2 == 0) {
                    if (currentN < n && currentM < m) {
                        if (nums1[currentM] > nums2[currentN]) {
                            output += nums2[currentN];
                        } else {
                            output += nums1[currentM];
                        }
                    } else if (currentN < n) {
                        output += nums2[currentN];
                    } else if (currentM < m) {
                        output += nums1[currentM];
                    }
                    output /= 2;
                }


                break;
            }


            if (i < m && i < n) {
                if (nums1[i] < nums2[i]) {
                    currentM++;
                } else {
                    currentN++;
                }
            } else if (i < m) {
                currentM++;
            } else if (i < n) {
                currentN++;
            }
            count++;

        }
        return output;
    }
}
