package per.graphql.resolver.mutation;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import per.graphql.domain.Tutorial;
import per.graphql.service.TutorialService;

import javax.annotation.Resource;

/**
 * @author YYZ
 * @date 2021/12/24 16:10
 * @description 教程突变解析器
 */
@Controller
public class TutorialMutationResolver {

    @Resource
    private TutorialService tutorialService;

    @MutationMapping
    public Tutorial createTutorial(@Argument("createTutorialInput") Tutorial input) {
        tutorialService.save(input);
        return input;
    }

    @MutationMapping
    public Tutorial updateTutorial(@Argument Integer id, @Argument("updateTutorialInput") Tutorial input) throws NotFoundException {
        input.setId(id);
        tutorialService.updateById(input);
        return tutorialService.getById(id);
    }

    @MutationMapping
    public boolean deleteTutorial(@Argument Integer id) {
        return tutorialService.removeById(id);
    }
}
