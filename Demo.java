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


/*class Box{
	//-------attributes declarations--------
	private int length;
	private int width;
	private int height;
	
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
		this.length=length;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
	return height;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume(); //180
		System.out.println("Length : "+b1.getLength()); //12
		System.out.println("Width  : "+b1.getWidth()); //5
		System.out.println("Height : "+b1.getHeight()); //3
		
		b1.setLength(180); //b1.length=180; //Illegal
	}
}*/

/*class Date{
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(){
		this.month=month;
	}
	public void setDay(){
		this.day=day;
	}
	public int getYear(int year){
		return	year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	
	public void setDate(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void printDate(){
		System.out.println(year + "-" + month + "-" + day);
	}
}
class Demo{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.setDate(2025,9,20);
		d1.printDate();
	}
}*/

class Box{
	int length;
	int width;
	int height;

	Box(){
		length=1;
		width=1;
		height=1;
		System.out.println("Box()");
	}
	
	Box(int length){
		this.length=length;
		width=length;
		height=length;
		System.out.println("Box(int int int)");
	}

	Box(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("Box(int)");
	}
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box();
		b1.printVolume();
		
		Box b2=new Box(10);
		b2.printVolume();
		
		Box b3=new Box(5,10,15);
		b3.printVolume();
	}
}


