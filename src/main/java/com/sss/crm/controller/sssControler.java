package com.sss.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sss.crm.model.Chamado;
import com.sss.crm.repository.ChamadoRepository;

@RestController /* <-- Controlador que lida com solicitações HTTP e retorna respostas no formato desejado (geralmente JSON).*/
@RequestMapping("/Chamado") /* <-- Define a URL e o método HTTP que o método do controlador manipulará.*/
public class sssControler {
	
	@Autowired /* <-- Anotação usada em Spring para realizar a injeção de dependência automaticamente,
	conectando componentes do aplicativo sem a necessidade de criação manual de instâncias.*/
	private ChamadoRepository chamadoRepository;

	@GetMapping /* <-- Anotação usada em um método de controle (marcado com @RestController)
	para mapear solicitações HTTP GET para esse método, indicando a URL que acionará a execução do método.*/
	public List<Chamado> listar() {
		return chamadoRepository.findAll(); /* <-- Retorna todos os chamados do repositório.*/
	}
	
	@PostMapping /* <-- Mapea solicitações HTTP POST para esse método,
	indicando a URL que acionará a execução do método. Essa anotação é usada para lidar com operações de criação ou envio de dados para o servidor.*/
	
	@ResponseStatus(HttpStatus.CREATED) /* <-- Usada para definir o código de status HTTP que um método de controle (marcado com @RestController)
	deve retornar como resposta padrão. Permite personalizar o código de status da resposta HTTP para diferentes situações.*/
	
	public Chamado adicionar (@RequestBody Chamado chamado) {
		return chamadoRepository.save(chamado); /* <-- Adiciona um novo chamado ao repositório e o retorna.*/
	}

	/* Possiveis Exceções
	 
	 DataAccessException: Essa é uma exceção genérica para problemas de acesso a dados.
	 Ela é frequentemente lançada quando ocorre algum problema durante uma operação no banco de dados. Pode envolver exceções mais específicas.
	
	 JpaSystemException: Esta exceção é lançada para problemas específicos do sistema JPA,
	 como violações de restrições únicas ou falhas durante a execução de consultas.
	
	 ConstraintViolationException: Lançada quando ocorre uma violação de restrição de banco de dados, por exemplo,
	 ao tentar inserir dados duplicados em uma coluna com uma restrição única.
	
	*/
	
	/* Try Catch
	 * @RestController
	   @RequestMapping("/Chamado")
	public class sssController {

    	@Autowired
    private ChamadoRepository chamadoRepository;

    	@GetMapping
    public List<Chamado> listar() {
        return chamadoRepository.findAll();
    }

   	 @PostMapping
    	 @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> adicionar(@RequestBody Chamado chamado) {
        try {
            Chamado novoChamado = chamadoRepository.save(chamado);
            return new ResponseEntity<>(novoChamado, HttpStatus.CREATED);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Erro ao salvar chamado no banco de dados", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Erro desconhecido ao salvar chamado", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    	}
		}
		
	 */
}


