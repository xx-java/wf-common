package com.zb.mapper;
import com.zb.pojo.WfOrderShipping;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WfOrderShippingMapper {

	public WfOrderShipping getWfOrderShippingById(@Param(value = "id") Long id)throws Exception;

	public List<WfOrderShipping>	getWfOrderShippingListByMap(Map<String,Object> param)throws Exception;

	public Integer getWfOrderShippingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertWfOrderShipping(WfOrderShipping wfOrderShipping)throws Exception;

	public Integer updateWfOrderShipping(WfOrderShipping wfOrderShipping)throws Exception;

	public Integer deleteWfOrderShippingById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteWfOrderShipping(Map<String,List<String>> params);

}
