package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Schema(
        name = "Customer",
        description = "Schema to capture customer details"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer",
            example = "Sami Yilmaz"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5, max = 50, message = "Name should be between 5 and 50 characters")
    private String name;
    @Schema(
            description = "Email of the customer",
            example = "msy@gmail.com"
    )
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;
    @Schema(
            description = "Mobile number of the customer",
            example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    @NotEmpty(message = "Mobile number cannot be empty")
    private String mobileNumber;

    @Schema(
            description = "Accounts details of the customer"
    )
    private AccountsDto accountsDto;

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
