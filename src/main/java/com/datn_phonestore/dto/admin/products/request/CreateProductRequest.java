package com.datn_phonestore.dto.admin.products.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateProductRequest {
    String name;
    BigDecimal basePrice;
    String mainImg;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d/M/yyyy")
    LocalDate CreateDate;
    Integer warranty;
    Long subCategoryId;
    String screenSize;
    String screenResolution;
    String processor;
    String rearCamera;
    String frontCamera;
    String battery;
    boolean fastCharging;
    boolean water_resistance;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d/M/yyyy")
    LocalDate releaseDate;
    Long os;
    String design;
    String material;
    double weight;
    String batteryType;
    String network;
    String sim;
    String wifi;
    String gps;
    boolean nfc;

}
