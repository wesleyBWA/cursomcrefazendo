package com.bwacomputacao.cursomcrefazendo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bwacomputacao.cursomcrefazendo.domain.Categoria;
import com.bwacomputacao.cursomcrefazendo.domain.Cidade;
import com.bwacomputacao.cursomcrefazendo.domain.Cliente;
import com.bwacomputacao.cursomcrefazendo.domain.Endereco;
import com.bwacomputacao.cursomcrefazendo.domain.Estado;
import com.bwacomputacao.cursomcrefazendo.domain.Produto;
import com.bwacomputacao.cursomcrefazendo.domain.enums.TipoCliente;
import com.bwacomputacao.cursomcrefazendo.repositories.CategoriaRepository;
import com.bwacomputacao.cursomcrefazendo.repositories.CidadeRepository;
import com.bwacomputacao.cursomcrefazendo.repositories.ClienteRepository;
import com.bwacomputacao.cursomcrefazendo.repositories.EnderecoRepository;
import com.bwacomputacao.cursomcrefazendo.repositories.EstadoRepository;
import com.bwacomputacao.cursomcrefazendo.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcrefazendoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoReposytory;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcrefazendoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
         Categoria cat1 = new Categoria(null, "Informatica");
         Categoria cat2 = new Categoria(null, "Escritorio");
         
         Produto p1 = new Produto(null, "computador", 2000.00);
         Produto p2 = new Produto(null, "impresora", 800.00);
         Produto p3 = new Produto(null, "mouse", 80.00);
         
         cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
         cat2.getProdutos().addAll(Arrays.asList(p2));
         
         p1.getCategorias().addAll(Arrays.asList(cat1));
         p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
         p3.getCategorias().addAll(Arrays.asList(cat1));
           
         
     categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
     produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
     
     
     
     Estado est1 = new Estado(null, "Minas Gerais");
     Estado est2 = new Estado(null, "Sao Paulo");
     
     Cidade c1 = new Cidade(null, "Uberlandia", est1);
     Cidade c2 = new Cidade(null, "Sao Paulo", est2);
     Cidade c3 = new Cidade(null, "Campinas", est2);
     
     est1.getCidades().addAll(Arrays.asList(c1));
     est2.getCidades().addAll(Arrays.asList(c2, c3));
     
     estadoRepository.saveAll(Arrays.asList(est1, est2));
     cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
     
     Cliente cli1 = new Cliente(null, "Maria silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
   
     cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
   
     Endereco e1 = new Endereco(null, "Rua flores", "303", "Apto 303", "jardins", "38220834", cli1, c1);
     Endereco e2 = new Endereco(null, "Avenida Matos", "105", "sala 800", "centro", "38777012", cli1, c2);
  
     cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
     
     clienteRepository.saveAll(Arrays.asList(cli1));
     enderecoReposytory.saveAll(Arrays.asList(e1, e2));
     
	}

}
