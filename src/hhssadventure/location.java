/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class location {
    private String north;
    private String east;
    private String south;
    private String west;
    public location (FileReader file, String spot){
        Scanner in = new Scanner(file);
        int i = 0;
        System.out.println(in.nextLine());
        while(spot!=in.nextLine()){
            System.out.println(in.nextLine());
            in.nextLine();
        }
        in.nextLine();
        in.next();
        north = in.next(); 
        east = in.next(); 
        south = in.next(); 
        west = in.next(); 
        System.out.println(north+east+south+west);
    }
}
