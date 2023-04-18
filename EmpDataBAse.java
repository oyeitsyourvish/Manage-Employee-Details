import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmpDataBAse {
	List<EMP> l1 = new LinkedList<EMP>();
	EMP e;
	Scanner sc = new Scanner(System.in);

	public void addEmp() {
		System.out.println("Enter The Id");
		int empid = sc.nextInt();
		System.out.println("Enter The Name");
		String name = sc.next();
		System.out.println("Enter The Age");
		int age = sc.nextInt();
		System.out.println("Enter The Sal");
		double sal = sc.nextDouble();
		System.out.println("Enter The Deptno");
		int deptno = sc.nextInt();
		System.out.println("Enter The Job");
		String job = sc.next();
		e = new EMP(empid, name, age, sal, deptno, job);
		if (l1.add(e)) {
			System.out.println("Employee is Added Successfully...");
		} else
			System.out.println("Emplyee is not Added");

	}

	public void remove() {
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		for (int i = 0; i < l1.size(); i++) {
			EMP E = l1.get(i);
			if (E.empid == id) {
				l1.remove(E);
				System.out.println("Employee Removed Successfully...");
				return;
			}
		}
		System.out.println("Id is not found");

	}

	public void search() {
		System.out.println("Enter id");
		int id = sc.nextInt();
		for (int i = 0; i < l1.size(); i++) {
			EMP e1 = l1.get(i);
			if (e1.empid == id) {
				System.out.println("Employee Id    :- " + e.empid);
				System.out.println("Employee Name  :- " + e.name);
				System.out.println("Employee Age   :- " + e.age);
				System.out.println("Employee Sal   :- " + e.sal);
				System.out.println("Employee Dept  :- " + e.deptno);
				System.out.println("Employee Job   :- " + e.job);
				return;
			}
		}
		System.out.println("id is not found");
	}

	public void update() {
		System.out.println(
				"1.Name Correction		2.Age Correction	3.Salary  Correction	4.Change Deptno		5.Job Correction");
		switch (sc.nextInt()) {

			case 1: {
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				for (int i = 0; i < l1.size(); i++) {
					EMP E = l1.get(i);
					if (E.empid == id) {
						System.out.println("Enter The Name for correction");
						String name = sc.next();
						E.name = name;
						l1.set(i, E);
						System.out.println("Employee Name Is Updated Successfully...");
						return;
					}
				}
				System.out.println("Id is not found");

			}

			case 2: {
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				for (int i = 0; i < l1.size(); i++) {
					EMP E = l1.get(i);
					if (E.empid == id) {
						System.out.println("Enter The Age for correction");
						int age = sc.nextInt();
						E.age = age;
						l1.set(i, E);
						System.out.println("Employee Age Is Updated Successfully...");
						return;
					}
				}
				System.out.println("Id is not found");

			}

			case 3: {
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				for (int i = 0; i < l1.size(); i++) {
					EMP E = l1.get(i);
					if (E.empid == id) {
						System.out.println("Enter The Salary for correction");
						double sal = sc.nextDouble();
						E.sal = sal;
						l1.set(i, E);
						System.out.println("Employee Salary Is Updated Successfully...");
						return;
					}
				}
				System.out.println("Id is not found");

			}
			case 4: {
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				for (int i = 0; i < l1.size(); i++) {
					EMP E = l1.get(i);
					if (E.empid == id) {
						System.out.println("Enter The Depto No. for correction");
						int deptno = sc.nextInt();
						E.deptno = deptno;
						l1.set(i, E);
						System.out.println("Employee Dept No. Is Updated Successfully...");
						return;
					}
				}
				System.out.println("Id is not found");

			}
			case 5: {
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				for (int i = 0; i < l1.size(); i++) {
					EMP E = l1.get(i);
					if (E.empid == id) {
						System.out.println("Enter The Job for correction");
						String job = sc.next();
						E.job = job;
						l1.set(i, E);
						System.out.println("Employee Job Is Updated Successfully...");
						return;
					}
				}
				System.out.println("Id is not found");

			}

		}

	}

	public void display() {
		for (int i = 0; i < l1.size(); i++) {
			EMP e = l1.get(i);

			System.out.println();
			System.out.println("Employee Id    :- " + e.empid);
			System.out.println("Employee Name  :- " + e.name);
			System.out.println("Employee Age   :- " + e.age);
			System.out.println("Employee Sal   :- " + e.sal);
			System.out.println("Employee Dept  :- " + e.deptno);
			System.out.println("Employee Job   :- " + e.job);
			System.out.println("______________________________________________________________");
			System.out.println();

		}
	}

}