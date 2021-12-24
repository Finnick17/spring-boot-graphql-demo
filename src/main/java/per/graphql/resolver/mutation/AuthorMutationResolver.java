package per.graphql.resolver.mutation;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import per.graphql.domain.Author;
import per.graphql.service.AuthorService;

import javax.annotation.Resource;

/**
 * @author YYZ
 * @date 2021/12/24 16:11
 * @description 作者突变解析器
 */
@Controller
public class AuthorMutationResolver {

    @Resource
    private AuthorService authorService;

    @MutationMapping
    public Author createAuthor(@Argument("createAuthorInput") Author author) {
        authorService.save(author);
        return author;
    }

    @MutationMapping
    public Boolean deleteAuthor(@Argument Integer id) {
        return authorService.removeById(id);
    }
}
