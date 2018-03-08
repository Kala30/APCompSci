
/**
 * U7 Assignment #3: Lockable Interface
 *
 * @author Caleb Yun
 * @version 3/8/2018
 */
public interface Lockable
{
    /**
     * Establishes the key.
     *
     * @param  key Key as an integer.
     */
    void setKey(int key);
    
    /**
     * Locks the object only if key is correct.
     * 
     * @param  key Key as an integer.
     */
    void lock(int key);
    
    /**
     * Unlocks the object only if key is correct.
     * 
     * @param  key Key as an integer.
     */
    void unlock(int key);
    
    /**
     * Checks if object is locked.
     * 
     * @return   true -> locked ; false -> unlocked
     */
    boolean locked();
    
}
