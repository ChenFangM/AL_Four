// Four {Fang, Kaitlin, Jing}
// apcs pd06
// lab02
// 2021-12-10

import java.util.*;

public class ALTester{

  public ArrayList<Integer> _arrlist;

  public ALTester() {
    _arrlist = new ArrayList<Integer>(23);
  }

  public int isSorted(){
    int result = 0;
    for(int i = 0; i < 23; i++){
      result = _arrlist.get(i+1).compareTo(_arrlist.get(i));
      if (result < 0){
        return result;
      }
    }
    return result;
  }
  
  public void populate(){
    for(int i = 0; i < 23; i++) {
      Integer num = new Integer((int) (Math.random() * 10));
      _arrlist.add(num);
    }
  }
  
  public static void main(String[] args) {
    ALTester test = new ALTester();
    test.populate();
    System.out.print(test.isSorted());
  }
  
  /*
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
