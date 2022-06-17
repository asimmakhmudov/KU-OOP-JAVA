/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzadelivery;

import java.util.ArrayList;

public class Sifaris {
    ArrayList<Addition> adds = new ArrayList<>();
    
    public void add(Addition add) {
        this.adds.add(add);
    }
    public int getCost() {
        int res = Pizza.cost;
        for(Addition add : adds) {
            res += add.getCost();
        }
        return res;
    }
}
