// Four {Fang, Kaitlin, Jing}
// apcs pd06
// lab02
// 2021-12-10

public class ALTester implements OrderedArrayList{

  public ArrayList _arrlist;

  public ALTester() {
    _arr = new ArrayList(23);
  }

  public int isSorted(){
    int result;
    for(int i = 0; i < _arrlist.size; i++){
      result = this.get(i+1) - this.get(i);
      if (result < 0){
        return result;
      }
    }
    return result;
  }
  
  public void populate(){
    for(int i = 0; i < _arrlist.size; i++){
      this.add(Math.random()*10);
    }
  }
  
  public static void main(String[] args) {
    ALTester test = new ALTester();
    test.populate();
    System.out.print(test.isSorted);
  }


}
