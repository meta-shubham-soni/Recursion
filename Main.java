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
		    String input = sc.nextLine();
		    if(!InputValidator.isInt(input))
		    	continue;
		    in = Integer.parseInt(input);
		    
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
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		if(InputValidator.isInt(num1)&&InputValidator.isInt(num2)){
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			HcfLcm hlOps = new HcfLcm();
			System.out.println("LCM :-" + hlOps.findLCM(n1, n2));
			System.out.println("HCF :-" + hlOps.findHCF(n1, n2));
		}
	}
	
	public static void searchDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		String length = sc.nextLine();
		if(!InputValidator.isInt(length))
			return;
		int len = Integer.parseInt(length);
		int[] arr = new int[len];
		System.out.println("Enter the elements of array");
		for(int i=0;i<len;i++){
			String element = sc.nextLine();
			if(InputValidator.isInt(element)){
				arr[i] = Integer.parseInt(element);
			}
			else
				i--;
		}
		Search searchOps = new Search();
		HcfLcm hlOps = new HcfLcm();
		System.out.println("Enter key to search ");
		String key = sc.nextLine();
		if(!InputValidator.isInt(key))
			return;
		System.out.println("Binary Search result :-" + searchOps.binarySearch(arr, 0, arr.length, Integer.parseInt(key)));
		System.out.println("Linear Search result :-" + searchOps.linearSearch(arr, arr.length-1, 0, Integer.parseInt(key)));
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
