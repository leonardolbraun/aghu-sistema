package br.gov.mec.aghu.model;

// Generated 07/03/2012 14:59:23 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.dominio.DominioOperacoesJournal;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AfaViaAdmUnfsJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "afaVaujJnSeq", sequenceName = "AGH.AFA_VAU_jn_seq", allocationSize = 1)
@Table(name = "AFA_VIA_ADM_UNFS_JN", schema = "AGH")
@Immutable
public class AfaViaAdmUnfsJn extends BaseJournal implements java.io.Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2124548379439413092L;
	private Integer seqJn;
	private Short unfSeq;
	private String vadSigla;
	private RapServidores servidor;
	private Date criadoEm;
	private DominioSituacao indSituacao;

	public AfaViaAdmUnfsJn() {
	}

	public AfaViaAdmUnfsJn(Integer seqJn,  
			DominioOperacoesJournal operacao, Short unfSeq, String vadSigla) {
		this.seqJn = seqJn;
		this.unfSeq = unfSeq;
		this.vadSigla = vadSigla;
	}

	public AfaViaAdmUnfsJn(Integer seqJn, Short unfSeq, String vadSigla,
			RapServidores servidor, Date criadoEm,
			DominioSituacao indSituacao) {
		this.seqJn = seqJn;
		this.unfSeq = unfSeq;
		this.vadSigla = vadSigla;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "afaVaujJnSeq")
	@Override
	public Integer getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Integer seqJn) {
		this.seqJn = seqJn;
	}


	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "VAD_SIGLA", nullable = false, length = 2)
	@Length(max = 2)
	public String getVadSigla() {
		return this.vadSigla;
	}

	public void setVadSigla(String vadSigla) {
		this.vadSigla = vadSigla;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
		@ManyToOne(fetch = FetchType.LAZY)

	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		SEQ_JN("seqJn"),
		UNF_SEQ("unfSeq"),
		VAD_SIGLA("vadSigla"),
		SERVIDOR("servidor"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao");

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
