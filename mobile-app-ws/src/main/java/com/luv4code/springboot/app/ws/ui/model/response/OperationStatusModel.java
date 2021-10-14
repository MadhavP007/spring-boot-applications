package com.luv4code.springboot.app.ws.ui.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OperationStatusModel {
	private String operationResult;
	private String operationName;
}
