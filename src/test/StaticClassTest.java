package test;

public final class StaticClassTest {
       public static final String name;
       private static final String password;
       private static final String url;
       private static final String driver;
       
       static{
    	   System.out.println("执行static块");
    	   name="gutao";
           password="1111";
           url="2222";
           driver="mysql";
           System.out.println("test----"+name+","+password+","+url+","+driver);
       }
       public static void test(){
    	   System.out.println("static调用");
       }
}
