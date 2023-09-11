package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.field1 = "data1";
		child.field2 = "data2";
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = new Child();
		parent.field1 = "data3";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2";  //(�Ұ���)
		parent.method3();         //(�Ұ���)
		*/
		
		Child child1 = (Child) parent;
		child1.field1 = "data2";
		child1.field2 = "yyy";  //(����)
		child1.method3();     //(����)
	}
}
