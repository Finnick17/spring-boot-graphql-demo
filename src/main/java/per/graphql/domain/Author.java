package per.graphql.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 作者
 */
@Data
@TableName(value = "author")
public class Author implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 唯一编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 年纪
     */
    @TableField(value = "age")
    private Integer age;
    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;
}