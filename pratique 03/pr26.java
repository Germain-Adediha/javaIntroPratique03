//import java.util.HashMap; 
import java.util.ArrayList;
//import java.util.Arrays;
public class pr26 { 

   
   public static void main(String[] args) {
       int arr1[]={11,2,3,4,5,5};
       int arr2[]={11,1,1,2,3,4,5};

       int arr3[]={11,2,3,4,5,5};
       int arr4[]={11,2,3,4,5};
       System.out.println(same(arr1, arr2));
       System.out.println(same(arr3, arr4));
   }

	public static boolean same(int[] arr1, int[] arr2)
	{
		ArrayList<Integer> unique1 = new ArrayList<>();
		ArrayList<Integer> unique2 = new ArrayList<>();
		for(int i : arr1)
		{
			if(!unique1.contains(i))
			{
				unique1.add(i);
			}
		}
		for(int i : arr2)
		{
			if(!unique2.contains(i))
			{
				unique2.add(i);
			}
		}
		return unique1.size() == unique2.size();
	}

} 


