package Array.test;

import Array.entity.starSign;

public class test_StarSign {

public static void main (String[]args) {
	
   starSign[][]ss =new starSign[4][3]; //new -->代表實體化，Data裡"無物件"所以value="Null"。
   
     ss[0][0] = new starSign("風象1","天秤");
     ss[0][1] = new starSign("風象2","水瓶");
     ss[0][2] = new starSign("風象3","雙子");
 
     ss[1][0] = new starSign("火象1","射手");
     ss[1][1] = new starSign("火象2","獅子");
     ss[1][2] = new starSign("火象3","牡羊");
  
     ss[2][0] = new starSign("水象1","巨蟹");
     ss[2][1] = new starSign("水象2","天蠍");
     ss[2][2] = new starSign("水象3","雙魚");
     
     ss[3][0] = new starSign("土象1","處女");
     ss[3][1] = new starSign("土象2","魔羯");
     ss[3][2] = new starSign("土象3","金牛");
    
   //forEach
     for(starSign[] loop:ss)
      {
    	 for(starSign loops:loop)
    	 {
    		 System.out.println( loops.show());

    	 }
      }
     
System.out.println("====================================== "); 
   
   //for
     for(int a=0 ;a<ss.length;a++)
     {
    	 for(int b=0;b<ss[a].length;b++)
    	 {
    		System.out.println( ss[a][b].show());
    	 }
     }
     
     
	}
}