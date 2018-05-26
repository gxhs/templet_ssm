package gxh.ssm.mapper;

import gxh.ssm.po.Dormregister;
import gxh.ssm.po.DormregisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormregisterMapper {
    int countByExample(DormregisterExample example);

    int deleteByExample(DormregisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dormregister record);

    int insertSelective(Dormregister record);

    List<Dormregister> selectByExample(DormregisterExample example);

    Dormregister selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dormregister record, @Param("example") DormregisterExample example);

    int updateByExample(@Param("record") Dormregister record, @Param("example") DormregisterExample example);

    int updateByPrimaryKeySelective(Dormregister record);

    int updateByPrimaryKey(Dormregister record);
}