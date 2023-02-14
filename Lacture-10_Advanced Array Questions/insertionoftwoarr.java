import java.util.ArrayList;

public class insertionoftwoarr {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
       ArrayList<Integer> ans = new ArrayList<Integer>();
        int i=0;
        int j=0;
		while (i < n && j < m)
        {
            // If both the elements are equal then we increase both the pointers.
            if (arr1.get(i).equals(arr2.get(j)))
            {
                ans.add(arr1.get(i));
                i++;
                j++;
            }

            // If element of first array is greater, increment 'j'
            else if (arr1.get(i) > arr2.get(j))
            {
                j++;
            }

            // Otherwise increment 'i'
            else
            {
                i++;
            }
        }

        // Return 'ans'
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(2);
        arr2.add(3);
        arr2.add(3);
        ArrayList<Integer> result=findArrayIntersection(arr1,arr1.size(),arr2,arr2.size());
        System.out.println(result);
    }
}
