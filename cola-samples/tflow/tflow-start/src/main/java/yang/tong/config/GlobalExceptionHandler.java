package yang.tong.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import yang.tong.bean.vo.ErrorRspVo;
import yang.tong.config.exception.BusinessException;
import yang.tong.utils.R;

/**
 * @author : willian fu
 * @date : 2022/6/27
 */
@Slf4j
@Component
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public Object businessExceptionHandler(BusinessException e){
        log.error("BusinessException：",e);
        return R.badRequest(new ErrorRspVo(e.getCode(), e.getMessage(),e.getDescription()));
    }

    @ExceptionHandler(RuntimeException.class)
    public Object runtimeExceptionHandler(RuntimeException e){
        log.error("RuntimeException：",e);
        return R.serverError(e.getMessage());
    }
}
