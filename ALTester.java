// TNPG: Four {Fang, Kaitlin, Jing}
// APCS pd06
// lab02
// 2021-12-10
// time spent: 2 hrs

/*
QCC:
- What is <Integer> really? Is it similar to typecasting but for class variable types? 
- Why do we need an addBinary when we already have an addLinear?
DISCO:
- `break` exits the for loop, while `return` ends the for loop and the method

*/

import java.util.*;

public class ALTester{

  public static int isSorted(ArrayList<Integer> _data){
    int result = 0;
    for(int i = 0; i < _data.size() - 1; i++){
      result = _data.get(i+1).compareTo(_data.get(i));
      if (result < 0){
        return result;
      }
    }
    return result;
  }

  public static int isSorted(OrderedArrayList _data){
    int result = 0;
    for(int i = 0; i < _data.size() - 1; i++){
      result = _data.get(i+1).compareTo(_data.get(i));
      if (result < 0){
        return result;
      }
    }
    return result;
  }
  
  public static void populate(ArrayList<Integer> notordered){
    for(int i = 0; i < 23; i++) {
      Integer num = new Integer((int) (Math.random() * 40));
      notordered.add(num);
    }
    System.out.println(isSorted(notordered));
  }

  public static void populate(OrderedArrayList ordered) {
    for(int i = 0; i < 23; i++) {
      Integer num = new Integer((int) (Math.random() * 40));
      ordered.addBinary(num);
    }
    System.out.println(isSorted(ordered));
  }
  
  public static void main(String[] args) {
    ArrayList<Integer> baseline = new ArrayList<Integer>();
    populate(baseline);

    OrderedArrayList test = new OrderedArrayList();
    populate(test);    

  }
  
  /*
  Error message in terminal
  When ArrayList was used instead of ArrayList<Integer>
  ---
  ALTester.java:10: warning: [rawtypes] found raw type: ArrayList
   public ArrayList _arrlist;      
   missing type arguments for generic class ArrayList<E>
   where E is a type-variable:
    E extends Object declared in class ArrayList
    
  ALTester.java:13: warning: [rawtypes] found raw type: ArrayList
    _arrlist = new ArrayList(23);           
    missing type arguments for generic class ArrayList<E>
    where E is a type-variable:
      E extends Object declared in class ArrayList
      
  ALTester.java:29: warning: [unchecked] unchecked call to add(E) as a member of the raw type ArrayList
        _arrlist.add(Math.random()*10);
    where E is a type-variable:
      E extends Object declared in class ArrayList
      
  3 warnings
  */
  


}
