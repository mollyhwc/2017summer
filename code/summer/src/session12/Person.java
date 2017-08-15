package session12;

public interface Person {

	public String name();
	public int age();
	@Deprecated//表示这个方法过时了
	public void sing();
	
}
