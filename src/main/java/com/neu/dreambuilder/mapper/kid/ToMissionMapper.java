package com.neu.dreambuilder.mapper.kid;

import com.neu.dreambuilder.entity.kid.ToMission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 孩子、任务和提交关系 Mapper 接口
 * </p>
 *
 * @author 作者
 * @since 2023-11-03
 */
@Mapper
public interface ToMissionMapper extends BaseMapper<ToMission> {

    void updateReply(ToMission toMission);

}
