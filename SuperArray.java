/* Zicheng Zhen
   APCS1 pd10
   HW39 -- Array of Steel / Is This An Introduction to ArrayLists?
   2015-12-01 */

/*****************************
 * SKELETON for
 * class SuperArray --  A wrapper class for an array. 
 * Maintains functionality:
 *  access value at index
 *  overwrite value at index
 * Adds functionality to std Java array:
 *  resizability
 *  ability to print meaningfully
 *****************************/

public class SuperArray {

    //~~~~~INSTANCE VARS~~~~~
    //underlying container, or "core" of this data structure:
    private int[] _data;

    //position of last meaningful value
    private int _lastPos;

    //size of this instance of SuperArray
    private int _size;

		
    //~~~~~METHODS~~~~~
    //default constructor – initializes 10-item array
    public SuperArray() {
	_data = new int[10];
	_lastPos = _data[_data.length-1];
	_size = _data.length;
    }
		
    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() {
	String storage = "[";
	for (int i : _data) {
	    storage += ("" + i) + ",";
	}
	if (storage.equals("[")) {return "[]";}
	return storage.substring(0,storage.length()-1) + "]";
    }
		
    //double capacity of this SuperArray
    private void expand() {
	int len = _data.length * 2;
	int[] copy = new int[len];
	for (int i = 0; i < len / 2; i++) {
	    copy[i] = _data[i];
	}
	_data = copy;
    }

		
    //accessor -- return value at specified index
    public int get( int index ) {
	return _data[index];
    }

		
    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) {
	int storage = _data[index];
	_data[index] = newVal;
	return storage;
    }


    //main method for testing
    public static void main( String[] args ) {
	SuperArray oof = new SuperArray();
	System.out.println(oof);
	oof.expand();
	System.out.println(oof);
	for (int i = 0; i < 20; i++) {
	    oof.set(i, i*i);
	}
	System.out.println(oof);
	System.out.println(oof.get(3) + oof.get(4)); // 25
	oof.expand();
	System.out.println(oof);
    }//end main
		
}//end class
