package tech.wetech.weshop.marketing.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tech.wetech.weshop.marketing.dto.HomeIndexDTO;
import tech.wetech.weshop.utils.Result;

@FeignClient(value = "weshop-marketing", path = "home")
public interface HomeApi {

    @GetMapping("/index")
    Result<HomeIndexDTO> index();
}