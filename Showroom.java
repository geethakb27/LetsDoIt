package com.xworkz.hasa;

import com.xworkz.hasa.constant.Gender;

public class Showroom {
	
	int index;
	Manager[] managers;
	Manager newManagers[];
	
	public Showroom(int size)
	{
		managers=new Manager[size];
	}
	
	public boolean added(Manager manager)
	{
		boolean isManagerAdded=false;
	//	System.out.println("not added");
		if(manager != null)
		{
			System.out.println("adding");
			
			managers[index++]=manager;
			isManagerAdded=true;
		}
		return isManagerAdded;
	}
	
	public void getManager()
	{
		for(int j=0 ; j < managers.length ; j++)
		{
			
			System.out.println(this.managers[j].getName());
			System.out.println(this.managers[j].getAge());
			System.out.println(this.managers[j].getGender());
			System.out.println(this.managers[j].getAddress());
			System.out.println("================================");
			
		}
	}
	public void getManagerByName(String name)
	{
		System.out.println("inside get manager name");
		for (int i = 0; i < managers.length; i++) {
			
			if(managers[i].getName().equals(name))
			{
				System.out.println("managers found ");
				System.out.println(this.managers[i].getName());
				System.out.println(this.managers[i].getAge());
				System.out.println(this.managers[i].getGender());
				System.out.println(this.managers[i].getAddress());
			}
			
		}
	}
	public void getManagerByAge(int age)
	{
		System.out.println("inside get manager age");
		for (int i = 0; i < managers.length; i++) {
			
			if(managers[i].getAge()==age)
			{
				System.out.println("managers found ");
				System.out.println(this.managers[i].getName());
				System.out.println(this.managers[i].getAge());
				System.out.println(this.managers[i].getGender());
				System.out.println(this.managers[i].getAddress());
			}}
		
			
		}
		public void getManagerByAddress(String address)
		{
			System.out.println("inside get manager address");
			for (int i = 0; i < managers.length; i++) {
				
				if(managers[i].getAddress().equals(address))
				{
					System.out.println("patient found ");
					System.out.println(this.managers[i].getName());
					System.out.println(this.managers[i].getAge());
					System.out.println(this.managers[i].getGender());
					System.out.println(this.managers[i].getAddress());
				}
				
			}
		}
			public void getManagerByGender(Gender gender)
			{
				System.out.println("inside get gender  ");
				for (int i = 0; i < managers.length; i++) {
					
					if(managers[i].getGender().equals(gender))
					{
						System.out.println("manager found ");
						System.out.println(this.managers[i].getName());
						System.out.println(this.managers[i].getAge());
						System.out.println(this.managers[i].getGender());
						System.out.println(this.managers[i].getAddress());
					}}
					
				}
				public void getManagerNamebyGender(Gender gender)
				{
					System.out.println("inside get manager name by gender");
					for (int i = 0; i < managers.length; i++) {
						
						if(managers[i].getGender().equals(gender))
						{
							System.out.println("manager found ");
							System.out.println(this.managers[i].getName());
							
						}
					}
						
					}
					public void getGenderByManagerName(String name)
					{
						System.out.println("inside get gender by name ");
						for (int i = 0; i < managers.length; i++) {
							
							if(managers[i].getName().equals(name))
							{
								System.out.println("manager found ");
								System.out.println(this.managers[i].getGender());
								
							}}
							
						}
						
						public boolean updateAdressByName(String name,String newaddress)
						{
							boolean isupdate=false;
						
							System.out.println("inside update address ");
							for (int i = 0; i < managers.length; i++) {
								
								if(managers[i].getName().equals(name))
								{
									System.out.println("manager found ");
									managers[i].setAddress(newaddress);
									isupdate=true;
									
								}
								
							}
							return isupdate;

}
						public boolean updateNamebyAge(String name,int age)
						{
							boolean isupdate=false;
						
							System.out.println("inside update name ");
							for (int i = 0; i < managers.length; i++) {
								
								if(managers[i].getName().equals(name))
								{
									System.out.println("manager found ");
									managers[i].setAge(age);
									isupdate=true;
									
								}
								
							}
							return isupdate;

}
						public boolean deleteByName(String name)
						{
							boolean isDelete=false;
						
							System.out.println("inside delete name ");
							 newManagers=new Manager[managers.length-1];
							
							for (int i = 0,k=0; i < managers.length; i++) {
								
								if(!managers[i].getName().equals(name))
								{
									System.out.println("patient found ");
									newManagers[k++]=managers[i];
									isDelete=true;
									
								}
								
							}
							return isDelete;
}
						public boolean deleteByAge(int age)
						{
							boolean isDelete=false;
						
							System.out.println("inside delete age ");
							newManagers=new Manager[managers.length-1];
							
							for (int i = 0,k=0; i < managers.length; i++) {
								
								if(managers[i].getAge()!=age)
								{
									System.out.println("patient found ");
									newManagers[k++]=managers[i];
									isDelete=true;
									
								}
								
							}
							return isDelete;
}
						public boolean deleteByGender(Gender gen)
						{
							boolean isDelete=false;
						
							System.out.println("inside delete by gender ");
							 newManagers=new Manager[managers.length-1];
							
							for (int i = 0,k=0; i < managers.length; i++) {
								
								if(!managers[i].getGender().equals(gen))
								{
									System.out.println("patient found ");
									newManagers[k++]=managers[i];
									isDelete=true;
									
								}
								
							}
							return isDelete;
}
						public void getnewManager()
						{
							for(int j=0 ; j < newManagers.length ; j++)
							{
								
								System.out.println(this.newManagers[j].getName());
								System.out.println(this.newManagers[j].getAge());
								System.out.println(this.newManagers[j].getGender());
								System.out.println(this.newManagers[j].getAddress());
								System.out.println("================================");
								
							}
						}

						

}
