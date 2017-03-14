package pacman;

public class pacman {
       int x, y; 
       private int counter=0;
     

    public void setAwal() {
        x = 1;
        y = 1;
    }

    public void setKiri() {
        int xCopy = x;
        xCopy--;
        if (y == 0 || y == 9 || xCopy == 0 || xCopy == 9 || y == 2 && xCopy == 1 || y == 2 && xCopy == 2 || y == 6 && xCopy == 8 || y == 6 && xCopy == 7 || y == 6 && xCopy == 6 || y == 6 && xCopy == 5)
            xCopy++;
        else{
        x = x - 1;
        counter++;
        }
    }

    public void setKanan() {
        int xCopy = x;
        xCopy++;
        if (y == 0 || y == 9 || xCopy == 0 || xCopy == 9 || y == 2 && xCopy == 1 || y == 2 && xCopy == 2 || y == 6 && xCopy == 8 || y == 6 && xCopy == 7 || y == 6 && xCopy == 6 || y == 6 && xCopy == 5)
            xCopy--;
        else{
            x = x + 1;
            counter++;
        }
    }

    public void setNaik() {
        int yCopy = y;
        yCopy--;
        if (yCopy == 0 || yCopy == 9 || x == 0 || x == 9 || yCopy == 2 && x == 1 || yCopy == 2 && x == 2 || yCopy == 6 && x == 8 || yCopy == 6 && x == 7 || yCopy == 6 && x == 6 || yCopy == 6 && x == 5)
            yCopy++;
        else{
        y = y - 1;
        counter++;
        }
    }

    public void setTurun() {
        int yCopy = y;
        yCopy++;
        if (yCopy == 0 || yCopy == 9 || x == 0 || x == 9 || yCopy == 2 && x == 1 || yCopy == 2 && x == 2 || yCopy == 6 && x == 8 || yCopy == 6 && x == 7 || yCopy == 6 && x == 6 || yCopy == 6 && x == 5)
            yCopy--;
        else{
        y = y + 1;
        counter++;
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y; 
    }
    public int getCounter() {
        return counter;
}
}
