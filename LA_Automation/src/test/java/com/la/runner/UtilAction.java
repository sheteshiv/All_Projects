package com.la.runner;
import java.io.IOException;

import com.configuration.la.Config;
import com.utility.la.ExcelUtil;

public class UtilAction {
	
	public static void dataUtil() throws IOException {
		
		ExcelUtil.gotoFilePath(Config.filePaths, "Sheet1");
		ExcelUtil.readData(1, 1);
		ExcelUtil.readData(1, 2);
		ExcelUtil.writeData(1, 3, "Pass");
		
		
	}

}
