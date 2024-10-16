package ait.cohort46.dto;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonFeedDto {
    private String fullName;
    @Singular
    private List<String> foods;
}
