package check;

public class Check {
	/*【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
     *firstName →　自分の名字　lastName →【Check.java】にて自分の名前で初期化しなさい。
     *なお、変数のアクセス修飾子は「private」とする
     *
     */
	private static String firstName = "唯";
	private static String lastName = "出原";
	
	/*【Check.java】にてfirstNameとlastNameを引数で受け取って、
	 *連結して表示させるメソッド「printName」を作成しなさい。
	 *作成した関数のアクセス修飾子は「private」とする。
	 *
	 */
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド　→ " + lastName + firstName);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Check.printName("唯", "出原");
	//【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
		Pet p = new Pet("java吉", "hoge");
		p.introduce(); 
		RobotPet rP = new RobotPet("R2D2","ルーク");
		rP.introduce();
	}

}
