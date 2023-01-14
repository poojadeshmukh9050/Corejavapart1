package oops;

  class Parent1
  {
		int sid=10;
		public void display() 
		{
		
		System.out.println("Roll No:"+sid);
		}//end parent class
	}
		//child class
		class Engg extends Parent1
		{
			String name="Computer Eng";
			public void display01()
			{
				System.out.println("strem info="+name);
			}
		}
        
		class Architect extends Parent1
		{
			String name="Architecture";
			public void displayA1()
			{
				System.out.println("Stram INFO "+name);
			}
		}
      
		public class Hierarchical {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Engg e =new Engg();
	    e.display();
	    e.display01();
	    Architect a = new Architect();
	    a.displayA1();
	    
		
		}

	}
