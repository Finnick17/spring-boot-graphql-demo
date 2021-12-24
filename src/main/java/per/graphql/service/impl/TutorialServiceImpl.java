package per.graphql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import per.graphql.domain.Tutorial;
import per.graphql.mapper.TutorialMapper;
import per.graphql.service.TutorialService;

@Service
public class TutorialServiceImpl extends ServiceImpl<TutorialMapper, Tutorial> implements TutorialService {

}

