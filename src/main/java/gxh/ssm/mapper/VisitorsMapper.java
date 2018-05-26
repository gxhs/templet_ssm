package gxh.ssm.mapper;

import gxh.ssm.po.Visitors;
import gxh.ssm.po.VisitorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorsMapper {
    int countByExample(VisitorsExample example);

    int deleteByExample(VisitorsExample example);

    int deleteByPrimaryKey(Integer vId);

    int insert(Visitors record);

    int insertSelective(Visitors record);

    List<Visitors> selectByExample(VisitorsExample example);

    Visitors selectByPrimaryKey(Integer vId);

    int updateByExampleSelective(@Param("record") Visitors record, @Param("example") VisitorsExample example);

    int updateByExample(@Param("record") Visitors record, @Param("example") VisitorsExample example);

    int updateByPrimaryKeySelective(Visitors record);

    int updateByPrimaryKey(Visitors record);
}