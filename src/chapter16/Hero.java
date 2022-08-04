package chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hero {
    private String name;
    
    public Hero (String name) {
        this.name = name;
    }
    
    public String getName () {
        return this.name;
    }
    
    public static void main (String[] args) {
        
        Hero h1 = new Hero ("斎藤");
        Hero h2 = new Hero ("鈴木");
        
        ArrayList<Hero> heroes = new ArrayList<Hero> ();
        heroes.add (h1);
        heroes.add (h2);
        
        for (Hero hero : heroes) {
            System.out.println (hero.getName ());
        }
        
        Map<Hero, Integer> heroes2 = new HashMap<Hero, Integer> ();
        heroes2.put (h1, 3);
        heroes2.put (h2, 7);
        
        for (Hero key : heroes2.keySet ()) {
            int value = heroes2.get (key);
            System.out.println (key.getName () + "が倒した数=" + value);
        }
    }
}
