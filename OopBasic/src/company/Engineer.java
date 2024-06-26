package company;


public class Engineer extends Employee {
	String programmingLaungage;
	
public Engineer (String name, Department department, String position, int employeeId, String programminglanguage) {
	super(name, department, position, employeeId);
	this.programmingLaungage = programminglanguage;
}

public void developSoftware() {
	System.out.println("ソフトウェアを開発します。名前：" + name +"、プログラミング言語：" + programmingLaungage);
}

//会議に参加するメソッドをオーバーライド
@Override
public void joinMeeting() {
	department.meeting();
	System.out.println("→技術的な準備を行い、上記の会議に参加します。名前：" + name);
   }
}
