package homework4;
import java.util.*;
public class homework4 {
public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 private int hp;
 private int mp;
 private String nickname;
 private int hp;
 int[][] array = {{25,32,8,19,27},{2500,800,500,1000,1200}};
   System.out.println("小美欲借的金額");
   int a = sc.nextInt();//輸入欲借的金額
    int count =0;
    System.out.println("可借錢的員工編號:");
    for(int i=0;i<array[1].length;i++){
    	if(array[1][i]>=a) {
        count++;    	
   System.out.println(array[0][i]+" ");
        
}
}
    System.out.println("共"+count+"人");
}
}
