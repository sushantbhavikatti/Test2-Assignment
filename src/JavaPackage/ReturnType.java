package JavaPackage;

public class ReturnType {

	public static void main(String[] args) {
		
		ReturnType r = new ReturnType ();
		
		int k = r.add(5, 4);
		
		System.out.println(k);
		
	 int i = ReturnType.minus();
	
	System.out.println(i);
	
	}

	public int add(int i , int j){
		int k = i+j;
		return k;  
	}
	 public static int minus() {
		 
		 int i = 5;
		 
		 return i;
		 
	 }

}
