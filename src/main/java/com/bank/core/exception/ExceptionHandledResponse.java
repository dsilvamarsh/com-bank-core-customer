package com.bank.core.exception;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionHandledResponse {

	private List<Error> errorList;
	private SourceDetails sourceDetails;


}
