package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	Metodos metodos = new Metodos();
	
	By btnEntrar = By.xpath("//div[text()='Entrar']");
	By btnAdicionar = By.xpath("//div[text()='Adicionar']");
	By btnName = By.xpath("//*[@id=\"root\"]/div/div[2]/span");
	By name = By.xpath("//*[@id=\"root\"]/div/div[2]/input");
	By btnEmail = By.xpath("//*[@id=\"root\"]/div/div[3]/span");
	By email = By.xpath("//*[@id=\"root\"]/div/div[3]/input");
	By btnCpf = By.xpath("//*[@id=\"root\"]/div/div[4]/span");
	By cpf = By.xpath("//*[@id=\"root\"]/div/div[4]/input");
	By btnTelefone = By.xpath("//*[@id=\"root\"]/div/div[5]/span");
	By telefone = By.xpath("//*[@id=\"root\"]/div/div[5]/input");
	By btnGuardar = By.xpath("//div[text()='GUARDAR']");

	public void menu(String menu) throws InterruptedException {
		
		if(menu.equalsIgnoreCase("btnEntrar")) {
			Thread.sleep(1200);
			metodos.clicar(btnEntrar);
			
		}else if(menu.equalsIgnoreCase("btnAdicionar")) {
			Thread.sleep(1200);
			metodos.clicar(btnAdicionar);
			
		}else if(menu.equalsIgnoreCase("btnName")) {
			Thread.sleep(1200);
			metodos.clicar(btnName);
			Thread.sleep(1200);
			metodos.digitar(name, "Danilo");
			
		}else if(menu.equalsIgnoreCase("btnEmail")) {
			Thread.sleep(1200);
			metodos.clicar(btnEmail);
			Thread.sleep(1200);
			metodos.digitar(email, "danilo@gmail.com.br");
			
		}else if(menu.equalsIgnoreCase("btnCpf")) {
			Thread.sleep(1200);
			metodos.clicar(btnCpf);
			Thread.sleep(1200);
			metodos.digitar(cpf, "345.654.098-11");
			
		}else if(menu.equalsIgnoreCase("btnTelefone")) {
			Thread.sleep(1200);
			metodos.clicar(btnTelefone);
			Thread.sleep(1200);
			metodos.digitar(telefone, "11945530763");
			
		}else if(menu.equalsIgnoreCase("btnGuardar")) {
			Thread.sleep(1200);
			metodos.clicar(btnGuardar);
		}
	}
}
