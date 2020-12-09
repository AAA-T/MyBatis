package cn.huiyusheng.dao;

import cn.huiyusheng.domain.Student;

/**
 * @author 悔余生
 * @ClassName:StudentDao
 * @Description:TODO
 * @Date 2020/12/9 下午4:02
 * @Version V1.0
 **/
public interface StudentDao {
    //查询一个学生
    Student selectStudentById(Integer id);
}
