package com.company.entidades;

import org.junit.jupiter.api.*;

/*
REPOS DE TESTE
https://github.com/angelogluz/LocadoraSpringBoot
https://github.com/angelogluz/APII-TesteUnitario/blob/master/JUnit.md
*/

class ClienteTest {
    Cliente cliqPaga;
    Cliente cliqDeve;

    @BeforeEach
    @DisplayName("@BeforeEach - executes before each test method in this class")
    void inicia() {

        cliqPaga = new Cliente("Thais", 18);
        cliqDeve = new Cliente("Thais", 11);
    }

    @Test
    @DisplayName("Valor de entrada deve ser maior do que o valor da multa")
    void testaValorEntrada() {

        double troco = cliqPaga.pagarMulta(20);
        Assertions.assertEquals(2, troco, "Valor de entrada deve ser maior do que o valor da multa");
    }

    @Test
    @DisplayName("Valor de entrada deve ser igual ao valor da multa")
    void testaValorEntrada2() {

        double troco = cliqDeve.pagarMulta(11);
        Assertions.assertEquals(0, troco);
    }

    /* ESSE AINDA TO FAZENDO, SE QUISER DALE PAU.
    Não to conseguindo pegar o getEmail nem o setEmail, acho que precisamos fazer outro método isolado,
    só que vai ficar igual aos de cima...
    Pode mudar o que tu precisar no código, ele só existe pra servir aos testes.

    @Test
    @DisplayName("O email deve conter um @")
    void testaEmail() {

        //String possivelEmail = cliqDeve.getEmail("fulana@company.com");
        String emailValido = cliqDeve.nome+"@company.com";

        Assertions.assertEquals(emailValido, possivelEmail );
    }*/

/*
    @Disabled("Desabilitado até Gravação")
    @Test
    @DisplayName("")
    void testeFalho() {
        Assertions.fail("Este teste falhará");
    }

*/
}