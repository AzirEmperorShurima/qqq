package p2560;

import java.util.Scanner;

class LinearEquation {
	int c1, c0;
	public LinearEquation()
	{
		this.c1 = 0;
		this.c0 = 0;
	}
	
	public LinearEquation(int c0)
	{
		this.c0 = c0;
	}
	public LinearEquation(int c1, int c0)
	{
		this.c1 = c1;
		this.c0 = c0;
	}
//	c1x + c0 = 0
	void solve()
	{
		if(c1==0)
		{
			if(c0 == 0)
			{
				System.out.println("Phuong trinh vo so nghiem!");
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem!");
			}
		}
		else
		{
			double x;
			x = - (double)c0 / c1;
			System.out.println("x = " + x);
		}
	}
	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}

	public int getC0() {
		return c0;
	}

	public void setC0(int c0) {
		this.c0 = c0;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		QuadraticEquation q1 = new QuadraticEquation(a);
		q1.solve();
		QuadraticEquation q2 = new QuadraticEquation(a, b);
		q2.solve();		QuadraticEquation q3 = new QuadraticEquation(a, b, c);
		q3.solve();
	}
}

class QuadraticEquation extends LinearEquation
{
	int c2;
	public QuadraticEquation()
	{
		super();
		this.c2 = 0;
	}
	public QuadraticEquation(int c0)
	{
		super(c0);
		this.c2 = 0;
	}
	public QuadraticEquation(int c1, int c0)
	{
		super(c1, c0);
		this.c2 = 0;
	}
	public QuadraticEquation(int c2, int c1, int c0)
	{
		super(c1, c0);
		this.c2 = c2;
	}
	void solve()
	{
		if(c2 == 0)
		{
			super.solve();
		}
		else 
		{
			double delta = (super.getC1() * super.getC1()) - (4 * this.c2 * super.getC0());
			if(delta > 0)
			{
				double x1, x2;
				x1 = (-super.getC1() + Math.sqrt(delta)) / 2*this.c2;
				x2 = (-super.getC1() - Math.sqrt(delta)) / 2*this.c2;
				System.out.println("Nghiem thu nhat: " + x1);
				System.out.println("Nghiem thu nhat: " + x2);
			}
			else if(delta == 0)
			{
				double x;
				x = - (double) super.getC1() / 2 * this.c2;
				System.out.println("Phuong trinh co nghiem kep: " + x);
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem!");
			}
		}
	}
}
