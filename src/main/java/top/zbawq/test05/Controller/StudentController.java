package top.zbawq.test05.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zbawq.test05.Service.imp.StudentServiceImp;
import top.zbawq.test05.entity.Student;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImp studentServiceImp;

    //进行插入操作
    @GetMapping("/insert")
    public String insertStu(Student student,HttpSession session){
        session.setAttribute("loginUser",student.getName());
        int i = studentServiceImp.insertStu(student);
        if(i>0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }
    @GetMapping("/select/{id}")
    public Student select(@PathVariable("id") Integer id){
        return studentServiceImp.select(id);
    }
    @GetMapping("select")
    public List<Student> selectAll(){
        return studentServiceImp.selectAll();
    }
}
