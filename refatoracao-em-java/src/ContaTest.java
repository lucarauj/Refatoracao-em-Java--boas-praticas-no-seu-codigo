import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
public class ContaTest {

    @Test
    public void aoSacarUmValorDeUmaContaDeveSofrerUmaSubtracaoDesseValor() {
        Conta conta = new Conta(1000);
        conta.sacar(200);

        assertThat(conta.getSaldo(), is(equalTo(800.0)));

    }
}
