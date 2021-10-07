public class Main {
    private static final String WALL = "P";
    private static final String FLOOR = ".";
    private static final String AIR = "#";
    private static final String SAND = "~";
    private static final String RAMP = "R";
    private static final String FRTFC = "F";

    public static void circle (int inXBound, int inYBound, int radius)
    {
        int x = 1, y = 1;
        int yBound = inYBound; int xBound = inXBound;
        int centY = (yBound + 1)/2, centX = (xBound + 1)/2;
        while(y <= yBound)
        {
            while(x <= xBound)
            {
                if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < radius) { System.out.print(AIR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
    }
    public static void zStatement(int inZ) { System.out.println("Z=" + inZ + " (must leave this line here)");}
    public static void main(String[] args){
        int z = 0;
        int x = 1, y = 1;
        int yBound = 144; int xBound = 144;
        int radius = 30;
        int centY = (yBound)/2, centX = (xBound)/2;
        System.out.println("Z=0, Lowest Level (must leave this line here)");
        while(y <= yBound)
        {
            while(x <= xBound)
            {
                if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < radius) { System.out.print(SAND); }
                else if((x >= centX + 20 && x <= centX + 40 && y >= centX - 10 && y <= centX + 10) || (y >= centX + 20 && y <= centX + 40 &&  x >= centX - 10 && x <= centX + 10) || (x >= centX - 40 && x <= centX - 20 &&  y >= centX - 10 && y <= centX + 10) ||  (y >= centX - 40 && y <= centX - 20 && x >= centX - 10 && x <= centX + 10)) { System.out.print(SAND); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
        x = 1; y = 1;
        z++;
        zStatement(z);
        int n = 39;
        while(y <= yBound)
        {
            while(x <= xBound)
            {//(x == centX && y == 42) || (x == 42 && y == centX) || (x ==150 && y == centX) ||
                if ((x == centX && y == centX - n) || (y == centX && x == centX - n) || (x == centX && y == centX + n) || (y == centX && x == centX + n)) { System.out.print(RAMP); }
                else if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n-9) { System.out.print(AIR); }
                else if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n-7) { System.out.print(FRTFC); }
                else if (Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n+1) { System.out.print(FLOOR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
        x = 1; y = 1;
        z++;
        zStatement(z);
        n = 49;
        while(y <= yBound)
        {
            while(x <= xBound)
            {//(x == centX && y == 42) || (x == 42 && y == centX) || (x ==150 && y == centX) ||
                if ((x == centX && y == centX - n) || (y == centX && x == centX - n) || (x == centX && y == centX + n) || (y == centX && x == centX + n)) { System.out.print(RAMP); }
                else if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n-9) { System.out.print(AIR); }
                else if (Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n+1) { System.out.print(FLOOR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
        x = 1; y = 1;
        z++;
        zStatement(z);
        n = 59;
        while(y <= yBound)
        {
            while(x <= xBound)
            {//(x == centX && y == 42) || (x == 42 && y == centX) || (x ==150 && y == centX) ||
                if ((x == centX && y == centX - n) || (y == centX && x == centX - n) || (x == centX && y == centX + n) || (y == centX && x == centX + n)) { System.out.print(RAMP); }
                else if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n-9) { System.out.print(AIR); }
                else if (Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n+1) { System.out.print(FLOOR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
        x = 1; y = 1;
        z++;
        zStatement(z);
        n = 69;
        while(y <= yBound)
        {
            while(x <= xBound)
            {//(x == centX && y == 42) || (x == 42 && y == centX) || (x ==150 && y == centX) ||
                if ((x == centX && y == centX - n) || (y == centX && x == centX - n) || (x == centX && y == centX + n) || (y == centX && x == centX + n)) { System.out.print(RAMP); }
                else if(Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n-9) { System.out.print(AIR); }
                else if (Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n+1) { System.out.print(FLOOR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
        x = 1; y = 1;
        z++;
        System.out.println("Z=5 (must leave this line here)");
        while(y <= yBound)
        {
            while(x <= xBound)
            {//(x == centX && y == 42) || (x == 42 && y == centX) || (x ==150 && y == centX) ||
                if (Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n+1) { System.out.print(AIR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
        x = 1; y = 1;
        z++;
        System.out.println("Z=6 (must leave this line here)");
        while(y <= yBound)
        {
            while(x <= xBound)
            {//(x == centX && y == 42) || (x == 42 && y == centX) || (x ==150 && y == centX) ||
                if (Math.sqrt( Math.pow(x - centX , 2) + Math.pow(y - centY, 2) ) < n+1) { System.out.print(AIR); }
                else { System.out.print(WALL); }
                x++;
            }
            y++;
            x = 1;
            System.out.println("");
        }
    }


}
