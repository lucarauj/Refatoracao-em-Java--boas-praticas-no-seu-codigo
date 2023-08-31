package br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;

import java.math.BigDecimal;

public enum TipoDeDesconto {
	
	CUPOM_DE_DESCONTO, FIDELIDADE, NENHUM;

	public Money getValor(Money subtotal) {
		Money valor = Money.of(0, Livraria.reais);
		
		if(this.equals(TipoDeDesconto.CUPOM_DE_DESCONTO)) {
			valor = subtotal.subtract(subtotal.with(quantia -> quantia.subtract(Money.of(5, Livraria.reais))));
		}
		else if(this.equals(TipoDeDesconto.FIDELIDADE)) {
			valor = subtotal.subtract(subtotal.with(quantia -> quantia.multiply(BigDecimal.ONE.subtract(porcentagem(new BigDecimal(10))))));
		}
		return valor;
	}

	private BigDecimal porcentagem(BigDecimal fatorDeCalculo) {
		return fatorDeCalculo.divide(BigDecimal.valueOf(100));
	}
}