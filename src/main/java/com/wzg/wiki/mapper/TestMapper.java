package com.wzg.wiki.mapper;

import com.wzg.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from test")
    public List<Test> list();

}
