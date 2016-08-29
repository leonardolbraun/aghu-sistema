package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelProtocoloInternoUnids generated by hbm2java
 */
@Entity
@Table(name = "AEL_PROTOCOLO_INTERNO_UNIDS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"UNF_SEQ", "NRO_PROTOCOLO" }))

public class AelProtocoloInternoUnids extends BaseEntityId<AelProtocoloInternoUnidsId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6257028319696473740L;
	private AelProtocoloInternoUnidsId id;
	private Integer nroProtocolo;
	private Date criadoEm;
	private RapServidores servidor;
	private Set<AelPacUnidFuncionais> pacUnidFuncionais = new HashSet<AelPacUnidFuncionais>(0);
	private AipPacientes paciente;
	private AghUnidadesFuncionais unidadeFuncional;
	private Integer version;

	public AelProtocoloInternoUnids() {
	}

	public AelProtocoloInternoUnids(AelProtocoloInternoUnidsId id,
			Integer nroProtocolo, Date criadoEm, RapServidores servidor) {
		this.id = id;
		this.nroProtocolo = nroProtocolo;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public AelProtocoloInternoUnids(AelProtocoloInternoUnidsId id,
			Integer nroProtocolo, Date criadoEm, RapServidores servidor,
			Set<AelPacUnidFuncionais> pacUnidFuncionais) {
		this.id = id;
		this.nroProtocolo = nroProtocolo;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.pacUnidFuncionais = pacUnidFuncionais;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)) })
	public AelProtocoloInternoUnidsId getId() {
		return this.id;
	}

	public void setId(AelProtocoloInternoUnidsId id) {
		this.id = id;
	}

	@Column(name = "NRO_PROTOCOLO", nullable = false, precision = 9, scale = 0)
	public Integer getNroProtocolo() {
		return this.nroProtocolo;
	}

	public void setNroProtocolo(Integer nroProtocolo) {
		this.nroProtocolo = nroProtocolo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelProtocoloInternoUnids")
	public Set<AelPacUnidFuncionais> getPacUnidFuncionais() {
		return this.pacUnidFuncionais;
	}

	public void setPacUnidFuncionais(
			Set<AelPacUnidFuncionais> pacUnidFuncionais) {
		this.pacUnidFuncionais = pacUnidFuncionais;
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
	@JoinColumn(name = "PAC_CODIGO", insertable = false, updatable = false)
	public AipPacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", insertable = false, updatable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
	public enum Fields {
		PACIENTE_CODIGO("id.pacCodigo"),// 
		SEQUENCIA_UNIDADE_FUNCIONAL("id.unidadeFuncional.seq"),//
		CRIADO_EM("criadoEm"),//
		NUMERO_PROTOCOLO("nroProtocolo"),//
		PACIENTE("paciente"),//
		SERVIDOR("servidor"),//
		UNIDADE_FUNCIONAL("unidadeFuncional"),//
		ID("id"),//
		;

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof AelProtocoloInternoUnids)) {
			return false;
		}
		AelProtocoloInternoUnids other = (AelProtocoloInternoUnids) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

	

	

}