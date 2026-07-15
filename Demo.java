/*class student{
	String stId;
	String stName;
	int prfMarks;
	int dbmsMarks;
}

class Demo{
	public static void main(String[] args){
		int[] ar = new int[3];
		
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		
		System.out.println("arr[01] :" + ar[0]);
		System.out.println("arr[02] :" + ar[1]);
		System.out.println("arr[03] :" + ar[2]);
		
		//----------------------------------------
		
		student s1 = new student();
		s1.stId="S0001";
		s1.stName="Nimal";
		s1.prfMarks=80;
		s1.dbmsMarks=90;
		
		System.out.println("");
		System.out.println("Student Id :" + s1.stId);
		System.out.println("Student Name :" + s1.stName);
		System.out.println("PRF Marks :" + s1.prfMarks);
		System.out.println("DBMS Marks :" + s1.dbmsMarks);
	}
}*/
class Box{
	int length;
	int width;
	int height;
	
	public void printvolume(){
		int volume;
		volume = length*width*height;
		System.out.println("Volume of the box :" + volume);
	}
}
class Demo{
	public static void main(String[] args){
		Box b1;
		b1=new Box();
		b1.length=12;
		b1.width=5;
		b1.height=3;
		
		/*int volume;
		volume = b1.length * b1.width * b1.height;
		System.out.println("Volume of the box :" + volume);*/
		
		b1.printvolume();
	}
}
