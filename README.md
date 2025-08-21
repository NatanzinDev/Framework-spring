SITE PARA CRIAR O PROJETO SPRING: start.spring.io

Group e artifact → Convenção adotada para definir o nome do pacote e sua hierarquia

Pacotes de cores claras no eclipse são os que o projeto principal utiliza, já os escuros são utilizados pelo projeto de teste.

application properties → Serve para colocar os parâmetros de informações do banco de dados.

Controller é responsável por expor a API para que o browser acesse.

Classe controller deve conter a notação @RestController

Atributos em que vem de uma requisição na assinitura do metodo deve ter a notação @RequestBody

# Site para ver resposta http: https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Reference/Status

### Erros
<ol>
  <li>Os pacotes tem que está corretamente organizados na hierarquia de pacotes, para evitar erros com not found</li>
  <li>Case sensitive, não colocar letras maiusculas em caminhos getmapping por exemplo</li>
  <li>As letras do json na requisição deve estar todas de acordo com a nomeclatura original da classe, pois mesmo que esteja apenas uma letra errada esse atributo com a letra errada vai ficar null</li>
  <li>A requisições espera um formato json, se não estiver de acordo vai ocorrer o erro 415</li>
</ol>
