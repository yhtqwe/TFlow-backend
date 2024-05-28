package yang.tong;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: yanghantong
 * @time: 2024/5/27 19:34
 */
@SpringBootApplication
@MapperScan(basePackages = "yang.tong.mapper")
public class TFlowApplication {
    public static void main(String[] args) {
        SpringApplication.run(TFlowApplication.class);
    }
}
