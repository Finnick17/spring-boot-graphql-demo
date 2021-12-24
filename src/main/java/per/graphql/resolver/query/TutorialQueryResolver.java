package per.graphql.resolver.query;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import per.graphql.domain.Tutorial;
import per.graphql.service.AuthorService;
import per.graphql.service.TutorialService;

import javax.annotation.Resource;

/**
 * @author YYZ
 * @date 2021/12/24 16:59
 * @description 教程查询解析器
 */
@Controller
public class TutorialQueryResolver {

    @Resource
    private TutorialService tutorialService;
    @Resource
    private AuthorService authorService;

    @QueryMapping
    public Tutorial tutorial(@Argument Integer id) {
        Tutorial tutorial = tutorialService.getById(id);
        tutorial.setAuthor(authorService.getById(tutorial.getAuthorId()));
        return tutorial;
    }
}
