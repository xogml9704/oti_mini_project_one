package project.board.DTO;

import lombok.Data;

@Data
public class CategoryDto {
	private String book_name;
	private String author_name;
	private String book_publisher;
	private int book_price;
	private int review_score;
	private String user_id;
}
