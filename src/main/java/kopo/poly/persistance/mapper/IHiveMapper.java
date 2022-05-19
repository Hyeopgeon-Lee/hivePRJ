package kopo.poly.persistance.mapper;

import kopo.poly.dto.HiveDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHiveMapper {

    HiveDTO getComediesCount() throws Exception;
}
