package kopo.poly.service.impl;

import kopo.poly.dto.HiveDTO;
import kopo.poly.persistance.mapper.IHiveMapper;
import kopo.poly.service.IHiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("HiveService")
public class HiveService implements IHiveService {

    private final IHiveMapper hiveMapper;

    public HiveService(IHiveMapper hiveMapper) {
        this.hiveMapper = hiveMapper;

    }

    @Override
    public HiveDTO getComediesCount() throws Exception {

        log.info(this.getClass().getName() + ".getComediesCount start!");

        return hiveMapper.getComediesCount();
    }
}
