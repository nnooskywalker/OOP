package Utils;
import java.util.HashMap;

import Models.User;


public class UserManagement {
	public static void addUser(HashMap<Integer, User> users, int id, String name, String email, String userName) {
		User orang = new User(id, name, email, userName);
		
		users.put(id, orang);
	}
	
	public static void deleteUser(HashMap<Integer, User> users, int keyId) {
		if (users.containsKey(keyId)) {
			users.remove(keyId);
			System.out.println("User berhasil di remove\n");
		}
		else {
			System.out.println("User dengan Id " + keyId + " tidak ditemukan");
		}
	}
	
	public static void searchUser(HashMap<Integer, User> users, int id) {
		User orang = users.get(id);
		
		if (orang != null) {
			System.out.println("Name : " + orang.name);
			System.out.println("Email : " + orang.email);
			System.out.println("Username : " + orang.userName);
		}
		else {
			System.out.println("User tidak ditemukan");
		}
	}

}
