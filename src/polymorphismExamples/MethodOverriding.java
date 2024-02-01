package polymorphismExamples;


class Arithmetic {
    public void add() {
        System.out.println(5+5);
    }
}

class AddFirst extends Arithmetic {
 
    @Override
    public void add() {
        System.out.println(4+6);
    }
}
class AddSecond extends Arithmetic {
	@Override
    public void add() {
        System.out.println(9+1);
    }
}

public class MethodOverriding {
	public static void main(String[] args) {
		Arithmetic arit=new Arithmetic();
		Arithmetic first=new AddFirst();
		Arithmetic second=new AddSecond();
		
		arit.add();
		first.add();
		second.add();
		
	}

}
