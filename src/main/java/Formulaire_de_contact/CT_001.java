package Formulaire_de_contact;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CT_001 {

	public static void main(String[] args) throws IOException {
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://form.jotform.com/241263471608354");
		driver.manage().window().maximize();
		
		Formulaire_de_contact contact = new Formulaire_de_contact(driver);
		contact.setCaptcha();
		contact.submit();
		if(driver.getPageSource().contains("There are errors on the form. Please fix them before continuing."))
			System.out.println("Test Case 001 passed !");
		else
			System.out.println("Test Case 001 failed !");
		
		driver.quit();*/
	}

}
