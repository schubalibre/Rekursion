
public class Als18erZahl {
	public static void main(String[] args) {
		System.out.println(als18erZahl(-363));
	}
	

	
	static String als18erZahl(final int n){
		
		final String[] TAB = {
	         "0","1","2","3","4","5","6","7","8",
	         "9","A","B","C","D","E","F","G","H",
	         "I","J","K","L","M","N","O","P","Q",
	         "R","S","T","U","V","W","X","Y","Z",
	      };

		if(n >= -17 && n <= 17){
			String minus = "";
			if(n < 0){
				minus = "-";
			}
			return minus + TAB[Math.abs(n)];
		}

		return als18erZahl(n/18) + TAB[Math.abs(n % 18)];
	}
}
