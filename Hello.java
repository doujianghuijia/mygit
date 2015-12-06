/*
ÕâÊÇ×¢ÊÍ
*/
public class Hello{
			public static void main(String[] args){
			//printPicture(5);		
			//printMutiplicationTable();
			//circle();
			//printPicture1(5);
			System.out.print((char)11);
	}


	public static void printPicture(int num){
		System.out.println("==================");
		for(int i=num;i>0;i--){
			for(int y=1;y<=i;y++){
				System.out.print("*");
				if(y==i){
					System.out.print("\n");
				}
			}
		}
	}

	public static void printMutiplicationTable(){
		for(int i=1;i<=9;i++){
			for(int y=1;y<=i;y++){
				System.out.print(y+"*"+i+"="+(i*y)+"  ");
			}
			System.out.print("\n");
		}		
	}


	public static void circle(){
		w:for(int i=0;i<3;i++){
			q:for(int y=0;y<4;y++){
				System.out.println("i="+i);
				break w;
			}
		}
	}

	public static void printPicture1(int num){
		System.out.println("==================");
		for(int x=1;x<=num;x++){
			for(int y=x;y<=num;y++){
				System.out.print(" ");
			}
			for(int z=0;z<x;z++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}