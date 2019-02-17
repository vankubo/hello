public class main2_17{
	public static void main(String[] args){
		System.out.println("hello java");
		int[][] i=new int[10][10];
		int i_length=0;
	   for(int a=0;a<i.length;a++){			//收集二维数组的长度
		   i_length+=i[a].length;
	   }	   
	   System.out.println("length="+i_length);
	}
}
