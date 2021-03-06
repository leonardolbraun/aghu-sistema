package br.gov.mec.aghu.model;

// Generated 11/06/2010 10:31:39 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MciOrientacaoTratMateriais generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mciOtmSq1", sequenceName="AGH.MCI_OTM_SQ1", allocationSize = 1)
@Table(name = "MCI_ORIENTACAO_TRAT_MATERIAIS", schema = "AGH")

public class MciOrientacaoTratMaterial extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3564007524130876918L;
	private Short seq;
	private RapServidores servidor;
	private String descricao;
	private Date criadoEm;
	private DominioSituacao situacao;
	private Set<MciPatologiaInfeccao> patologiaInfeccoes = new HashSet<MciPatologiaInfeccao>(
			0);
	
	// TODO Implementar version quando usado POJO para persistencia.
	// Já existe o getter e setter comentado no final da classe.
	/* private Integer version; */

	public MciOrientacaoTratMaterial() {
	}

	public MciOrientacaoTratMaterial(Short seq, RapServidores servidor,
			String descricao, Date criadoEm, DominioSituacao situacao) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
	}

	public MciOrientacaoTratMaterial(Short seq, RapServidores servidor,
			String descricao, Date criadoEm, DominioSituacao situacao,
			Set<MciPatologiaInfeccao> patologiaInfeccoes) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
		this.patologiaInfeccoes = patologiaInfeccoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mciOtmSq1")
	@Column(name = "SEQ", nullable = false, precision = 4, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orientacaoTratMaterial")
	public Set<MciPatologiaInfeccao> getPatologiaInfeccoes() {
		return this.patologiaInfeccoes;
	}

	public void setPatologiaInfeccoes(
			Set<MciPatologiaInfeccao> patologiaInfeccoes) {
		this.patologiaInfeccoes = patologiaInfeccoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MciOrientacaoTratMaterial other = (MciOrientacaoTratMaterial) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	/*
	 @Version
	  
	 @Column(name = "VERSION", nullable = false) 
	 public Integer getVersion() {
	 	return this.version; 
	 }
	  
	 public void setVersion(Integer version) { 
	 	this.version = version; 
	}
	 */
	
	public enum Fields {

		SEQ("seq"),
		SERVIDOR("servidor"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		SITUACAO("situacao"),
		PATOLOGIA_INFECCOES("patologiaInfeccoes");

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
