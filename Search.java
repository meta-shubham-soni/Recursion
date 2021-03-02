
public class Search {
	
	/**
	 * @param arr array of all elements
	 * @param low starting index of array to lookup
	 * @param high last index of array to lookup
	 * @param key number to find
	 * @return index if found else -1
	 */
	public int binarySearch(int[] arr,int low,int high,int key){
		
		if(low <= high){
			int mid = (low + high)/2;
			
			if(arr[mid] == key){
				return mid;
			}
			
			else if(arr[mid] > key){
				return binarySearch(arr,low,mid-1,key);
			}
			
			return binarySearch(arr,mid+1,high,key);
		}
		
		return -1;
	}
	
	/**
	 * @param arr array of all elements
	 * @param len length of array
	 * @param currentInd index where we are examining
	 * @param key number to lookup
	 * @return index if found else -1
	 */
	public int linearSearch(int[] arr,int len,int currentInd,int key){
		if(currentInd >= len)
			return -1;
		if(arr[currentInd] == key)
			return currentInd;
		return linearSearch(arr,len,currentInd+1,key);
	}
}
