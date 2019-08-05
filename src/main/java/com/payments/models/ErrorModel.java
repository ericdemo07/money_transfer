package com.payments.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@Value.Immutable
@JsonDeserialize
public interface ErrorModel {
    @JsonProperty
    String error();
}
