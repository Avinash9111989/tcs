package JavaNewFeatures;
@FunctionalInterface
interface Addable{
	int add(int a,int b);
	 static void abc() {
		System.out.println("xyz");
	}
}
public class LambdaExpression1{
public static void main(String[] arg) {
	Addable ad1=(a,b)->(a+b);
	System.out.println(ad1.add(10,20));
	
	Addable ad2= new Addable() {
		public int add(int a,int b) {
			return a+b;
		}
	};
	System.out.println(ad2.add(10,20));
}
}