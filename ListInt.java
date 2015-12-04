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

    // add - adds value to end of the array
    // precond: value - value to add to the end
    // postcond: int - returns value of array's index value
    int get(int index);

    // add - adds value to end of the array
    // precond: value - value to add to the end
    // postcond: 
    int set(int index, int value);

    // add - adds value to end of the array
    // precond: value - value to add to the end
    // postcond: 
    int size();
}
