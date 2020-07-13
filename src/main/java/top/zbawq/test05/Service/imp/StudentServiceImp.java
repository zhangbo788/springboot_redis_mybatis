package top.zbawq.test05.Service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import top.zbawq.test05.Mapper.StudentMapper;
import top.zbawq.test05.Service.StudentService;
import top.zbawq.test05.entity.Student;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    @Cacheable("studentSelect")
    public Student select(Integer id) {
        System.out.println("select方法执行了");
        Student student = studentMapper.select(id);
        return student;
    }

    @Override
    public List<Student> selectAll() {
        System.out.println("selectAll方法执行了");
        List<Student> students = studentMapper.selectAll();
        return students;
    }

    @Override
    public int insertStu(Student student) {
        int i = studentMapper.insertStu(student);
        System.out.println("insertStu方法执行了");
        return i;
    }
}
