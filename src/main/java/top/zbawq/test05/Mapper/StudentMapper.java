package top.zbawq.test05.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import top.zbawq.test05.entity.Student;

import java.util.List;

public interface StudentMapper {

    @Select("select * from student where id=#{id}")
    public Student select(Integer id);

    @Select("select * from student")
    public List<Student> selectAll();

    @Insert("insert into student(name,des) values(#{name},#{des}) ")
    public int insertStu(Student student);
}
