package init.HibernateDataJpa.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import init.HibernateDataJpa.model.Student;
import init.HibernateDataJpa.reo.Stdrepo;
@Component
public class StudentTestrunner implements CommandLineRunner{

	
	@Autowired
	Stdrepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student std=new Student();
		std.setStdId(1);
		std.setStdName("Ram");
		//Here we need to give the path of the image file using FILEINPUTSTREAM
		//in postgresq it will store as binary format data such as like numbers
		FileInputStream fis=new FileInputStream("E:\\Project\\MY projects\\TSD - Centralized Mapper for UPI Number v1.4(3 SEP 2021)-converted.pdf");
		byte[] arr=new byte[fis.available()];
	    fis.read(arr);
	    
	    std.setStdImg(arr);
	    
	   //here we need to  give the char values using .tocharray for CLOG CHAR -LOG
	    std.setStdResume(("xhsahahahxahxahxhxasxaxax").toCharArray());
	    repo.save(std);
	}

}
