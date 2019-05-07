//an not written in featureA
//an note in fix-B
public class Bank{
	public static void main(String[] args){
		int[][] bankData=new int[100][3];//data struct:[account][password][money]
		int id=0;
	   java.util.Scanner input=new java.util.Scanner(System.in);

	   boolean runState=true;
	   while(runState){

		System.out.println("================================");//welcome page
		System.out.println("bank v1.0");
		System.out.println("================================");
		System.out.println("1.open account\n2.save");
		System.out.println("3.draw\n4.query");
		System.out.println("5.quit");
		System.out.println("---------------------------------");

		int select=input.nextInt();
		switch(select){
			case 1:{		//open account
					   System.out.println("====new account===");
					   System.out.println("ID:"+id);
					   System.out.print("password:");
					   int password=input.nextInt();

						for(int[] account:bankData){
							if(account[0]==0){
								account[0]=id;
								account[1]=password;
								System.out.println("open account success!");
								System.out.println("message");
								System.out.println("account:"+id);
								System.out.println("password:"+password);
								id++;
								break;
							}
						}
					   System.out.println("------------------");
			}break;
			case 2:{		//save
					   System.out.println("====save===");
					   boolean account_exist=false;
					   while(!account_exist){
							System.out.print("input ID: " );
							int save_id=input.nextInt();
							if(save_id<id){
								account_exist=true;
								System.out.print("input money:");
								int save_money=input.nextInt();
								if(save_money<0)
									System.out.println("invalid money!");
								else{
									bankData[save_id][2]+=save_money;
									System.out.println("save success!");
								}

							}
							else{
								System.out.println("no such account! "+save_id);
							}

					   }

							System.out.println("-----------------");

			}break;
			case 3:{		//draw
						System.out.println("===draw===");
						System.out.print("input ID: ");
						int draw_id=input.nextInt();
						for(int[] draw_account:bankData){
							if(draw_account[0]==draw_id){
								System.out.print("input password:");
								int draw_password=input.nextInt();
								if(draw_account[1]==draw_password){
									System.out.print("input money:");
									int draw_money=input.nextInt();
									if(draw_money<draw_account[2]){
										draw_account[2]-=draw_money;
										System.out.println("draw success!\nthe rest is: "+draw_account[2]);
										break;
									}
									else{
										System.out.println("no enough money!");
										break;
									}
								}
								else{
									System.out.println("password error!");
									break;
								}
							}
						}
						System.out.print("-----------------");
			}break;
			case 4:{		//query
					   System.out.println("===query===");
					   System.out.print("input ID: ");
					   int query_id=input.nextInt();
					   for(int[] query_account:bankData){
						   if(query_account[0]==query_id){
							   System.out.print("input password: ");
							   int query_password=input.nextInt();
							   if(query_account[1]==query_password){
								   System.out.println("the money of your account is: "+query_account[2]);
							   }
							   else{
								   System.out.println("password error!");
							   }
								break;
						   }
						   else{
							   System.out.println("no such account!");
							   break;
						   }
					   }
					   System.out.println("--------------------");

			}break;
			case 5:{		//quit

				   runState=false;
			}break;
		}	
	   }
	}
}
