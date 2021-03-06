package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * McoReanimacaoRnJn generated by hbm2java
 */
@Entity
@Table(name = "MCO_REANIMACAO_RNS_JN", schema = "AGH")
@Immutable
public class McoReanimacaoRnJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 3655460171321341182L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer rnaGsoPacCodigo;
	private Short rnaGsoSeqp;
	private Short rnaSeqp;
	private Integer pniSeq;
	private Integer dose;
	private String unidade;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;
	private String vadSigla;

	public McoReanimacaoRnJn() {
	}

	public McoReanimacaoRnJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer rnaGsoPacCodigo, Short rnaGsoSeqp,
			Short rnaSeqp, Integer pniSeq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.rnaGsoPacCodigo = rnaGsoPacCodigo;
		this.rnaGsoSeqp = rnaGsoSeqp;
		this.rnaSeqp = rnaSeqp;
		this.pniSeq = pniSeq;
	}

	public McoReanimacaoRnJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer rnaGsoPacCodigo, Short rnaGsoSeqp,
			Short rnaSeqp, Integer pniSeq, Integer dose, String unidade, Integer serMatricula, Short serVinCodigo, Date criadoEm,
			String vadSigla) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.rnaGsoPacCodigo = rnaGsoPacCodigo;
		this.rnaGsoSeqp = rnaGsoSeqp;
		this.rnaSeqp = rnaSeqp;
		this.pniSeq = pniSeq;
		this.dose = dose;
		this.unidade = unidade;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
		this.vadSigla = vadSigla;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "RNA_GSO_PAC_CODIGO", nullable = false)
	public Integer getRnaGsoPacCodigo() {
		return this.rnaGsoPacCodigo;
	}

	public void setRnaGsoPacCodigo(Integer rnaGsoPacCodigo) {
		this.rnaGsoPacCodigo = rnaGsoPacCodigo;
	}

	@Column(name = "RNA_GSO_SEQP", nullable = false)
	public Short getRnaGsoSeqp() {
		return this.rnaGsoSeqp;
	}

	public void setRnaGsoSeqp(Short rnaGsoSeqp) {
		this.rnaGsoSeqp = rnaGsoSeqp;
	}

	@Column(name = "RNA_SEQP", nullable = false)
	public Short getRnaSeqp() {
		return this.rnaSeqp;
	}

	public void setRnaSeqp(Short rnaSeqp) {
		this.rnaSeqp = rnaSeqp;
	}

	@Column(name = "PNI_SEQ", nullable = false)
	public Integer getPniSeq() {
		return this.pniSeq;
	}

	public void setPniSeq(Integer pniSeq) {
		this.pniSeq = pniSeq;
	}

	@Column(name = "DOSE")
	public Integer getDose() {
		return this.dose;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}

	@Column(name = "UNIDADE", length = 5)
	@Length(max = 5)
	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "VAD_SIGLA", length = 2)
	@Length(max = 2)
	public String getVadSigla() {
		return this.vadSigla;
	}

	public void setVadSigla(String vadSigla) {
		this.vadSigla = vadSigla;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		RNA_GSO_PAC_CODIGO("rnaGsoPacCodigo"),
		RNA_GSO_SEQP("rnaGsoSeqp"),
		RNA_SEQP("rnaSeqp"),
		PNI_SEQ("pniSeq"),
		DOSE("dose"),
		UNIDADE("unidade"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CRIADO_EM("criadoEm"),
		VAD_SIGLA("vadSigla");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
