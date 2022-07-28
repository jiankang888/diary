package com.jiankang.diary.base;

import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Component
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
