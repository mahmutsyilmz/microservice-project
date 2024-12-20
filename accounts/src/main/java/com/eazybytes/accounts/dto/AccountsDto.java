package com.eazybytes.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Schema(
        name = "Accounts",
        description = "Schema to capture account details"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the customer",
            example = "1234567890"
    )
    @NotEmpty(message = "Account Number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number should be 10 digits")
    private Long accountNumber;
    @Schema(
            description = "Account Type of the customer",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type cannot be empty")
    private String accountType;
    @NotEmpty(message = "Branch Address cannot be empty")
    @Schema(
            description = "Branch Address of the customer"
    )
    private String branchAddress;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
