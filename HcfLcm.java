
public class HcfLcm {
	
	/**
	 * @param num1
	 * @param num2
	 * @return Lowest Common Multiple of num1 & num2
	 */
	public int findLCM(int num1,int num2){
		return (num1*num2)/findHCF(num1,num2);
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return Highest Common Factor of num1 & num2
	 */
	public int findHCF(int num1,int num2){
        if (num1 == 0)
            return num2;
         
        return findHCF(num2%num1, num1);
	}
	
}
