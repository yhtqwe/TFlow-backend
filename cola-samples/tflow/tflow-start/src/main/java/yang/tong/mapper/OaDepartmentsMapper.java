package yang.tong.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import yang.tong.bean.entity.OaDepartments;
import yang.tong.bean.vo.OrgTreeVo;

import java.util.List;

/**
 * @author : willian fu
 * @date : 2022/6/27
 */
public interface OaDepartmentsMapper extends BaseMapper<OaDepartments> {

    @Select("SELECT id, dept_name `name`, 'dept' AS 'type' FROM oa_departments WHERE parent_id=#{deptId}")
    List<OrgTreeVo> selectByDept(@Param("deptId") Integer deptId);
}
