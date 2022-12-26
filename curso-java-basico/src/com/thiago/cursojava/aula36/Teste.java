package com.thiago.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Thiago");
		//contato.setEndereco("Rio Preto");
		//contato.setTelefone("17 99999-9999");
		
		//criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Thiago");
		end.setNumero("277");
		end.setComplemento("Casa");
		end.setCidade("Rio Preto");
		end.setEstado("Sao Paulo");
		end.setCep("9999999");
		
		contato.setEndereco(end);

		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("17");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone.setTipo("casa");
		telefone.setDdd("17");
		telefone.setNumero("99999-9999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2; 
		
		contato.setTelefones(telefones);
		
		//contato.setTelefone(telefone); 
		
		//teste saida no console
		System.out.println(contato.getNome());
		
		/*if(contato!=null &&  contato.getTelefone()!=null) {
			System.out.println(contato.getTelefone().getDdd() +" "+ contato.getTelefone().getNumero());
		}*/
		
		if(contato!= null && contato.getTelefones()!=null) {
			for(Telefone t: contato.getTelefones()){
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
	}

}
