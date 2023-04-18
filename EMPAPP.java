public class EMPAPP {
	public static void main(String[] args) {
		EmpDataBAse e1 = new EmpDataBAse();
		for (;;) {
			System.err.println(
					"1.Add Employee	2.Remove Employee	3.Search Employee	4.Update	5.Display	6.Exit");
			switch (e1.sc.nextInt()) {
				case 1: {
					e1.addEmp();
					break;
				}
				case 2: {
					e1.remove();
					break;
				}
				case 3: {
					e1.search();
					break;
				}
				case 4: {
					e1.update();
					break;
				}
				case 5: {
					e1.display();
					break;
				}
				case 6: {
					System.out.println("Application is cloesed");
					return;
				}

			}

		}
	}

}