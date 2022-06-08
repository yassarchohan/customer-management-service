package com.etisalat.customer.exception;

import java.sql.Timestamp;
import java.util.ArrayList;

public class DigitalAppException extends Throwable
{

	private static final long serialVersionUID = 1L;
	
	private Throwable originalException;
	private Timestamp exceptionTime;
	private String description;
	private String useCaseName;
	private ArrayList<String> descriptionParams = new ArrayList<String>();
	private String exceptionStackTrace;
	private String exceptionType;
	private String errorCode;

	public DigitalAppException(Throwable originalException, Timestamp exceptionTime, String description,
			String useCaseName, ArrayList<String> descriptionParams, String exceptionStackTrace,
			String exceptionType)
	{
		super(originalException.getMessage());
		this.originalException = originalException;
		this.exceptionTime = exceptionTime;
		this.description = description;
		this.useCaseName = useCaseName;
		this.descriptionParams = descriptionParams;
		if (exceptionStackTrace.length() > 4000)
		{
			this.exceptionStackTrace = getExceptionStackTrace().substring(0, 4000);
		}
		this.exceptionType = exceptionType;
	}

	public DigitalAppException(Throwable originalException)
	{
		super(originalException);
		this.originalException = originalException;
		if (originalException instanceof DigitalAppException)
		{
			this.errorCode = ((DigitalAppException) originalException).getErrorCode();
		}

	}

	public DigitalAppException(String errorCode, Throwable cause)
	{
		super(cause);
		this.errorCode = errorCode;
	}

	public DigitalAppException(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public DigitalAppException()
	{
	}

	public Throwable getOriginalException()
	{
		return originalException;
	}

	public void setOriginalException(Throwable originalException)
	{
		this.originalException = originalException;
	}

	public Timestamp getExceptionTime()
	{
		return exceptionTime;
	}

	public void setExceptionTime(Timestamp exceptionTime)
	{
		this.exceptionTime = exceptionTime;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getUseCaseName()
	{
		return useCaseName;
	}

	public void setUseCaseName(String useCaseName)
	{
		this.useCaseName = useCaseName;
	}

	public ArrayList<String> getDescriptionParams()
	{
		return descriptionParams;
	}

	public void setDescriptionParams(ArrayList<String> descriptionParams)
	{
		this.descriptionParams = descriptionParams;
	}

	public String getExceptionStackTrace()
	{
		return exceptionStackTrace;
	}

	public void setExceptionStackTrace(String exceptionStackTrace)
	{
		this.exceptionStackTrace = exceptionStackTrace;
	}

	public String getExceptionType()
	{
		return exceptionType;
	}

	public void setExceptionType(String exceptionType)
	{
		this.exceptionType = exceptionType;
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}
}
