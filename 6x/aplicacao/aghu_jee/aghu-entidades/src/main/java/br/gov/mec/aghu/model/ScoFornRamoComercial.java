package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * ScoFornRamoComercial generated by hbm2java
 */
@Entity
@Table(name = "SCO_FORN_RAMOS_COMERCIAIS", schema = "AGH")
public class ScoFornRamoComercial extends BaseEntityId<ScoFornRamoComercialId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1335339765014336856L;
	private ScoFornRamoComercialId id;
	private Integer version;
	private ScoFornecedor scoFornecedor;
	private ScoRamoComercial scoRamoComercial;
	private Set<ScoFnRamoComerClas> scoFnRamoComerClases = new HashSet<ScoFnRamoComerClas>(0);

	public ScoFornRamoComercial() {
	}

	public ScoFornRamoComercial(ScoFornRamoComercialId id, ScoFornecedor scoFornecedor, ScoRamoComercial scoRamoComercial) {
		this.id = id;
		this.scoFornecedor = scoFornecedor;
		this.scoRamoComercial = scoRamoComercial;
	}

	public ScoFornRamoComercial(ScoFornRamoComercialId id, ScoFornecedor scoFornecedor, ScoRamoComercial scoRamoComercial,
			Set<ScoFnRamoComerClas> scoFnRamoComerClases) {
		this.id = id;
		this.scoFornecedor = scoFornecedor;
		this.scoRamoComercial = scoRamoComercial;
		this.scoFnRamoComerClases = scoFnRamoComerClases;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "frnNumero", column = @Column(name = "FRN_NUMERO", nullable = false)),
			@AttributeOverride(name = "rcmCodigo", column = @Column(name = "RCM_CODIGO", nullable = false)) })
	public ScoFornRamoComercialId getId() {
		return this.id;
	}

	public void setId(ScoFornRamoComercialId id) {
		this.id = id;
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
	@JoinColumn(name = "FRN_NUMERO", nullable = false, insertable = false, updatable = false)
	public ScoFornecedor getScoFornecedor() {
		return this.scoFornecedor;
	}

	public void setScoFornecedor(ScoFornecedor scoFornecedor) {
		this.scoFornecedor = scoFornecedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RCM_CODIGO", nullable = false, insertable = false, updatable = false)
	public ScoRamoComercial getScoRamoComercial() {
		return this.scoRamoComercial;
	}

	public void setScoRamoComercial(ScoRamoComercial scoRamoComercial) {
		this.scoRamoComercial = scoRamoComercial;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scoFornRamoComercial")
	public Set<ScoFnRamoComerClas> getScoFnRamoComerClases() {
		return this.scoFnRamoComerClases;
	}

	public void setScoFnRamoComerClases(Set<ScoFnRamoComerClas> scoFnRamoComerClases) {
		this.scoFnRamoComerClases = scoFnRamoComerClases;
	}

	public enum Fields {

		ID("id"),
		ID_RCMCODIGO("id.rcmCodigo"),
		ID_FRNNUMERO("id.frnNumero"),		
		VERSION("version"),
		SCO_FORNECEDOR("scoFornecedor"),
		SCO_RAMOS_COMERCIAIS("scoRamoComercial"),
		SCO_RAMOS_COMERCIAIS_CODIGO("scoRamoComercial.codigo"),
		SCO_FORNECEDOR_NUMERO("scoFornecedor.numero"),
		SCO_FN_RAMO_COMER_CLASES("scoFnRamoComerClases");

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
		if (!(obj instanceof ScoFornRamoComercial)) {
			return false;
		}
		ScoFornRamoComercial other = (ScoFornRamoComercial) obj;
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