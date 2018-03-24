# XY-Inc

A aplicação XY-Inc foi desenvolvida em Java juntamente com o framework Spring Boot.

Ela possui 3 serviços:
Serviço para cadastrar pontos de interesse com 3 atributos = serviço está disponivel pela URL https://xy-inc-lucas.herokuapp.com/poi através de uma requisição POST passando com parametros de entrada nome do POI, coordenada X e coordenada Y.
Ex:
{
  "nome" : "Shopping",
  "coordenada_x" : 10,
  "coordenada_y" : 10
}

Serviço para listar todos os POIs cadastrados = serviço está disponivel pela URL https://xy-inc-lucas.herokuapp.com/poi através de uma requisição GET, onde serão mostrados todos os POI's cadastrados

Serviço para listar POIs por proximidade = serviço está disponivel pela URL https://xy-inc-lucas.herokuapp.com/poi/next?x=A&y=B&distance=C, onde A é o valor da coordenada X, B é o valor da coordenda Y e C é o valor da distancia maxima.

A aplicação também pode ser executada para testes locais. Basta fazer o download e rodar a aplicação, que ja esta configurada para testes.

Na classe DbService estão os objetos criados para teste:
'Lanchonete' (x=27, y=12)
'Posto' (x=31, y=18)
'Joalheria' (x=15, y=12)
'Floricultura' (x=19, y=21)
'Pub' (x=12, y=8)
'Supermercado' (x=23, y=6)
'Churrascaria' (x=28, y=2)
