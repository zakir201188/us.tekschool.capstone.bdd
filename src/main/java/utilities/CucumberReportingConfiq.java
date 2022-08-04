package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

public class CucumberReportingConfiq {

	public static void reportConfig() {
	 	File reportOutputDirectory = new File("target");
	 	
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target\\cucumber.json");
		
				String buildNumber = "1";
		String projectName = "Tek School Retail Website - Tigers";

			Configuration configuration = new Configuration(reportOutputDirectory, projectName);
			
			configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
			configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
			configuration.setBuildNumber(buildNumber);
			configuration.addClassifications("Platform", "Windows");
			configuration.addClassifications("Browser", "chrome");
			configuration.addClassifications("Branch", "release/1.0");

			ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
			Reportable result = reportBuilder.generateReports();
			
		}
	

			}


