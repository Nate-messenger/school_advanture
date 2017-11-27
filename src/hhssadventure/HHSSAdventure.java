/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader file = null;
        try {
            URL url = HHSSAdventure.class.getResource("pics.txt");
            System.out.println(url);
            //file reader
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            //handle any errors
            //print out the red error message 
            e.printStackTrace();
//            exits out the program
            System.exit(0);
        }

        Scanner in = new Scanner(file);
        
        int locNum = in.nextInt();
        location[] places = new location[locNum];
        
        for (int i = 0; i < places.length; i++) {
            in.nextLine();
            location l = new location(in.next());
            l.setNorth(in.next(), in.next() , in.next());
            if((l.isClear(0))==true){
                l.setNext(in.next(),0,in.next());
            }
            in.nextLine();
            l.setEast(in.next(), in.next() ,in.next());
            in.nextLine();
             l.setSouth(in.next(), in.next(), in.next());
            in.nextLine();
            l.setWest(in.next(), in.next(),in.next());
            places[i] = l;
        }
        for (int i = 0; i < places.length; i++) {
            places[i].setArray(places);
        }
        for (int i = 0; i < places.length; i++) {
            System.out.println(places[i]);
        }
    }
}
