package chapter17;

public class Practice17_3 {
    
    public static void main (String[] args) {
        try {
            int i = Integer.parseInt ("三");
        } catch (NumberFormatException e) {
            System.out.println ("NumberFormatException例外をcatchしました");
            System.out.println ("――スタックトレース（ここから）――");
            e.printStackTrace ();
            System.out.println ("――スタックトレース（ここまで）――");
        }
    }
    
}
