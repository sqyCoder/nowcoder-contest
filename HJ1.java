import java.util.Scanner;
public class HJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        StringBuilder sb=new StringBuilder(s);
        int last=sb.lastIndexOf(" ");
        int a=sb.length()-last-1;
        System.out.println(a);
    }
}