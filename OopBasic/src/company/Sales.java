package company;

public class Sales extends Employee{
	//コンストラクター
	public Sales (String name, Department department, String position, int employeeId) {
		super(name, department, position, employeeId);
	}

	//会議に参加するメソッド
	@Override
	public void joinMeeting() {
	department.meeting();
	System.out.println("→営業として上記の会議に参加します。部署：" + department.getName()+ "名前：" + name  );
	}
}
