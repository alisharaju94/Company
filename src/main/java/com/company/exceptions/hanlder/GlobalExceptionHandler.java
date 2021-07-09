/**
 * 
 */
package com.company.exceptions.hanlder;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.exceptions.ResourceNotFoundException;
import com.company.model.ApiError;

/**
 * @author ALISH
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseBody
	public ApiError resourceNotFoundExc(ResourceNotFoundException exception) {
		ApiError apiError = new ApiError();
		apiError.setStatus(HttpStatus.NOT_FOUND);
		apiError.setMessage(exception.getMessage());
		return apiError;
	}
}
