package com.model.mapper.BaseResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class BaseResponse<T>{
    @Builder.Default
    private String StatusCode="200";

    @Builder.Default
    private String StatusMsg="SUCCESS";

    private T Data;
}
