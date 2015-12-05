public interface ListInt {
    // add - adds value to end of the array
    // precond: int value - value to add to the end
    // postcond: 
    void add(int value);

    // add - adds value to the given index
    // precond: int index - index to add to
    //          int value - value to add
    // postcond: 
    void add(int index, int value);

    // remove - removes the value at the given index
    // precond: int index - index to remove the value from
    // postcond: 
    void remove(int index);

    // get - returns value at an index
    // precond: int index - index to retrieve
    // postcond: int - value at the specified index
    int get(int index);

    // set - changes value at index, returns old value
    // precond: int index - index to give value to
    //          int value - value to set
    // postcond: int - old value at index
    int set(int index, int value);

    // size - returns size of array data
    // precond: 
    // postcond: int - length of array data
    int size();
}
