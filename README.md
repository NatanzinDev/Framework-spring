## Primeiros passos com SpringBoot
SITE PARA CRIAR O PROJETO SPRING: start.spring.io

Group e artifact → Convenção adotada para definir o nome do pacote e sua hierarquia

Pacotes de cores claras no eclipse são os que o projeto principal utiliza, já os escuros são utilizados pelo projeto de teste.

application properties → Serve para colocar os parâmetros de informações do banco de dados.

## Enviando e Recebendo dados na sua API
Controller é responsável por expor a API para que o browser acesse.

Classe controller deve conter a notação @RestController

Atributos em que vem de uma requisição na assinitura do metodo deve ter a notação @RequestBody

## Manipulando o protocolo HTTP
Site para ver resposta http: https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Reference/Status

ResponseEntity é uma reposta http que o corpo pode conter um objeto, pode ser usado para retornar resposta em funções<br>
ResponseEntity<NomeDoObjeto>

## Componentes, Serviços e Injeção de Dependências
Camada de serviço faz a ligação entre o controller e o model, é onde vai ficar as regras de negócio, já que não uma boa pratica sobrecarregar o controller com regras de negócio.

Na injeção de dependencia você delega o instanciamento e a alocação de memoria tudo para JVM.

@Autowired
Injeção de dependência, se não existir instância ela vai cuidar da instância para você.

## Arquitetura de um BackEnd
Detalhando

Controllers -Expor as APls através de Endpoints (URL + Método HTTP)

Model -Objetos armazenáveis no Banco de Dados

DTO -Objetos oriundos de "Transfomação" de dados Puros para Dados Derivados (ex totais de vendas por mês, pois isso obtenho a partir dos objetos de Pedidos)

Services

InterfaceService (IS) - Definir uma forma única de chamada a um determinado serviço

Servicelmplementação - Implementações variávels destes serviços de modo a, se for o caso, mudar a implementação com o mínimo de trauma na aplicação

<img width="1478" height="822" alt="Captura de tela 2025-09-03 103013" src="https://github.com/user-attachments/assets/02f6c9d0-d78b-4f14-9b9b-4825e06fd099" />


## Lembrando 
Interface: Seria um contrato que contém todas as funcionalidas que você quer que um objeto implemente.
## Erros
<ol>
  <li>Os pacotes tem que está corretamente organizados na hierarquia de pacotes, para evitar erros com not found</li>
  <li>Case sensitive, não colocar letras maiusculas em caminhos getmapping por exemplo</li>
  <li>As letras do json na requisição deve estar todas de acordo com a nomeclatura original da classe, pois mesmo que esteja apenas uma letra errada esse atributo com a letra errada vai ficar null</li>
  <li>A requisições espera um formato json, se não estiver de acordo vai ocorrer o erro 415</li>
</ol>
