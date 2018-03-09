
/**
 * U7 Assignment #3: Coin Class
 *
 * @author Caleb Yun
 * @version 3/8/2018
 */
//LISTING 4.2
//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
public class Coin implements Lockable
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;

    private int key;
    private boolean isLocked = false;

    //-----------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //-----------------------------------------------------------------
    public Coin ()
    {
        face = (int) (Math.random() * 2);
    }

    //-----------------------------------------------------------------
    //  Flips the coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip () throws Exception
    {
        if (!isLocked) {
            face = (int) (Math.random() * 2);
        } else {
            throw new Exception("Object is locked");
        }
    }

    //-----------------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    //-----------------------------------------------------------------
    public boolean isHeads () throws Exception
    {
        if (!isLocked) {
            return (face == HEADS);
        } else {
            throw new Exception("Object is locked");
        }
    }

    //-----------------------------------------------------------------
    //  Returns the current face of the coin as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        if (!isLocked) {
            String faceName;
            if (face == HEADS)
                faceName = "Heads";
            else
                faceName = "Tails";
            return faceName;
        } else {
            return null;
        }
    }
    
    /**
     * Sets the key.
     */
    public void setKey(int key)
    {
        this.key = key;
    }
    
    /**
     * Locks the object.
     */
    public void lock(int key)
    {
        isLocked = true;
    }
    
    /**
     * Unlocks the object.
     */
    public void unlock(int key)
    {
        isLocked = false;
    }

    /**
     * Checks if object is locked.
     */
    public boolean locked()
    {
        return isLocked;
    }
}
