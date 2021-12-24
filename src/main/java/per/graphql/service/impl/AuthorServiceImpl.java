package per.graphql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import per.graphql.domain.Author;
import per.graphql.mapper.AuthorMapper;
import per.graphql.service.AuthorService;

@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

}

