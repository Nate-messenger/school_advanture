/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author nate
 */
public class location {

    private String place;

    private String North;
    private String East;
    private String South;
    private String West;

    private String NorthP;
    private String EastP;
    private String SouthP;
    private String WestP;

    private boolean NorthMove;
    private boolean EastMove;
    private boolean SouthMove;
    private boolean WestMove;

    public String next;

    public location(String place) {
        this.place = place;
    }

    public void setNorth(String north, String picture, String move) {
        //N E S W
        this.North = north;
        this.NorthP = picture;
        if (move.equals("true")) {
            NorthMove = true;
        } else {
            NorthMove = false;
        }
    }

    public void setEast(String north, String picture, String move) {
        //N E S W
        this.East = north;
        this.EastP = picture;
        if (move.equals("true")) {
            EastMove = true;
        } else {
            EastMove = false;
        }
    }

    public void setSouth(String north, String picture, String move) {
        //N E S W
        this.South = north;
        this.SouthP = picture;
        if (move.equals("true")) {
            SouthMove = true;
        } else {
            SouthMove = false;
        }
    }

    public void setWest(String north, String picture, String move) {
        //N E S W
        this.West = north;
        this.WestP = picture;
        if (move.equals("true")) {
            WestMove = true;
        } else {
            WestMove = false;
        }

    }

    public boolean isClear(int direction) {
        if (direction == 0) {
            if (NorthMove) {
                return true;
            } else {
                return false;
            }
        }
        if (direction == 1) {
            if (EastMove) {
                return true;
            } else {
                return false;
            }
        }
        if (direction == 2) {
            if (SouthMove) {
                return true;
            } else {
                return false;
            }
        }
        if (direction == 3) {
            if (WestMove) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String getNorth() {
        return NorthP;
    }

    public String getEast() {
        return EastP;
    }

    public String getSouth() {
        return SouthP;
    }

    public String getWest() {
        return WestP;
    }

    public String getPlace() {
        return this.place;
    }

    @Override
    public String toString() {
        String format = this.place + "\n";
        format += "Img: " + this.North + " " + this.NorthP + " " + isClear(0) + "\n";
        format += "Img: " + this.East + " " + this.EastP + " " + isClear(1) + "\n";
        format += "Img: " + this.South + " " + this.SouthP + " " + isClear(2) + "\n";
        format += "Img: " + this.West + " " + this.WestP + " " + isClear(3) + "\n";

        return format;
    }
}
