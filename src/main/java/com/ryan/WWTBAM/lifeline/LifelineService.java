package com.ryan.WWTBAM.lifeline;

import com.ryan.WWTBAM.db.LifelineRepository;
import com.ryan.WWTBAM.db.entity.Lifeline;
import com.ryan.WWTBAM.lifeline.dtos.LifelineDto;
import com.ryan.WWTBAM.utils.mapper.Mapper;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LifelineService {

    private final Mapper mapper;
    private final LifelineRepository lifelineRepository;

    public List<LifelineDto> getLifelines()
    {
        Iterable<Lifeline> lifelines = lifelineRepository.findAll();

        return mapper.map(lifelines, LifelineDto.class);
    }

}
