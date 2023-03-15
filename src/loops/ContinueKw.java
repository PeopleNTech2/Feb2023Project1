package loops;

public class ContinueKw {

	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			if(i > 20 && i <30) {
				continue;
			}
			System.out.println(i);
		}

	}

}
