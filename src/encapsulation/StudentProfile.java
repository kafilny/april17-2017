package encapsulation;

public  class StudentProfile {
	public static void main (String []args){
		Student obj1=new Student();
		obj1.setName("kafil uddin");
		obj1.setDob("11-31-89");
		obj1.setSsn("00-00-05432");
		obj1.setAddress("74-03 broadway");
		obj1.setZipcode(11373);
		obj1.setCity("queens");
		obj1.setCountry("usa");
		System.out.println(obj1.getName()+" "+obj1.getDob()+" "+obj1.getSsn()+" "+" "+obj1.getAddress()+" "+obj1.getZipcode()+" "+obj1.getCity()+" "+obj1.getCountry());
		Student obj2=new Student("jon","12-03-76","0000001234","8346 broadway",11453,"queens","usa");
		System.out.println(obj1.getName()+" "+obj1.getDob()+" "+obj1.getSsn()+" "+" "+obj1.getAddress()+" "+obj1.getZipcode()+" "+obj1.getCity()+" "+obj1.getCountry());
		try{
			if(obj2!=null){
				
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}	
	}

}
