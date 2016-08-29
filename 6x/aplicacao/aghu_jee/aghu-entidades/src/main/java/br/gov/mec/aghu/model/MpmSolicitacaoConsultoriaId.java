package br.gov.mec.aghu.model;

// Generated 11/08/2009 16:20:48 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmSolicitacaoConsultoriaId generated by hbm2java
 */
@Embeddable
public class MpmSolicitacaoConsultoriaId implements EntityCompositeId {

	private static final long serialVersionUID = 7967740845904324537L;

	@Column(name = "ATD_SEQ", nullable = false)
	private Integer atdSeq;

	@Column(name = "SEQ", nullable = false)
	private Integer seq;

	public MpmSolicitacaoConsultoriaId() {
	}

	public MpmSolicitacaoConsultoriaId(Integer atdSeq, Integer seq) {
		this.atdSeq = atdSeq;
		this.seq = seq;
	}

	/**
	 * Evitar de usar a referência para a entidade de Atendimentos.
	 * Esta referência ainda foi mantida por questões do legado do 
	 * HC de Porto Alegre (HCPA). Ao invés de referenciar Atendimentos
	 * preterir referenciar a entidade de Prescrição Médica. 
	 * @return Sequencial do atendimento
	 */
	@Deprecated
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	@Deprecated
	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmSolicitacaoConsultoriaId)) {
			return false;
		}
		MpmSolicitacaoConsultoriaId castOther = (MpmSolicitacaoConsultoriaId) other;

		return (this.getAtdSeq().equals(castOther.getAtdSeq()))
				&& (this.getSeq().equals( castOther.getSeq()) );
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAtdSeq();
		result = 37 * result + this.getSeq();
		return result;
	}

}