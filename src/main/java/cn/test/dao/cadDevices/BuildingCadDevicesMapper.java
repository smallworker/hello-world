package cn.test.dao.cadDevices;

import cn.test.entity.cadDevices.BuildingCadDevices;
import cn.test.entity.cadDevices.BuildingCadDevicesExample;
import cn.test.entity.cadDevices.BuildingCadDevicesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingCadDevicesMapper {
    int countByExample(BuildingCadDevicesExample example);

    int deleteByExample(BuildingCadDevicesExample example);

    int deleteByPrimaryKey(BuildingCadDevicesKey key);

    int insert(BuildingCadDevices record);

    int insertSelective(BuildingCadDevices record);

    List<BuildingCadDevices> selectByExample(BuildingCadDevicesExample example);

    BuildingCadDevices selectByPrimaryKey(BuildingCadDevicesKey key);

    int updateByExampleSelective(@Param("record") BuildingCadDevices record, @Param("example") BuildingCadDevicesExample example);

    int updateByExample(@Param("record") BuildingCadDevices record, @Param("example") BuildingCadDevicesExample example);

    int updateByPrimaryKeySelective(BuildingCadDevices record);

    int updateByPrimaryKey(BuildingCadDevices record);
}