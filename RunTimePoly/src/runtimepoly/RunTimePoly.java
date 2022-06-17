
package runtimepoly;

import java.util.ArrayList;

public class RunTimePoly {

    public static void main(String[] args) {
//        Animals[] obj = new Animals[4];
        ArrayList<Animals> objects = new ArrayList<>();
        
        objects.add(new Donkey());
        objects.add(new Cat());
        objects.add(new Dog());
        objects.add(new Cow());
        
        speakAll(objects);
        
    }
    
    public static void speakAll(ArrayList<Animals> objects){ 
        for(Animals obj:objects){
            obj.speak();
        }
    }
    
}
