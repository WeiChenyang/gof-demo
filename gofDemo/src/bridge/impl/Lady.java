package bridge.impl;

import bridge.interfaces.Clothing;
import bridge.interfaces.Person;

public class Lady extends Person {  
    public Lady() {  
        setType("Ů��");  
    }  
      
    public void dress() {  
        Clothing clothing = getClothing();  
        clothing.personDressCLoth(this);
    }  
}