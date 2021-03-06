package au.com.iglooit.searchcloud.service;

import au.com.iglooit.searchcloud.domain.Member;
import au.com.iglooit.searchcloud.repository.search.MemberSearchRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

@Service
@Transactional
public class MemberSystemService {
    private final Logger log = LoggerFactory.getLogger(MemberService.class);

    @Inject
    private MemberSearchRepository memberSearchRepository;

    public void saveMemberIntoCloud(Member member){
        log.debug("save member: {}", member);
        memberSearchRepository.save(member);
    }


}
