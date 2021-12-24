package per.graphql.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 教程
 */
@Data
@TableName(value = "tutorial")
public class Tutorial implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;
    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;
    /**
     * 作者编码
     */
    @TableField(value = "author_id")
    private Integer authorId;
    @TableField(exist = false)
    private Author author;

}