package controlstatement;

public class switchtest {
	public void test(char w) {
		switch (w) {
		case('a'):
			System.out.println("you have entered   "+w);
		break;
		case('p'):
			System.out.println("you have entered   "+w);
		break;
		case('l'):
			System.out.println("you have entered   "+w);
		break;
		case('e'):
			System.out.println("you have entered   "+w);
		break;
			default:
				System.out.println("enter a valid letter");
		}

	}

	public static void main(String[] args) {
		System.out.println("PLEASE ENTER ANY LETTER IN APPLE");
		switchtest sw=new switchtest();
		sw.test('a');
	//	System.exit(0);
		sw.test('p');
		sw.test('l');
		sw.test('e');
		sw.test('q');
	}

}
