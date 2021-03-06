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
 * MamQuestionarioJn generated by hbm2java
 */
@Entity
@Table(name = "MAM_QUESTIONARIOS_JN", schema = "AGH")
@Immutable
public class MamQuestionarioJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -169357391652055002L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer seq;
	private String descricao;
	private String indSituacao;
	private String indLiberado;
	private String indOrigem;
	private String indInstitucional;
	private Date criadoEm;
	private Short gquSeq;
	private Integer tieSeq;
	private Integer tinSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indTipoPac;
	private String indCustomizacao;
	private String indCritEscolha;

	public MamQuestionarioJn() {
	}

	public MamQuestionarioJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
	}

	public MamQuestionarioJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer seq, String descricao,
			String indSituacao, String indLiberado, String indOrigem, String indInstitucional, Date criadoEm, Short gquSeq,
			Integer tieSeq, Integer tinSeq, Integer serMatricula, Short serVinCodigo, String indTipoPac, String indCustomizacao,
			String indCritEscolha) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.indLiberado = indLiberado;
		this.indOrigem = indOrigem;
		this.indInstitucional = indInstitucional;
		this.criadoEm = criadoEm;
		this.gquSeq = gquSeq;
		this.tieSeq = tieSeq;
		this.tinSeq = tinSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indTipoPac = indTipoPac;
		this.indCustomizacao = indCustomizacao;
		this.indCritEscolha = indCritEscolha;
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

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_LIBERADO", length = 1)
	@Length(max = 1)
	public String getIndLiberado() {
		return this.indLiberado;
	}

	public void setIndLiberado(String indLiberado) {
		this.indLiberado = indLiberado;
	}

	@Column(name = "IND_ORIGEM", length = 1)
	@Length(max = 1)
	public String getIndOrigem() {
		return this.indOrigem;
	}

	public void setIndOrigem(String indOrigem) {
		this.indOrigem = indOrigem;
	}

	@Column(name = "IND_INSTITUCIONAL", length = 1)
	@Length(max = 1)
	public String getIndInstitucional() {
		return this.indInstitucional;
	}

	public void setIndInstitucional(String indInstitucional) {
		this.indInstitucional = indInstitucional;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "GQU_SEQ")
	public Short getGquSeq() {
		return this.gquSeq;
	}

	public void setGquSeq(Short gquSeq) {
		this.gquSeq = gquSeq;
	}

	@Column(name = "TIE_SEQ")
	public Integer getTieSeq() {
		return this.tieSeq;
	}

	public void setTieSeq(Integer tieSeq) {
		this.tieSeq = tieSeq;
	}

	@Column(name = "TIN_SEQ")
	public Integer getTinSeq() {
		return this.tinSeq;
	}

	public void setTinSeq(Integer tinSeq) {
		this.tinSeq = tinSeq;
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

	@Column(name = "IND_TIPO_PAC", length = 1)
	@Length(max = 1)
	public String getIndTipoPac() {
		return this.indTipoPac;
	}

	public void setIndTipoPac(String indTipoPac) {
		this.indTipoPac = indTipoPac;
	}

	@Column(name = "IND_CUSTOMIZACAO", length = 1)
	@Length(max = 1)
	public String getIndCustomizacao() {
		return this.indCustomizacao;
	}

	public void setIndCustomizacao(String indCustomizacao) {
		this.indCustomizacao = indCustomizacao;
	}

	@Column(name = "IND_CRIT_ESCOLHA", length = 1)
	@Length(max = 1)
	public String getIndCritEscolha() {
		return this.indCritEscolha;
	}

	public void setIndCritEscolha(String indCritEscolha) {
		this.indCritEscolha = indCritEscolha;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		IND_LIBERADO("indLiberado"),
		IND_ORIGEM("indOrigem"),
		IND_INSTITUCIONAL("indInstitucional"),
		CRIADO_EM("criadoEm"),
		GQU_SEQ("gquSeq"),
		TIE_SEQ("tieSeq"),
		TIN_SEQ("tinSeq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IND_TIPO_PAC("indTipoPac"),
		IND_CUSTOMIZACAO("indCustomizacao"),
		IND_CRIT_ESCOLHA("indCritEscolha");

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
