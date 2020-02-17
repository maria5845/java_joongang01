package animal;

import java.util.Scanner;

// 정적 바인딩 : 컴피일 시점에서 호출 함수 결정 
public class AnimalMain {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    Dog dd=null;
    Cat cc=null;
    Duck dk=null;
    Fish ff=null;
    
    while(true) {
    	System.out.println("1.Dog 2.Cat 3. Fish 4. Duck 5.Exit\n선택 : ");
         n=sc.nextInt();
         switch(n) {
         case 1 : dd = new Dog(); dd.Speak(); dd.Walk(); break;
         case 2 : cc = new Cat(); cc.Speak(); cc.Walk(); break;
         case 3 : ff = new Fish(); ff.Speak(); ff.Walk(); break;
         case 4 : dk = new Duck(); dk.Speak(); dk.Walk(); break;
         default : System.out.println("***종료합니다***");
         sc.close();
         System.exit(0);
         
         
         }
    }
    
	}

}
