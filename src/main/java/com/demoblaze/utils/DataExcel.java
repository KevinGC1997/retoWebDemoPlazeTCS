package com.demoblaze.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.demoblaze.utils.Constant.*;
import static com.demoblaze.utils.ExcelDataTable.ReadData;

public class DataExcel {

    public ArrayList<Map<String, String>> dataExcel() throws IOException {

        ArrayList<Map<String, String>> dataExcel;

        return  dataExcel = ReadData(excelPath, excelSheet);
    }
}
