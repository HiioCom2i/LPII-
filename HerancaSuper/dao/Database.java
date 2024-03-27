package dao;

import java.util.ArrayList;

import modelo.Item;

public class Database {
   
	private ArrayList<Item> itens;
    

    /**
     * Construct an empty Database.
     */
    public Database(){
        itens = new ArrayList<Item>();
    }

    public void addItem(Item it){
        itens.add(it);
        System.out.println("Item incluido!!!");
    }

    /**
     * Print a list of all currently stored CDs and DVDs to the
     * text terminal.
     */
    public void list(){
        // print list of itens
        for(Item it : itens) {
            it.print();
            System.out.println();   // empty line between items
        }
    }
}
