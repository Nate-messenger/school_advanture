/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author millc9988
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
    private String NorthNext;
    private String SouthNext;
    private String EastNext;
    private String WestNext;
    private int nNext;
    private int sNext;
    private int eNext;
    private int wNext;
    private location[] array;
    private location next;

    public location(String place) {
        this.place = place;
    }

    public void setNorth(String north, String picture, String move) {
        //N E S W
        this.North = north;
        this.NorthP = picture;
        if (move.matches("true")) {
            NorthMove = false;
        } else {
            NorthMove = true;
        }
    }

    public void setEast(String north, String picture, String move) {
        //N E S W
        this.East = north;
        this.EastP = picture;
        if (move.matches("true")) {
            EastMove = false;
        } else {
            EastMove = true;
        }
    }

    public void setSouth(String north, String picture, String move) {
        //N E S W
        this.South = north;
        this.SouthP = picture;
        if (move.matches("true")) {
            SouthMove = false;
        } else {
            SouthMove = true;
        }
    }

    public void setWest(String north, String picture, String move) {
        //N E S W
        this.West = north;
        this.WestP = picture;
        if (move.matches("true")) {
            WestMove = false;
        } else {
            WestMove = true;
        }

    }

    public void setArray(location[] meme) {
        array = meme;
    }

    public boolean isClear(int direction) {
        if (direction == 0) {
            if (NorthMove) {
                return true;
            } else {
                return false;
            }
        } else if (direction == 1) {
            if (EastMove) {
                return true;
            } else {
                return false;
            }
        } else if (direction == 2) {
            if (SouthMove) {
                return true;
            } else {
                return false;
            }
        } else if (direction == 3) {
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

    public location getNext(int dir) {
        if (dir == 0 && NorthMove) {
            for (int i = 0; i < array.length; i++) {
                if ((NorthNext.compareTo(array[i].place)) == 0) {
                    return array[i];
                }
            }
        } else if (dir == 1 && EastMove) {
            for (int i = 0; i < array.length; i++) {
                if ((EastNext.compareTo(array[i].place)) == 0) {
                    return array[i];
                }
            }
        } else if (dir == 2 && SouthMove) {
            for (int i = 0; i < array.length; i++) {
                if ((WestNext.compareTo(array[i].place)) == 0) {
                    return array[i];
                }
            }
        } else if (dir == 3 && WestMove) {
            for (int i = 0; i < array.length; i++) {
                if ((SouthNext.compareTo(array[i].place)) == 0) {
                    return array[i];
                }
            }
        }
        return null;
    }

    public int toInt(String meme) {
        if (meme.compareTo("N") == 0) {
            return 0;
        } else if (meme.compareTo("E") == 0) {
            return 1;
        } else if (meme.compareTo("S") == 0) {
            return 2;
        } else if (meme.compareTo("W") == 0) {
            return 3;
        }
        return 4;
    }

    public void setNext(String next, int dir, String face) {
        if (dir == 0 && NorthMove) {
            NorthNext = next;
            nNext = toInt(face);
        } else if (dir == 1 && EastMove) {
            eNext = toInt(face);
            EastNext = next;
        } else if (dir == 2 && SouthMove) {
            sNext = toInt(face);
            SouthNext = next;
        } else if (dir == 3 && WestMove) {
            wNext = toInt(face);
            WestNext = next;
        }

    }

    @Override
    public String toString() {
        String format = this.place + "\n";
        format += "Img: " + this.North + " " + this.NorthP + this.isClear(0) + "\n";
        format += "Img: " + this.East + " " + this.EastP + this.isClear(1) + "\n";
        format += "Img: " + this.South + " " + this.SouthP + this.isClear(2) + "\n";
        format += "Img: " + this.West + " " + this.WestP + this.isClear(3) + "\n";
        return format;
    }
}