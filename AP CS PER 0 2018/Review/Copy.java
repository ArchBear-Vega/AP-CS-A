public class Copy
{
   public static void main(String[] args)
   {
      double x = 2.5;
      double y = -1.5;
      int m = 18;
      int n = 4;
      String s = "Hello";
      String t = "World";
      
      System.out.println(x + n * y - (x + n) * y);
      System.out.println(m / n + m % n);
      System.out.println(5 * x - n / 5);
      System.out.println(Math.sqrt(Math.sqrt(n)));
      System.out.println((int)Math.round(x));
      System.out.println((int)Math.round(x) + (int)Math.round(y));
      System.out.println(s + t);
      System.out.println(s + n);
      System.out.println(1 - (1 - (1 - (1 - (1 - n)))));
      System.out.println(s.substring(1, 3));
      System.out.println(s.length() + t.length());
   }
}