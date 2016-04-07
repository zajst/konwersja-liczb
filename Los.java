import java.util.Random;

public class Los {
	private String Dec;
	private String Hex;
	private static final String p = "0123456789ABCDEF";
	
	public Los() {
		Random r = new Random(); 
		int n = r.nextInt();
		Dec = Integer.toString(n);
		
		String result = "";
		while (n>0) {
			result = p.charAt(n % 16) + result;
			n /= 16;
		}
		Hex = result;
	}
	
	public void SetLos() {
		Random r = new Random(); 
		int n = r.nextInt(1000);
		Dec = Integer.toString(n);
		
		String result = "";
		while (n>0) {
			result = p.charAt(n % 16) + result;
			n /= 16;
		}
		Hex = result;
	}
	
	public String GetDec() {
		return Dec;
	}
	
	public String GetHex() {
		return Hex;
	}
	
}


