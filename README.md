# SSR
## Solicitação de Serviço

1 - Descrição do Projeto (1.0 ponto): Avaliar a qualidade da descrição do projeto, desenvolvida no âmbito da componente curricular de Programação Orientada a Objetos na USF. Esta descrição deve ser nítida e abrangente, englobando o propósito da aplicação, seu público-alvo e os principais recursos a serem implementados.

R: O projeto consiste em um sistema de solicitação de serviços desenvolvido em Java com o framework Spring. O propósito da aplicação é facilitar a abertura e acompanhamento de chamados para diversos setores de uma empresa, incluindo Administração, Recursos Humanos, Montagem, Ferramentaria, Injeção Plástica, Manutenção, entre outros. O público-alvo são os funcionários desses setores que necessitam de suporte técnico do setor de TI. A aplicação permite o registro de informações como o nome do solicitante, a data de abertura do chamado, o setor específico, e uma descrição breve do ocorrido. O sistema visa otimizar o processo de comunicação entre os setores, garantindo um suporte eficiente e organizado.

2 - Nome dos Desenvolvedores e RA (0.5 ponto): Verificar se o nome completo e o RA dos desenvolvedores/alunos estão devidamente registrados no README.md.

R: Ricardo Oliveira Silva - RA 001202000104
   Luiz Fellipe Vieira – RA 202105193

3 - Tecnologia Empregada (0.5 ponto):  Avaliar a escolha e justificativa das tecnologias utilizadas no projeto, como linguagens de programação (Java), frameworks, bibliotecas, bancos de dados, etc.

R: A escolha da linguagem de programação Java foi fundamentada na sua versatilidade, portabilidade e robustez. O framework Spring foi escolhido devido à sua arquitetura modular, que facilita o desenvolvimento, além de oferecer suporte a boas práticas de programação e injeção de dependências. A utilização de um banco de dados relacional, H2 Database juntamente do Spring Data JDA é justificada pela necessidade de armazenar e recuperar informações de forma estruturada.

4 - Descrição da Arquitetura (1.0 ponto): Avaliar a descrição da arquitetura da aplicação, incluindo a estrutura das classes, módulos e a relação entre eles. Deve demonstrar uma compreensão clara dos conceitos de Programação Orientada a Objetos.

R: A aplicação possui três classes principais: SssApiApplication, SssController, e Chamado.
   SssApiApplication = Função: Inicia a aplicação Spring Boot.
                       Relação: Dependente das outras classes para funcionar.
                       
   SssController = Função: Controlador Spring para manipular solicitações HTTP relacionadas aos chamados.
                   Métodos Principais: listar (GET) e adicionar (POST).
                   Dependência: Usa ChamadoRepository para acessar dados dos chamados.
                   
   Chamado = Função: Representa a entidade JPA para mapear uma tabela no banco de dados.
             Campos: Relacionados aos chamados.
             Dependência: Utilizada pelo ChamadoRepository para persistência.
             
   ChamadoRepository = Função: Fornece métodos CRUD para a entidade Chamado
                       Dependência: Utiliza a entidade Chamado para persistência.
                       
5 - Funcionalidade (2.0 pontos): Avaliar o desempenho da aplicação em relação às funcionalidades do sistema CRUD (Create, Read, Update, Delete). Verifique se todas as operações foram implementadas corretamente e se a aplicação demonstra total funcionalidade. Os alunos também podem incluir imagens ou vídeos explicativos para facilitar a compreensão das funcionalidades.

R: A classe sssControler é responsável pelo controle dos chamados, oferecendo endpoints para listar todos os chamados (GET /Chamado) e adicionar novos chamados (POST /Chamado). A implementação segue os princípios RESTful e utiliza adequadamente as anotações do Spring. A classe Chamado representa a entidade do chamado com os atributos relevantes, e o ChamadoRepository faz uso do Spring Data JPA para operações CRUD no banco de dados.

6 - Documentação (1.0 ponto): Avaliar a qualidade da documentação do projeto, incluindo comentários no código, explicações de classes e métodos, e qualquer outra documentação relevante que facilite a compreensão do projeto.

R: x

7 - Inovação e Criatividade (1.0 ponto): Avaliar a inovação e a criatividade no projeto, considerando recursos adicionais ou funcionalidades que vão além do básico CRUD e qualquer ideia original incorporada pelo grupo.

R: O projeto é sólido, mas para maior inovação, poderia incluir funcionalidades adicionais que vão além do básico CRUD. Por exemplo, poderia ser explorada a implementação de filtros avançados para busca de chamados, autenticação de usuários, e notificações em tempo real. Essas adições demonstrariam um nível mais avançado de desenvolvimento e contribuiriam para uma experiência mais rica do usuário.




