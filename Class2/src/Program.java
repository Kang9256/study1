public class Program
{
    public static void main(String[] args) {
		int a=1;
        int b=1;

        if(a==b) {
            System.out.println("����");
            System.out.println(System.identityHashCode(a));
            System.out.println(System.identityHashCode(b));
        } else {
            System.out.println("�ٸ���");
        }


        String strA="1";
        String strB="1";

        if(strA==strB) {
            System.out.println("����");
        } else {
            System.out.println("�ٸ���");
        }


        String stringA = new String("1");
        String stringB = new String("1");

        if(stringA==stringB) {
            System.out.println("����");
        } else {
            System.out.println("�ٸ���");
        }
	}
}