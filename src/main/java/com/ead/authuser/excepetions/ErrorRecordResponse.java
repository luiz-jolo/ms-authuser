package com.ead.authuser.excepetions;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorRecordResponse(int errorCode, String errorMsg, Map<String, String> errorDetails) {}
