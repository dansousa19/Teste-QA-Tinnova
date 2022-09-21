package pages;

import org.openqa.selenium.By;

public class Metodos extends Browsers {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("***** erro ao clicar *****" + e.getMessage());
			System.out.println("***** causa do erro *****" + e.getCause());
		}

	}
	
	public void digitar(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("***** erro ao clicar *****" + e.getMessage());
			System.out.println("***** causa do erro *****" + e.getCause());
		}
		
	}
}
