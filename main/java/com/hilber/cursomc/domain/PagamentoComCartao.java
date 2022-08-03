package com.hilber.cursomc.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hilber.cursomc.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("PagamentoComCartao")
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
