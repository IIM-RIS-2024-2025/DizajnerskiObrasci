package singleton;

public class TestSingleton {
	public static void main(String[] args) {
		//DatabaseConnection databaseConnection = new DatabaseConnection();
		//DatabaseConnection databaseConnection2 = new DatabaseConnection();
		
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();

		DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

		System.out.println(databaseConnection);
		System.out.println(databaseConnection2);
		System.out.println(Integer.toHexString(databaseConnection2.hashCode()));

		DatabaseConnectionLazy databaseConnectionLazy = DatabaseConnectionLazy.getInstance();

		System.out.println(databaseConnectionLazy);

		DatabaseConnectionLazy databaseConnectionLazy2 = DatabaseConnectionLazy.getInstance();

		System.out.println(databaseConnectionLazy2);

	}
}
