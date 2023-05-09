package com.ryan.WWTBAM.lifeline.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LifelineDto {

    private Long id;
    private String name;
    private boolean used;
}
