class Duplicate1 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,1,3};
		boolean found = false;
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					found = true;
				}
			}
		}
		System.out.println(found);
	}