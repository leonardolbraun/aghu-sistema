package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * EpeCuidadosDiagnosticos generated by hbm2java
 */
@Entity
@Table(name = "EPE_CUIDADOS_DIAGNOSTICOS", schema = "AGH")
public class EpeCuidadoDiagnostico extends BaseEntityId<EpeCuidadoDiagnosticoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2242365286826427624L;
	private EpeCuidadoDiagnosticoId id;
	private Integer version;
	private EpeFatRelDiagnostico fatRelDiagnostico;
	private DominioSituacao situacao;
	private Set<EpePrescCuidDiagnostico> prescCuidDiagnosticos = new HashSet<EpePrescCuidDiagnostico>(
			0);
	private EpeCuidados cuidado;
	private Short fdgDgnSnbGnbSeqEsperanto;
	private Short fdgDgnSnbSequenciaEsperanto;
	private Short fdgDgnSequenciaEsperanto;
	private Short fdgFreSeqEsperanto;
	private Short cuiSeqEsperanto;

	public EpeCuidadoDiagnostico() {
	}

	public EpeCuidadoDiagnostico(EpeCuidadoDiagnosticoId id,
			EpeFatRelDiagnostico fatRelDiagnostico, DominioSituacao situacao) {
		this.id = id;
		this.fatRelDiagnostico = fatRelDiagnostico;
		this.situacao = situacao;
	}

	public EpeCuidadoDiagnostico(EpeCuidadoDiagnosticoId id,
			EpeFatRelDiagnostico fatRelDiagnostico, DominioSituacao situacao,
			Set<EpePrescCuidDiagnostico> prescCuidDiagnosticos) {
		this.id = id;
		this.fatRelDiagnostico = fatRelDiagnostico;
		this.situacao = situacao;
		this.prescCuidDiagnosticos = prescCuidDiagnosticos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "fdgDgnSnbGnbSeq", column = @Column(name = "FDG_DGN_SNB_GNB_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "fdgDgnSnbSequencia", column = @Column(name = "FDG_DGN_SNB_SEQUENCIA", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "fdgDgnSequencia", column = @Column(name = "FDG_DGN_SEQUENCIA", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "fdgFreSeq", column = @Column(name = "FDG_FRE_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "cuiSeq", column = @Column(name = "CUI_SEQ", nullable = false, precision = 4, scale = 0)) })
	public EpeCuidadoDiagnosticoId getId() {
		return this.id;
	}

	public void setId(EpeCuidadoDiagnosticoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "FDG_DGN_SNB_GNB_SEQ", referencedColumnName = "DGN_SNB_GNB_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "FDG_DGN_SNB_SEQUENCIA", referencedColumnName = "DGN_SNB_SEQUENCIA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "FDG_DGN_SEQUENCIA", referencedColumnName = "DGN_SEQUENCIA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "FDG_FRE_SEQ", referencedColumnName = "FRE_SEQ", nullable = false, insertable = false, updatable = false) })
	public EpeFatRelDiagnostico getFatRelDiagnostico() {
		return this.fatRelDiagnostico;
	}

	public void setFatRelDiagnostico(
			EpeFatRelDiagnostico fatRelDiagnostico) {
		this.fatRelDiagnostico = fatRelDiagnostico;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuidadoDiagnostico")
	public Set<EpePrescCuidDiagnostico> getPrescCuidDiagnosticos() {
		return this.prescCuidDiagnosticos;
	}

	public void setPrescCuidDiagnosticos(
			Set<EpePrescCuidDiagnostico> prescCuidDiagnosticos) {
		this.prescCuidDiagnosticos = prescCuidDiagnosticos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUI_SEQ", nullable=false, insertable=false, updatable=false)
	public EpeCuidados getCuidado() {
		return cuidado;
	}

	public void setCuidado(EpeCuidados cuidado) {
		this.cuidado = cuidado;
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
		EpeCuidadoDiagnostico other = (EpeCuidadoDiagnostico) obj;
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
		FDG_DGN_SNB_GNB_SEQ("id.fdgDgnSnbGnbSeq"),
		FDG_DGN_SNB_SEQUENCIA("id.fdgDgnSnbSequencia"),
		FDG_DGN_SEQUENCIA("id.fdgDgnSequencia"),
		FDG_FRE_SEQ("id.fdgFreSeq"),
		CUI_SEQ("id.cuiSeq"),
		CUIDADO("cuidado"),
		SITUACAO("situacao"),
		FAT_REL_DIAGNOSTICO("fatRelDiagnostico");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Column(name = "FDG_DGN_SNB_GNB_SEQ_ESPERANTO", nullable = true, precision = 4, scale = 0)
	public Short getFdgDgnSnbGnbSeqEsperanto() {
		return fdgDgnSnbGnbSeqEsperanto;
	}

	public void setFdgDgnSnbGnbSeqEsperanto(Short fdgDgnSnbGnbSeqEsperanto) {
		this.fdgDgnSnbGnbSeqEsperanto = fdgDgnSnbGnbSeqEsperanto;
	}

	@Column(name = "FDG_DGN_SNB_SEQUENCIA_ESPERANT", nullable = true, precision = 3, scale = 0)
	public Short getFdgDgnSnbSequenciaEsperanto() {
		return fdgDgnSnbSequenciaEsperanto;
	}

	public void setFdgDgnSnbSequenciaEsperanto(Short fdgDgnSnbSequenciaEsperanto) {
		this.fdgDgnSnbSequenciaEsperanto = fdgDgnSnbSequenciaEsperanto;
	}

	@Column(name = "FDG_DGN_SEQUENCIA_ESPERANTO", nullable = true, precision = 4, scale = 0)
	public Short getFdgDgnSequenciaEsperanto() {
		return fdgDgnSequenciaEsperanto;
	}

	public void setFdgDgnSequenciaEsperanto(Short fdgDgnSequenciaEsperanto) {
		this.fdgDgnSequenciaEsperanto = fdgDgnSequenciaEsperanto;
	}

	@Column(name = "FDG_FRE_SEQ_ESPERANTO", nullable = true, precision = 4, scale = 0)
	public Short getFdgFreSeqEsperanto() {
		return fdgFreSeqEsperanto;
	}

	public void setFdgFreSeqEsperanto(Short fdgFreSeqEsperanto) {
		this.fdgFreSeqEsperanto = fdgFreSeqEsperanto;
	}

	@Column(name = "CUI_SEQ_ESPERANTO", nullable = true, precision = 4, scale = 0)
	public Short getCuiSeqEsperanto() {
		return cuiSeqEsperanto;
	}

	public void setCuiSeqEsperanto(Short cuiSeqEsperanto) {
		this.cuiSeqEsperanto = cuiSeqEsperanto;
	}

}