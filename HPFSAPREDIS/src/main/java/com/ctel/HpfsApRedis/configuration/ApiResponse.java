
package com.ctel.HpfsApRedis.configuration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String size;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shCode;

    public String getShCode() {
		return shCode;
	}

	public void setShCode(String shCode) {
		this.shCode = shCode;
	}

	public ApiResponse() {
        // Default constructor
    }

    public ApiResponse(String message, T data, String size) {
        this.message = message;
        this.data = data;
        this.size = size;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
