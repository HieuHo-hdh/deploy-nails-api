package com.landingis.api.form.importExport;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateImportExportForm {
    @NotNull(message = "categoryId cannot be null")
    @ApiModelProperty(name = "categoryId")
    private Long categoryId;

    @ApiModelProperty(name = "code")
    private String code;
    @ApiModelProperty(name = "filePath")
    private String filePath;

    @NotNull(message = "money cannot be null")
    @ApiModelProperty(name = "money")
    private Double money;
    @ApiModelProperty(name = "note")
    private String note;

    @NotNull(message = "kind cannot be null")
    @ApiModelProperty(name = "kind")
    private Integer kind;
}
