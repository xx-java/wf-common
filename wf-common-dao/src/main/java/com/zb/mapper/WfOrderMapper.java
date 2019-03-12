package com.zb.mapper;
import com.zb.pojo.WfOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WfOrderMapper {

	public WfOrder getWfOrderById(@Param(value = "id") Long id)throws Exception;

	public List<WfOrder>	getWfOrderListByMap(Map<String,Object> param)throws Exception;

	public Integer getWfOrderCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertWfOrder(WfOrder wfOrder)throws Exception;

	public Integer updateWfOrder(WfOrder wfOrder)throws Exception;

	public Integer deleteWfOrderById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteWfOrder(Map<String,List<String>> params);

}
