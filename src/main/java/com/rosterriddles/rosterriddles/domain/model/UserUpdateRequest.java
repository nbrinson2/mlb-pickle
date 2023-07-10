package com.rosterriddles.rosterriddles.domain.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserUpdateRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
}
