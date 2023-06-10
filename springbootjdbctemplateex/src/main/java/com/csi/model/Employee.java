package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int empId;

    private String empName;

    private String empAddress;

    private double empSalary;

    private long empContactNumber;


}
