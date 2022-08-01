package chapter15;

public class GenerateIntegers1to100 {
    
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i <= 100; i++) {
            sb.append (i + ",");
        }
        String s = sb.toString ();
        System.out.println (s);
        
        String[] a = s.split (",");
        
        for (int i = 0; i < a.length; i++) {
            System.out.println (a[i]);
        }
    }
}
