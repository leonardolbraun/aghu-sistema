package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import br.gov.mec.aghu.dominio.DominioItemContaHospitalar;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmItemConsultoriaSumario generated by hbm2java
 */
@Entity
@Table(name = "MPM_ITEM_CONSULTORIA_SUMARIOS", schema = "AGH")

public class MpmItemConsultoriaSumario extends BaseEntityId<MpmItemConsultoriaSumarioId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5648716294261791819L;
	private MpmItemConsultoriaSumarioId id;
	private MpmItemPrescricaoSumario itemPrescricaoSumario;
	private AghEspecialidades especialidade;
	private DominioItemContaHospitalar tipo;
	private Boolean indUrgencia;

	public MpmItemConsultoriaSumario() {
	}

	public MpmItemConsultoriaSumario(MpmItemConsultoriaSumarioId id,
			MpmItemPrescricaoSumario itemPrescricaoSumario, AghEspecialidades especialidade,
			DominioItemContaHospitalar tipo, Boolean indUrgencia) {
		this.id = id;
		this.itemPrescricaoSumario = itemPrescricaoSumario;
		this.especialidade = especialidade;
		this.tipo = tipo;
		this.indUrgencia = indUrgencia;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "ituSeq", column = @Column(name = "ITU_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmItemConsultoriaSumarioId getId() {
		return this.id;
	}

	public void setId(MpmItemConsultoriaSumarioId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITU_SEQ", nullable = false, insertable = false, updatable = false)
	public MpmItemPrescricaoSumario getItemPrescricaoSumario() {
		return this.itemPrescricaoSumario;
	}

	public void setItemPrescricaoSumario(MpmItemPrescricaoSumario itemPrescricaoSumario) {
		this.itemPrescricaoSumario = itemPrescricaoSumario;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ", referencedColumnName="SEQ", nullable = false)
	public AghEspecialidades getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}
	

	@Column(name = "TIPO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioItemContaHospitalar getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioItemContaHospitalar tipo) {
		this.tipo = tipo;
	}

	@Column(name = "IND_URGENCIA", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndUrgencia() {
		return this.indUrgencia;
	}

	public void setIndUrgencia(Boolean indUrgencia) {
		this.indUrgencia = indUrgencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		MpmItemConsultoriaSumario other = (MpmItemConsultoriaSumario) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		ID("id"),
		ITEM_PRESCRICAO_SUMARIO("itemPrescricaoSumario"),
		ESPECIALIDADE("especialidade"),
		TIPO("tipo"),
		IND_URGENCIA("indUrgencia");
		
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
