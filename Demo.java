class student{
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
}
