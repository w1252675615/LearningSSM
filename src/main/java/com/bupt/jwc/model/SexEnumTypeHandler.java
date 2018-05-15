package com.bupt.jwc.model;

import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Sex.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class SexEnumTypeHandler implements TypeHandler<Sex> {
    @Override
    public void setParameter(PreparedStatement ps, int i, Sex sex, JdbcType jdbcType) throws SQLException{
        ps.setInt(i,sex.getId());
    }

    @Override
    public Sex getResult(ResultSet rs, String columnName) throws SQLException{
        int id = rs.getInt(columnName);
        return rs.wasNull()? null : Sex.getSexById(id);
    }
    @Override
    public Sex getResult(ResultSet rs, int columnIndex) throws SQLException{
        int id = rs.getInt(columnIndex);
        return rs.wasNull()? null : Sex.getSexById(id);
    }
    @Override
    public Sex getResult(CallableStatement cs, int columnIndex) throws SQLException{
        int id = cs.getInt(columnIndex);
        return cs.wasNull()? null : Sex.getSexById(id);
    }
}
