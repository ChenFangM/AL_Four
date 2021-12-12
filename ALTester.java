// Four {Fang, Kaitlin, Jing}
// apcs pd06
// lab02
// 2021-12-10

import java.util.*;

public class ALTester{

  public ArrayList _arrlist;

  public ALTester() {
    _arrlist = new ArrayList(23);
  }

  public int isSorted(){
    int result;
    for(int i = 0; i < 23; i++){
      result = this[i+1] - this[i];
      if (result < 0){
        return result;
      }
    }
    return result;
  }
  
  public void populate(){
    for(int i = 0; i < 23; i++){
      this.add(Math.random()*10);
    }
  }
  
  public static void main(String[] args) {
    ALTester test = new ALTester();
    test.populate();
    System.out.print(test.isSorted);
  }


}
