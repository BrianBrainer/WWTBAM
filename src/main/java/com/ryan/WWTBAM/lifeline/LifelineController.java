package com.ryan.WWTBAM.lifeline;

import com.ryan.WWTBAM.lifeline.dtos.LifelineDto;
import com.ryan.WWTBAM.lifeline.views.LifelineViewModel;
import com.ryan.WWTBAM.utils.mapper.Mapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LifelineController {
    private final Mapper mapper;
    private final LifelineService lifelineService;

    @GetMapping("/lifelines")
    public List<LifelineViewModel> getLifelines()
    {
        List<LifelineDto> lifelines = lifelineService.getLifelines();
        return mapper.map(lifelines, LifelineViewModel.class);
    }


}
