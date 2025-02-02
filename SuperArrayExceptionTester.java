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
    testName = "get -1 [IndexOutOfBoundsException]";
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
    testName = "get size() [IndexOutOfBoundsException]";
    list = init();
    try{
        list.get(list.size());
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }

    //Test3: set negative index [IndexOutOfBoundsException]
    testNum++;
    testName = "set -1 [IndexOutOfBoundsException]";
    list = init();
    try{
        list.set(-1, "test");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
    //Test4: set size() index [IndexOutOfBoundsException]
    testNum++;
    testName = "set size() [IndexOutOfBoundsException]";
    list = init();
    try{
        list.set(list.size(), "test");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
    //Test5: add negative index [IndexOutOfBoundsException]
    testNum++;
    testName = "add -1 [IndexOutOfBoundsException]";
    list = init();
    try{
        list.add(-1, "test");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
    //Test6: add size()+1 index [IndexOutOfBoundsException]
    testNum++;
    testName = "add size()+1 [IndexOutOfBoundsException]";
    list = init();
    try{
        list.add(list.size()+1, "test");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
    //Test7: remove negative index [IndexOutOfBoundsException]
    testNum++;
    testName = "remove -1 [IndexOutOfBoundsException]";
    list = init();
    try{
        list.remove(-1);
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
    //Test8: remove size() index [IndexOutOfBoundsException]
    testNum++;
    testName = "remove size() [IndexOutOfBoundsException]";
    list = init();
    try{
        list.remove(list.size());
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
    //Test9: constructor negative capacity [IllegalArgumentException]
    testNum++;
    testName = "constructor -1 [IllegalArgumentException]";
    list = init();
    try{
        list = new SuperArray(-3);
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IllegalArgumentException e){
      System.out.println(testNum+". PASS "+testName);
    }catch(Exception e){
      System.out.println(testNum+". FAIL! wrong exception thrown "+testName);
    }
  }
}
