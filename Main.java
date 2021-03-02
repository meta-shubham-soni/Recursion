import java.util.Scanner;


public class Main {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);		
		boolean flag = true;

		while(flag == true){
		    int in;

		    System.out.println("1. HCFLCM Driver");
		    System.out.println("2. Search Driver");
		    System.out.println("3. NQueens Driver");
		    System.out.println("4. Knight-Tour Driver");
		    System.out.println("5. Exit");
		    
		    in = sc.nextInt();
		    
		    if(in == 1){
		    	hcfLcmDriver();
		    }
		    
		    else if(in == 2){
		    	searchDriver();
		    }
		    
		    else if(in == 3){
		    	nQueensDriver();
		    }
		    
		    else if(in == 4){
		    	knightDriver();
		    }
		   
		    else if(in == 5){		        
		    	flag = false;
		    }
		    
		    else {
		    	System.out.println("Enter valid choice");
		    }
		}
	}

	public static void hcfLcmDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		HcfLcm hlOps = new HcfLcm();
		System.out.println("LCM :-" + hlOps.findLCM(num1, num2));
		System.out.println("HCF :-" + hlOps.findHCF(num1, num2));
	}
	
	public static void searchDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++){
			arr[i] = sc.nextInt();
		}
		Search searchOps = new Search();
		HcfLcm hlOps = new HcfLcm();
		System.out.println("Enter key to search ");
		int key = sc.nextInt();
		System.out.println("Binary Search result :-" + searchOps.binarySearch(arr, 0, arr.length, key));
		System.out.println("Linear Search result :-" + searchOps.linearSearch(arr, 0, arr.length, key));
	}
	
	public static void nQueensDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of queens to settle");
		int noOfQueens = sc.nextInt();
		
		NQueens nQOps = new NQueens();
		nQOps.solveNQ(noOfQueens);

	}
	
	public static void knightDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int sizeOfArr = sc.nextInt();
		
		KnightTour.solveKT( sizeOfArr);
	}
}
