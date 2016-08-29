package br.gov.mec.aghu.model;

// Generated 25/03/2011 14:19:14 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelExameDeptConveniosJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelEdcJnSeq", sequenceName="AGH.AEL_EDC_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_EXAME_DEPT_CONVENIOS_JN", schema = "AGH")
@Immutable
public class AelExameDeptConvenioJn extends BaseJournal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1281994402939758239L;
	//private Integer seqJn;
	private String exdEmaExaSigla;
	private Integer exdEmaManSeq;
	private String exdEmaExaSiglaEhDependent;
	private Integer exdEmaManSeqEhDependente;
	private Short cspSeq;
	private Short cspCnvCodigo;
	private String indSituacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AelExameDeptConvenioJn() {
	}

	public AelExameDeptConvenioJn(String jnOperation, String exdEmaExaSigla, Integer exdEmaManSeq,
			String exdEmaExaSiglaEhDependent, Integer exdEmaManSeqEhDependente,
			Short cspSeq, Short cspCnvCodigo) {
		//setSeqJn(seqJn);
		this.exdEmaExaSigla = exdEmaExaSigla;
		this.exdEmaManSeq = exdEmaManSeq;
		this.exdEmaExaSiglaEhDependent = exdEmaExaSiglaEhDependent;
		this.exdEmaManSeqEhDependente = exdEmaManSeqEhDependente;
		this.cspSeq = cspSeq;
		this.cspCnvCodigo = cspCnvCodigo;
	}

	public AelExameDeptConvenioJn(String exdEmaExaSigla, Integer exdEmaManSeq,
			String exdEmaExaSiglaEhDependent, Integer exdEmaManSeqEhDependente,
			Short cspSeq, Short cspCnvCodigo, String indSituacao,
			Date criadoEm, Integer serMatricula, Short serVinCodigo) {
		//setSeqJn(seqJn);
		this.exdEmaExaSigla = exdEmaExaSigla;
		this.exdEmaManSeq = exdEmaManSeq;
		this.exdEmaExaSiglaEhDependent = exdEmaExaSiglaEhDependent;
		this.exdEmaManSeqEhDependente = exdEmaManSeqEhDependente;
		this.cspSeq = cspSeq;
		this.cspCnvCodigo = cspCnvCodigo;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelEdcJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	

	@Column(name = "EXD_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getExdEmaExaSigla() {
		return this.exdEmaExaSigla;
	}

	public void setExdEmaExaSigla(String exdEmaExaSigla) {
		this.exdEmaExaSigla = exdEmaExaSigla;
	}

	@Column(name = "EXD_EMA_MAN_SEQ", nullable = false)
	public Integer getExdEmaManSeq() {
		return this.exdEmaManSeq;
	}

	public void setExdEmaManSeq(Integer exdEmaManSeq) {
		this.exdEmaManSeq = exdEmaManSeq;
	}

	@Column(name = "EXD_EMA_EXA_SIGLA_EH_DEPENDENT", nullable = false, length = 5)
	@Length(max = 5)
	public String getExdEmaExaSiglaEhDependent() {
		return this.exdEmaExaSiglaEhDependent;
	}

	public void setExdEmaExaSiglaEhDependent(String exdEmaExaSiglaEhDependent) {
		this.exdEmaExaSiglaEhDependent = exdEmaExaSiglaEhDependent;
	}

	@Column(name = "EXD_EMA_MAN_SEQ_EH_DEPENDENTE", nullable = false)
	public Integer getExdEmaManSeqEhDependente() {
		return this.exdEmaManSeqEhDependente;
	}

	public void setExdEmaManSeqEhDependente(Integer exdEmaManSeqEhDependente) {
		this.exdEmaManSeqEhDependente = exdEmaManSeqEhDependente;
	}

	@Column(name = "CSP_SEQ", nullable = false)
	public Short getCspSeq() {
		return this.cspSeq;
	}

	public void setCspSeq(Short cspSeq) {
		this.cspSeq = cspSeq;
	}

	@Column(name = "CSP_CNV_CODIGO", nullable = false)
	public Short getCspCnvCodigo() {
		return this.cspCnvCodigo;
	}

	public void setCspCnvCodigo(Short cspCnvCodigo) {
		this.cspCnvCodigo = cspCnvCodigo;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
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

	public enum Fields {

		EXD_EMA_EXA_SIGLA("exdEmaExaSigla"),
		EXD_EMA_MAN_SEQ("exdEmaManSeq"),
		EXD_EMA_EXA_SIGLA_EH_DEPENDENT("exdEmaExaSiglaEhDependent"),
		EXD_EMA_MAN_SEQ_EH_DEPENDENTE("exdEmaManSeqEhDependente"),
		CSP_SEQ("cspSeq"),
		CSP_CNV_CODIGO("cspCnvCodigo"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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