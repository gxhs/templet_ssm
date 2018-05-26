package gxh.ssm.mapper;

import gxh.ssm.po.Visitorsregister;
import gxh.ssm.po.VisitorsregisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorsregisterMapper {
    int countByExample(VisitorsregisterExample example);

    int deleteByExample(VisitorsregisterExample example);

    int deleteByPrimaryKey(Integer vrId);

    int insert(Visitorsregister record);

    int insertSelective(Visitorsregister record);

    List<Visitorsregister> selectByExample(VisitorsregisterExample example);

    Visitorsregister selectByPrimaryKey(Integer vrId);

    int updateByExampleSelective(@Param("record") Visitorsregister record, @Param("example") VisitorsregisterExample example);

    int updateByExample(@Param("record") Visitorsregister record, @Param("example") VisitorsregisterExample example);

    int updateByPrimaryKeySelective(Visitorsregister record);

    int updateByPrimaryKey(Visitorsregister record);
}