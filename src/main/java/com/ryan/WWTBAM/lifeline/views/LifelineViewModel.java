package com.ryan.WWTBAM.lifeline.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LifelineViewModel {
    private long id;
    private String name;
    private boolean used;
}
