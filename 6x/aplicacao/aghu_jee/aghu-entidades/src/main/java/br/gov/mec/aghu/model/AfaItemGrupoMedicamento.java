package br.gov.mec.aghu.model;

// Generated 07/10/2010 19:46:34 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AfaItemGrupoMdtos generated by hbm2java
 */

@Entity
@Table(name = "AFA_ITEM_GRUPO_MDTOS", schema = "AGH")
public class AfaItemGrupoMedicamento extends BaseEntityId<AfaItemGrupoMedicamentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6074592325380724999L;
	private AfaItemGrupoMedicamentoId id;
	private AfaGrupoMedicamento grupoMedicamento;
	private Date criadoEm;
	private DominioSituacao situacao;
	private RapServidores servidor;
	private AfaMedicamento medicamento;
	
	
	public AfaItemGrupoMedicamento() {
	}

	public AfaItemGrupoMedicamento(AfaItemGrupoMedicamentoId id,
			AfaGrupoMedicamento grupoMedicamento, Date criadoEm,
			DominioSituacao situacao, RapServidores servidor) {
		this.id = id;
		this.grupoMedicamento = grupoMedicamento;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
		this.servidor = servidor;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "medMatCodigo", column = @Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "gmdSeq", column = @Column(name = "GMD_SEQ", nullable = false, precision = 4, scale = 0)) })
	public AfaItemGrupoMedicamentoId getId() {
		return this.id;
	}

	public void setId(AfaItemGrupoMedicamentoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GMD_SEQ", nullable = false, insertable = false, updatable = false)
	public AfaGrupoMedicamento getGrupoMedicamento() {
		return this.grupoMedicamento;
	}

	public void setGrupoMedicamento(AfaGrupoMedicamento grupoMedicamento) {
		this.grupoMedicamento = grupoMedicamento;
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
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MED_MAT_CODIGO",  nullable=false, insertable = false, updatable = false)
	public AfaMedicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(AfaMedicamento medicamento) {
		this.medicamento = medicamento;
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
		AfaItemGrupoMedicamento other = (AfaItemGrupoMedicamento) obj;
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
		MED_MAT_CODIGO("id.medMatCodigo"), GMD_SEQ("id.gmdSeq"), GRUPO_MEDICAMENTO(
				"grupoMedicamento"), MEDICAMENTO("medicamento"), CRIADO_EM("criadoEm"), SERVIDOR("servidor"), SITUACAO(
				"situacao"), GRUPO_MEDICAMENTO_DESCRICAO("grupoMedicamento.descricao"), GRUPO_MEDICAMENTO_SEQ("grupoMedicamento.seq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}

	}

}
