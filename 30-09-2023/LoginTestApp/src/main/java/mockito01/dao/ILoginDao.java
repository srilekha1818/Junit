package mockito01.dao;

public interface ILoginDao {
	public int authenticate(String username,String password);
	public int addUser(String username,String role);
}
