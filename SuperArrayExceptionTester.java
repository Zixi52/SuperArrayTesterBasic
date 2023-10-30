public class SuperArrayExceptionTester{
  public static SuperArray init(){
    SuperArray res = new SuperArray(4);
    String[]values = {"one","fish","two","fish","red","fish","blue","fish"};
    for(int i = 0; i < values.length; i++){
      res.add(values[i]);
    }
    return res;
  }

  public static void main(String[] args) {
    /*test ALL method calls that SHOULD throw an exception.*/
    int testNum = 0;
    String testName;
    SuperArray list;

    //Test1: get negative index
    testNum++;
    testName = "get out of bounds -1";
    list = init();
    try{
        list.get(-1);
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }

    //Test2: get size
    testNum++;
    testName = "get out of bounds size()";
    list = init();
    try{
        list.get(list.size());
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }

    //Test3: set negative index
    //Test4: set size() index
    //Test5: add negative index
    //Test6: add size()+1 index
    //Test7: remove negative index
    //Test8: remove size() index
    //Test9: constructor negative capacity
  }
}
