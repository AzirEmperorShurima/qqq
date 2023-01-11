package p2560;

class Person {
//	name, address, phone number, and email address
	String name;
	String address;
	String phoneNumber;
	String emailAddress;
	public Person(String pname, String pAress, String phNumber, String eAddress) {
		this.name = pname;
		this.address = pAress;
		this.phoneNumber = phNumber;
		this.emailAddress = eAddress;
	}
	void out() {
		System.out.println("Ten: " + this.name);
		System.out.println("Dia chi: " + this.address);
		System.out.println("So dien thoai: " + this.phoneNumber);
		System.out.println("Dia chi email: " + this.emailAddress);
	}
	public static void main(String[] args) {
		System.out.print("========= Person =========");
		Person p = new Person("Nguyen Ngoc Truong", "Hoa Khuong", "0905320727", "ngoctruong180603@gmail.com");
		p.out();
		System.out.print("========= Student =========");
		Student stu = new Student("Nguyen Ngoc Truong", "Hoa Khuong", "0905320727", "ngoctruong180603@gmail.com", 1);
		stu.out();
		System.out.print("========= Employee =========");
		Employee e = new Employee("Nguyen Ngoc Truong", "Hoa Khuong", "0905320727", "ngoctruong180603@gmail.com", 
									"Thoi trang", "15/12/2022", 10000);
		e.out();
		System.out.print("========= Staff =========");
		Staff sta = new Staff("Nguyen Ngoc Truong", "Hoa Khuong", "0905320727", "ngoctruong180603@gmail.com", 
									"Thoi trang", "15/12/2022", 10000, "Quan li");
		sta.out();
		System.out.print("========= Faculty =========");
		Faculty f = new Faculty("Nguyen Ngoc Truong", "Hoa Khuong", "0905320727", "ngoctruong180603@gmail.com", 
									"Thoi trang", "15/12/2022", 10000, "120h", "Tien si");
		f.out();
	}
}

class Student extends Person {
	final int freshman = 1;
	final int sophomore = 2;
	final int junior = 3;
	final int senior = 4;
	String status = "freshman";
	
	public Student(String pname, String pAress, String phNumber, String eAddress, int sStatus) {
		super(pname, pAress, phNumber, eAddress);
		if(sStatus == 1)
			this.status = "freshman";
		if(sStatus == 2)
			this.status = "sophomore";
		if(sStatus == 3)
			this.status = "junior";
		if(sStatus == 4)
			this.status = "senior";
	}
	void out() {
		System.out.println("Ten: " + super.name);
		System.out.println("Dia chi: " + super.address);
		System.out.println("So dien thoai: " + super.phoneNumber);
		System.out.println("Dia chi email: " + super.emailAddress);
		System.out.println("Sinh vien: " + this.status);
	}
}

class Employee extends Person {
	String office;
	String dateHired;
	int salary;
	
	public Employee(String pname, String pAress, String phNumber, String eAddress,
						String eOffice, String eDateHired, int eSalary) {
		super(pname, pAress, phNumber, eAddress);
		this.office = eOffice;
		this.dateHired = eDateHired;
		this.salary = eSalary;
	}
	
	void out() {
		System.out.println("Ten: " + super.name);
		System.out.println("Dia chi: " + super.address);
		System.out.println("So dien thoai: " + super.phoneNumber);
		System.out.println("Dia chi email: " + super.emailAddress);
		System.out.println("Van phong: " + this.office);
		System.out.println("Tien luong: " + this.salary);
		System.out.println("Ngay thue: " + this.dateHired);
	}
}

class Staff extends Employee {
	String title;
	
	public Staff(String pname, String pAress, String phNumber, String eAddress, String eOffice, String eDateHired,
			int eSalary, String sTitle) {
		super(pname, pAress, phNumber, eAddress, eOffice, eDateHired, eSalary);
		this.title = sTitle;
	}
	
	void out() {
		System.out.println("Ten: " + super.name);
		System.out.println("Dia chi: " + super.address);
		System.out.println("So dien thoai: " + super.phoneNumber);
		System.out.println("Dia chi email: " + super.emailAddress);
		System.out.println("Van phong: " + super.office);
		System.out.println("Tien luong: " + super.salary);
		System.out.println("Ngay thue: " + super.dateHired);
		System.out.println("Chuc danh: " + this.title);
	}
}

class Faculty extends Employee {
	String officeHours;
	String rank;
	
	public Faculty(String pname, String pAress, String phNumber, String eAddress, String eOffice, String eDateHired,
			int eSalary, String fOfficeHours, String fRank) {
		super(pname, pAress, phNumber, eAddress, eOffice, eDateHired, eSalary);
		this.officeHours = fOfficeHours;
		this.rank = fRank;
	}
	
	void out() {
		System.out.println("Ten: " + super.name);
		System.out.println("Dia chi: " + super.address);
		System.out.println("So dien thoai: " + super.phoneNumber);
		System.out.println("Dia chi email: " + super.emailAddress);
		System.out.println("Van phong: " + super.office);
		System.out.println("Tien luong: " + super.salary);
		System.out.println("Ngay thue: " + super.dateHired);
		System.out.println("Gio lam viec: " + this.officeHours);
		System.out.println("Cap bac: " + this.rank);
	}
}
