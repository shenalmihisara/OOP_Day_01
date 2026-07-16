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
/*class Box{
	int length;
	int width;
	int height;
	
	public void printvolume(){
		int volume;
		volume = length*width*height;
		System.out.println("Volume of the box :" + volume);
	}
	
	public void printArea(){
		int Area;
		Area = length*width*2 + width*height*2 + height*length*2;
		System.out.println("Area of the box :" + Area);
	}
	public void setSize(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
}
class Demo{
	public static void main(String[] args){
		Box b1;
		b1=new Box();
		b1.length=12;
		b1.width=5;
		b1.height=3;
		
		int volume;
		volume = b1.length * b1.width * b1.height;
		System.out.println("Volume of the box :" + volume);
		
		b1.setSize(12,5,3);
		
		b1.printvolume();
		b1.printArea();
	}
}*/

/*class Test{
	int a;
	
	public void print(){
		System.out.println(this);
	}
}
class Demo{
	public static void main(String[] args){
		Test t1 = new Test();
		t1.print();
		System.out.println(t1);
		
		System.out.println("---------------------------\n");
		
		Test t2 = new Test();
		t2.print();
		System.out.println(t2);

	}
}*/


class Box{
	//-------attributes declarations--------
	int length;
	int width;
	int height;
	
	//-------methods declarations--------
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume(); //180
		System.out.println("Length : "+b1.length); //12
		System.out.println("Width  : "+b1.width); //5
		System.out.println("Height : "+b1.height); //3
		
		b1.setLength(120);
		b1.setWidth(50);
		b1.setHeight(30);
		b1.printVolume(); //180000
		System.out.println("Length : "+b1.length); //120
		System.out.println("Width  : "+b1.width); //50
		System.out.println("Height : "+b1.height); //30
	}
}

