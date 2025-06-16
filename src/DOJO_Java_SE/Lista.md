Questões Oficial do DOJO Java SE

• Nível Fácil (10 pontos)

1. Encapsulamento Básico:
   Crie uma classe ContaBancaria com os atributos numeroConta, saldo e nomeTitular. Implemente métodos para depositar, sacar e consultar o saldo. Utilize encapsulamento para garantir que o saldo só pode ser modificado pelos métodos depositar e sacar.


2. Herança Simples:
   Crie uma classe Animal com um método emitirSom(). Depois, crie as subclasses Cachorro e Gato, cada uma com sua própria implementação de emitirSom().


3. Objeto e Métodos:
   Crie uma classe Produto com os atributos nome, preco e quantidade. Implemente um método calcularTotal() que retorna o valor total baseado na quantidade de produtos.

---

• Nível Médio (20 pontos)


4. Herança com Polimorfismo:
   Crie uma classe Funcionario com os atributos nome, salarioBase, e um método calcularSalario(). Implemente as subclasses Gerente e Vendedor, onde Gerente tem um bônus fixo de 20% no salário e Vendedor tem uma comissão de 5% sobre as vendas realizadas. Utilize polimorfismo para calcular o salário de diferentes tipos de funcionários.


5. Encapsulamento e Validação:
   Crie uma classe Usuario com os atributos nome, email e senha. Implemente um método alterarSenha(String novaSenha) que só permite a alteração da senha se a nova senha tiver pelo menos 8 caracteres e conter ao menos um número.


6. Matemática em Objetos:
   Crie uma classe Circulo que possua o atributo raio. Implemente os métodos calcularArea() e calcularCircunferencia() que retornem, respectivamente, a área e a circunferência do círculo.

---

Nível Difícil (30 pontos)

7. Encapsulamento e Herança Avançados:
   Implemente uma classe Veiculo com os atributos marca, modelo e ano. Crie métodos para acelerar, frear, e mostrar a velocidade atual. Crie as subclasses Carro e Moto, onde Carro tem um limite de velocidade maior que Moto. Use encapsulamento para garantir que a velocidade não exceda o limite definido para cada tipo de veículo.


8. Composição e Encapsulamento:
   Crie uma classe Pedido que contém uma lista de Produto. Implemente métodos para adicionar produtos ao pedido, calcular o valor total do pedido e mostrar os produtos no pedido. Utilize encapsulamento para que a lista de produtos não possa ser acessada diretamente.


9. Matemática e Polimorfismo:
   Crie uma classe abstrata FormaGeometrica com o método abstrato calcularArea(). Implemente as subclasses Retangulo, Triangulo e Circulo, cada uma com sua própria implementação de calcularArea(). Crie uma lista de FormaGeometrica e calcule a área total de todas as formas na lista.

---

• Questão Bônus (50 pontos)

10. Herança, Encapsulamento e Polimorfismo Combinados:
    Implemente um sistema de TransportePublico que inclui as classes Veiculo, Onibus, Trem, e Metro. A classe Veiculo deve ter atributos comuns como capacidadeMaxima, velocidadeAtual e custoOperacional. Cada tipo de veículo (Onibus, Trem, Metro) deve ter uma maneira diferente de calcular o custo operacional (por exemplo, Onibus baseado no combustível, Trem na eletricidade, etc.). Utilize polimorfismo para calcular o custo operacional e encapsulamento para garantir que os atributos dos veículos só possam ser modificados através de métodos específicos.

---

• Desafio de Morte Súbita

Título: Sistema de Reservas de Salas


Descrição do Desafio: O desafio consiste em implementar um sistema básico de reservas de salas de reunião para uma empresa. O sistema deve permitir o cadastro de salas, a realização de reservas, e a verificação de disponibilidade das salas.
Requisitos:
1. Classe Sala:
   o A classe Sala deve ter os seguintes atributos:
* nome (String): Nome da sala.
* capacidade (int): Capacidade máxima de pessoas na sala.
* reservas (List<Reserva>): Lista de reservas associadas à sala.
2. Classe Reserva:
   o A classe Reserva deve ter os seguintes atributos:
* data (String): Data da reserva no formato "dd/MM/yyyy".
* horaInicio (String): Hora de início da reserva no formato "HH
  ".
* horaFim (String): Hora de término da reserva no formato "HH
  ".
* responsavel (String): Nome do responsável pela reserva.
3. Métodos na Classe Sala:
   o adicionarReserva(Reserva reserva): Adiciona uma nova reserva à sala se ela não estiver em conflito com outra reserva existente.


   - verificarDisponibilidade(String data, String horaInicio, String horaFim):
   - Verifica se a sala está disponível para o período informado e retorna um booleano.
4. Regras de Negócio:
  

   - Não pode haver reservas conflitantes (mesmo dia e horário sobreposto) para a mesma sala.
   - O método verificarDisponibilidade deve retornar true se não houver conflitos e false se houver.


   Exemplo de Uso:
1. Cadastro de Sala:
   o Criar uma sala chamada "Sala 101" com capacidade para 10 pessoas.


2. Realizar Reservas:


   - Realizar uma reserva para a "Sala 101" no dia 10/09/2024, das 09:00 às 11:00, com o responsável "João".

 
   - Tentar realizar uma nova reserva para a "Sala 101" no mesmo dia, das 10:00 às 12:00, com o responsável "Maria".
   - Esta reserva deve ser rejeitada devido ao conflito de horários.


3. Verificar Disponibilidade:
   o Verificar se a "Sala 101" está disponível no dia 10/09/2024, das 11:00 às 12:00. O resultado deve ser true.


   Critérios de Avaliação:
* O código deve estar funcional e sem erros de compilação.
* A lógica de verificação de disponibilidade deve estar correta, garantindo que não existam conflitos de horários.
* A implementação deve ser eficiente e seguir boas práticas de programação em Java.
  Tempo: A primeira equipe que entregar a solução correta ganha o desafio.

