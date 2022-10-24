package project.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Category {
	// Field
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	//Constructor
	public Category() {
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@kosa402.iptime.org:50031/orcl",
					"younghun",
					"oracle"
				);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
	}
	public void search() {
		System.out.println("검색 방법을 선택해 주세요 .");
		System.out.println("1. 통합 검색 , 2. 카테고리 검색 ");
		System.out.print("-> ");
		String choice = scanner.nextLine();
		
		switch(choice) {
			case "1" -> integrationSearch();
			case "2" -> categorySearch();
		}
	}
	
	//Method
	public void categorySearch() {
		System.out.println();
		System.out.println("검색하실 카테고리를 선택해주세요. ");
		System.out.println("---------------------------");
		System.out.println("1번 카테고리, 2번 카테고리, 3번 카테고리");
		System.out.print("-> ");
		String Search = scanner.nextLine();
		
	}
	
	public void integrationSearch() {
		System.out.print("검색어를 입력해주세요 : ");
		String Search = scanner.nextLine();
		try {
			String sql = "SELECT "
		}
	}
	
	public void exit() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Category category = new Category();
		category.search();
	}
	
	
}