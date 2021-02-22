public class Fib  {
	public static void main(String[] args) {
	    int MAX_TERM_VALUE = 10000;
    			System.out.println("test");
    			int t1=0,t2=1,t3;
    			while(t1<=MAX_TERM_VALUE){
    				System.out.println(t1);
    				t3=t1+t2;
    				t1=t2;
    				t2=t3;
    	}
	
	}
}
