# AL_Four

## Roster: Fang Chen, Kaitlin Ho, Jing Yi Feng

# ALTester

##### ALTester contains the static void methods isSorted() and populate() to test the orderedness of an ArrayList and an OrderedArrayList. In main, populate() populates an ArrayList<Integer> with 23 Integers of values between 0 and 39 using a 'for' loop and then calls the method isSorted() to print its return int. The method isSorted() returns an int value denoting whether or not the elements of the array (with an index less than the size) is sorted in ascending values. If it returns 0 or 1, the array is sorted in ascending values; if it returns -1, the opposite is true. The same is done for an OrderedArrayList. Basically every time, the terminal will print a -1, followed by either a 0 or 1.

# OrderedArrayList

[List of methods]
#### Add
* Given a sorted array in ascending order, use linear search to go through each element until the value is more than the last element and less than the next element. Shift everything to the right one and add-at-index. Takes the index of where you want to add the value as parameter.

#### Remove
* Removes the integer at the given index. Each element to the right of the item removed (one more than) is shifted one left. Takes postiton you want the item to be removed as paramter. Returns the value that was removed from the array.

#### Size
* Returns the size of OrderedArrayList.

#### Get
* Takes the index as the parameter and returns the value stored at that index.
