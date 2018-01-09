package epam.mybatis.demo.model;

import java.math.BigInteger;
import lombok.Data;

@Data
public class Human {

	private Long id;
	private String firstName;
	private String secondName;
	private String address;
	private BigInteger phoneNumber;
	private String email;
}
