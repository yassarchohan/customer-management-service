package com.etisalat.customer.dto.common;

public class RequestHandler<T> {

	private T data;
	private PaginationDTO pagination;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public PaginationDTO getPagination() {
		return pagination;
	}

	public void setPagination(PaginationDTO pagination) {
		this.pagination = pagination;
	}
}