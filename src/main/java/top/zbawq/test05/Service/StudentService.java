package top.zbawq.test05.Service;

import top.zbawq.test05.entity.Student;

import java.util.List;

public interface StudentService {

    public Student select(Integer id);

    public List<Student> selectAll();

    public int insertStu(Student student);
}
