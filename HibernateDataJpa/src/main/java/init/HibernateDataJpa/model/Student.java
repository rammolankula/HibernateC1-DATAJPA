package init.HibernateDataJpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

	@Id
	private Integer stdId;
	private String stdName;
	//LOG=LONG OBJECT
	//BINARY LONG OBJECT
	//CHAR LOG OBJECT
	@Lob  //Here byte means BLOG for usage  storing Images,pdfs,documents,files
	private byte[] stdImg;
	
	@Lob  //Here char means BLOG for usage  storing pdfs,documents,files
	private char[] stdResume;
}
