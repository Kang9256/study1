public class Program
{
    public static void main(String[] args) {
		int a=1;
        int b=1;

        if(a==b) {
            System.out.println("같다");
            System.out.println(System.identityHashCode(a));
            System.out.println(System.identityHashCode(b));
        } else {
            System.out.println("다르다");
        }


        String strA="1";
        String strB="1";

        if(strA==strB) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }


        String stringA = new String("1");
        String stringB = new String("1");

        if(stringA==stringB) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
	}
}