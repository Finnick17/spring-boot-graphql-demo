package per.graphql.resolver.query;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import per.graphql.domain.Author;
import per.graphql.service.AuthorService;

import javax.annotation.Resource;

/**
 * @author YYZ
 * @date 2021/12/24 16:15
 * @description 作者查询解析器
 */
@Controller
public class AuthorQueryResolver {

    @Resource
    private AuthorService authorService;

    @QueryMapping
    public Author author(@Argument Integer id) {
        return authorService.getById(id);
    }
}
