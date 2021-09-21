package init.HibernateDataJpa.reo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import init.HibernateDataJpa.model.Student;
@Repository
public interface Stdrepo extends JpaRepository<Student,Integer>{

}
