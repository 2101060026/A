public class B {
	public static int BP(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return arr[i];
			}
		}
		return 0;
		}
		public static void main(String[] args) 
		{
		int[] arr= {11,12,15,17,19};
		System.out.println(BP(arr));
		}

}
