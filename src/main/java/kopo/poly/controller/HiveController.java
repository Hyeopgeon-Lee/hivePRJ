package kopo.poly.controller;

import kopo.poly.dto.HiveDTO;
import kopo.poly.service.IHiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class HiveController {

    @Resource(name = "HiveService")
    private IHiveService hiveService;

    @GetMapping(value = "hive/getComediesCount")
    public HiveDTO getComediesCount(ModelMap model)
            throws Exception {

        // 로그 찍기(추후 찍은 로그를 통해 이 함수에 접근했는지 파악하기 용이하다.)
        log.info(this.getClass().getName() + ".getComediesCount start!");

        HiveDTO rDTO = hiveService.getComediesCount();

        if (rDTO == null) {
            rDTO = new HiveDTO();
        }

        // 로그 찍기(추후 찍은 로그를 통해 이 함수 호출이 끝났는지 파악하기 용이하다.)
        log.info(this.getClass().getName() + ".getComediesCount end!");

        return rDTO;

    }
}
