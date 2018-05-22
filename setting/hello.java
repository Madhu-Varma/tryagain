class bank
{
	private String name;
	private int accno;
	public void setbank(String name,int accno)
	{
	name=name;
	accno=accno;
	}
	public void show()
	{
		System.out.print("\n name="+name+"\n accno="+accno);
	}
	
	}
	class account 
	{
		public static void main(String argv[])
		{
			bank obj=new bank();
			obj.setbank("madhu",143);
			
			System.out.println("Bank account...");
			obj.show();
		}
	}
	
		
