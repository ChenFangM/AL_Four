// Four {Fang, Kaitlin, Jing}
// apcs pd06
// lab02
// 2021-12-10

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 **********************************************/

import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>(10);
  }

  public String toString()
  {
    if (_data.size() == 0) {
      return "[]";
    } 
    String string = "[";
    for (int x : _data) {
      string += x + ",";
    }
    return string.substring(0, string.length()-1) + "]";
  }

  public Integer remove( int i )
  {
    return _data.remove(i);
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    for (int i = 0; i < _data.size(); i++) {
      if (newVal < _data.get(i)) {
        _data.add(i, newVal);
        return;
      }
    }
    _data.add(newVal); // Adds the value at the end if there doesn't exist a value larger than newVal
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  
  public void addBinary(Integer newVal)
  {
    int midInd = 0;
    int midVal = 0;
    int startInd = 0;
    int endInd = _data.size();
    

    if (endInd == 0) {
      endInd = 0;
    }

    while (startInd != endInd) {
      midInd = (startInd + endInd) / 2;
      midVal = _data.get(midInd);

      if (midVal < newVal) {
        startInd = midInd + 1;
      }
      if (midVal >= newVal) {
        endInd = midInd;
      }
      if (midVal == newVal) {
        break;
      }
    }

    _data.add(endInd, newVal);

  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
 
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    
    // testing binary search
    Franz = new OrderedArrayList();
    Franz.addBinary(2);
    Franz.addBinary(3);
    Franz.addBinary(1);
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );


  }//end main()

}//end class OrderedArrayList

