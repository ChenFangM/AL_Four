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
    for(int i = 0; i < this.length; i++){
      result = this[i+1] - this[i];
      if (result < 0){
        return result;
      }
    }
    return result;
  }
  
  public status void main(String[] args) {
    ALTester test = new ALTester();

  }


}
