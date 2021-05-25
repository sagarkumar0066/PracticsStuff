import java.io.*;
import java.util.*;

class csString 
{
	public static void main(String args[])
	{
		String arr[] = { "grace", "graceful",
						"disgraceful","gracefully" };
		String stems = findstem(arr);
		System.out.println(stems);
	}
	
	public static String findstem(String arr[])
	{
		int n = arr.length; // 4

		String s = arr[0];  // grace
		int len = s.length(); // 5

		String res = "";

//		for (int i = 0; i < len; i++) 
//		{
		   int i =0;
			//System.out.println("i : "+i);
			for (int j = i + 1; j <= len; j++) 
			{

				String stem = s.substring(i, j);
				System.out.println("stems : "+stem);
				int k = 1;
				for (k = 1; k < n; k++)
				{
					System.out.println("checking : "+k);
					if (!arr[k].contains(stem))
						//System.out.println("not contains : "+arr[k]);
						break;
				
			     }
				// If current substring is present in
				// all strings and its length is greater
				// than current result
				System.out.println("k : "+k+" n : "+n);
				if (k == n && res.length() < stem.length())
				{
					//System.out.println("res len : "+res.length()+"stem len : "+stem.length());
					res = stem;
					//System.out.println("result : "+res);
				}
			}
		//}

		return res;
	}

}
