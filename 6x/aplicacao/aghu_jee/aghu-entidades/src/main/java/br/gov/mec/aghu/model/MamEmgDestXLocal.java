package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamEmgDestXLocal generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamEdlSq1", sequenceName="AGH.MAM_EDL_SQ1", allocationSize = 1)
@Table(name = "MAM_EMG_DEST_X_LOCAIS", schema = "AGH")
public class MamEmgDestXLocal extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8756719078223860434L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private MamEmgDestino mamEmgDestino;
	private MamEmgInfPaciente mamEmgInfPaciente;
	private Date criadoEm;
	private String indSituacao;

	public MamEmgDestXLocal() {
	}

	public MamEmgDestXLocal(Short seq, RapServidores rapServidores, MamEmgDestino mamEmgDestino,
			MamEmgInfPaciente mamEmgInfPaciente, Date criadoEm, String indSituacao) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mamEmgDestino = mamEmgDestino;
		this.mamEmgInfPaciente = mamEmgInfPaciente;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamEdlSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EDE_SEQ", nullable = false)
	public MamEmgDestino getMamEmgDestino() {
		return this.mamEmgDestino;
	}

	public void setMamEmgDestino(MamEmgDestino mamEmgDestino) {
		this.mamEmgDestino = mamEmgDestino;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EIP_SEQ", nullable = false)
	public MamEmgInfPaciente getMamEmgInfPaciente() {
		return this.mamEmgInfPaciente;
	}

	public void setMamEmgInfPaciente(MamEmgInfPaciente mamEmgInfPaciente) {
		this.mamEmgInfPaciente = mamEmgInfPaciente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		MAM_EMG_DESTINOS("mamEmgDestino"),
		MAM_EMG_INF_PACIENTES("mamEmgInfPaciente"),
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


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamEmgDestXLocal)) {
			return false;
		}
		MamEmgDestXLocal other = (MamEmgDestXLocal) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
