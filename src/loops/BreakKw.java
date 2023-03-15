package loops;

public class BreakKw {

	public static void main(String[] args) {
		String[] array = {"ch","mi","nyc","ca","jc"};
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);
			if(array[i] == "nyc") {
				break;
			}
		}

	}

}
