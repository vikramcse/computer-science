public class StackTest {
	public static void main(String ss[]) {
		Stack s = new Stack(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		s.getTop();

		s.pop();

		s.getTop();
	}
}