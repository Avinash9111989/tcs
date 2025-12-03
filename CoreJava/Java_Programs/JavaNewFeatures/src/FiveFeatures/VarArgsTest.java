package FiveFeatures;

public class VarArgsTest {

	public static void main(String... args) {
		// TODO Auto-generated method stub
       System.out.println("hello");
       method(5,8);
       method(4);
	}
  static void method( int...strings) {
	   System.out.println("in the ,");
   }
  static void method(int a,int b) {
	 System.out.println("inside"); 
  }
}
