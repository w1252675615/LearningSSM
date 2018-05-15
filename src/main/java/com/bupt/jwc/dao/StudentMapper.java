package com.bupt.jwc.dao;


import com.bupt.jwc.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
   public Student getStudentBySid(int sid);
   //public int getScoreBySidOrderByCid(int sid);
}
