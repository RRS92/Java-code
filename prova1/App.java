package prova1;

import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedro");
		f1.setIdade(25);
		f1.setGenero("masculino");
		f1.setCargo("Estagiario");
		f1.setSalario(1500);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Mariana");
		f2.setIdade(32);
		f2.setGenero("feminino");
		f2.setCargo("Gerente");
		f2.setSalario(12000);
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos");
		f3.setIdade(43);
		f3.setGenero("Masculino");
		f3.setCargo("CEO");
		f3.setSalario(23500);
		
		List <Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		
		Departamento dep = new Departamento();
		dep.setNome("Diretoria");
		dep.setFuncionario(lista);
		
		Empresa emp = new Empresa();
		emp.setNome("LeoSoft S/A");
		emp.setCnpj("123.456.789.0");
		emp.setDepartamento(dep);
		
		System.out.println("Departamento: " + dep.getNome());
		System.out.println("Empresa: " + emp.getNome());
		System.out.println("CNPJ Empresa: " + emp.getCnpj());
		System.out.println("------------------------------------");
		for (Funcionario func : emp.getDepartamento().getFuncionario()) {
			System.out.println("Nome do funcionario: " + func.getNome());
			System.out.println("Idade do funcionario: " + func.getIdade());
			System.out.println("Genero do funcionario: " + func.getGenero());
			System.out.println("Cargo do funcionario: " + func.getCargo());
			System.out.println("Salario do funcionario: " + func.getSalario());
			System.out.println("------------------------------------");
			
		}
		

	}

}