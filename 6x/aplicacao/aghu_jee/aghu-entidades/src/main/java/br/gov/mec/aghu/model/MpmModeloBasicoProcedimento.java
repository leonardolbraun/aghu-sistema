package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.Version;


import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmModBasicProcedimentos generated by hbm2java
 */
@Entity
@Table(name = "MPM_MOD_BASIC_PROCEDIMENTOS", schema = "AGH")

public class MpmModeloBasicoProcedimento extends BaseEntityId<MpmModeloBasicoProcedimentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1680598222652297688L;
	private MpmModeloBasicoProcedimentoId id;
	private MpmProcedEspecialDiversos procedEspecialDiverso;
	private MpmModeloBasicoPrescricao modeloBasicoPrescricao;
	private RapServidores servidor;
	private ScoMaterial material;
	private MbcProcedimentoCirurgicos procedimentoCirurgico;
	private Short quantidade;
	private String informacoesComplementares;
	private Integer version;

	private Set<MpmModeloBasicoModoUsoProcedimento> modoUsoProcedimentos = new HashSet<MpmModeloBasicoModoUsoProcedimento>(
			0);

//	private enum ModBasicProcedimentosExceptionCode implements
//			BusinessExceptionCode {
//		MPM_MBP_CK1, MPM_MBP_CK2
//	}

	public MpmModeloBasicoProcedimento() {
	}

	public MpmModeloBasicoProcedimento(MpmModeloBasicoProcedimentoId id) {
		this.id = id;
	}

	public MpmModeloBasicoProcedimento(MpmModeloBasicoProcedimentoId id,
			MpmModeloBasicoPrescricao modBasicPrescricao, RapServidores servidor) {
		this.id = id;
		this.modeloBasicoPrescricao = modBasicPrescricao;
		this.servidor = servidor;
	}

	public MpmModeloBasicoProcedimento(MpmModeloBasicoProcedimentoId id,
			MpmProcedEspecialDiversos procedEspecialDiverso,
			MpmModeloBasicoPrescricao modBasicPrescricao,
			RapServidores servidor, ScoMaterial material,
			MbcProcedimentoCirurgicos procedimentoCirurgico, Short quantidade,
			String infComplementares,
			Set<MpmModeloBasicoModoUsoProcedimento> modoUsoProcedimentos) {
		this.id = id;
		this.procedEspecialDiverso = procedEspecialDiverso;
		this.modeloBasicoPrescricao = modBasicPrescricao;
		this.servidor = servidor;
		this.material = material;
		this.procedimentoCirurgico = procedimentoCirurgico;
		this.quantidade = quantidade;
		this.informacoesComplementares = infComplementares;
		this.modoUsoProcedimentos = modoUsoProcedimentos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "modeloBasicoPrescricaoSeq", column = @Column(name = "MDB_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 4, scale = 0)) })
	public MpmModeloBasicoProcedimentoId getId() {
		return this.id;
	}

	public void setId(MpmModeloBasicoProcedimentoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PED_SEQ")
	public MpmProcedEspecialDiversos getProcedEspecialDiverso() {
		return this.procedEspecialDiverso;
	}

	public void setProcedEspecialDiverso(
			MpmProcedEspecialDiversos procedEspecialDiverso) {
		this.procedEspecialDiverso = procedEspecialDiverso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDB_SEQ", nullable = false, insertable = false, updatable = false)
	public MpmModeloBasicoPrescricao getModeloBasicoPrescricao() {
		return this.modeloBasicoPrescricao;
	}

	public void setModeloBasicoPrescricao(
			MpmModeloBasicoPrescricao modBasicPrescricao) {
		this.modeloBasicoPrescricao = modBasicPrescricao;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO", referencedColumnName = "CODIGO")
	public ScoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ScoMaterial material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PCI_SEQ", referencedColumnName = "SEQ")
	public MbcProcedimentoCirurgicos getProcedimentoCirurgico() {
		return procedimentoCirurgico;
	}

	public void setProcedimentoCirurgico(
			MbcProcedimentoCirurgicos procedimentoCirurgico) {
		this.procedimentoCirurgico = procedimentoCirurgico;
	}

	@Column(name = "QUANTIDADE", precision = 4, scale = 0)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "INF_COMPLEMENTARES", length = 240)
	@Length(max = 240, message = "As informações complementares possuem mais de 240 caracteres.")
	public String getInformacoesComplementares() {
		return informacoesComplementares;
	}

	public void setInformacoesComplementares(String informacoesComplementares) {
		this.informacoesComplementares = informacoesComplementares;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modeloBasicoProcedimento")
	@Cascade({ org.hibernate.annotations.CascadeType.DELETE })
	public Set<MpmModeloBasicoModoUsoProcedimento> getModoUsoProcedimentos() {
		return modoUsoProcedimentos;
	}

	public void setModoUsoProcedimentos(
			Set<MpmModeloBasicoModoUsoProcedimento> modoUsoProcedimentos) {
		this.modoUsoProcedimentos = modoUsoProcedimentos;
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
		MpmModeloBasicoProcedimento other = (MpmModeloBasicoProcedimento) obj;
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
		ID("id"), PROCED_ESPECIAL_DIVERSO("procedEspecialDiverso"), MOD_BASIC_PRESCRICAO(
				"modeloBasicoPrescricao"), SERVIDOR("servidor"), MATERIAL(
				"material"), PROCEDIMENTO_CIRURGICO("procedimentoCirurgico"), QUANTIDADE(
				"quantidade"), INF_COMPLEMENTARES("informacoesComplementares"), ID_SEQ_MODELO_BASICO("id.modeloBasicoPrescricaoSeq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	// TODO: regra foi feita em cima de um atributo mapeado INCORRETAMENTE
	// REFAZER QUANDO NECESSÁRIO!
	/*
	 * @PrePersist
	 * 
	 * @PreUpdate
	 * 
	 * @SuppressWarnings("unused") private void validacoes() {
	 * 
	 * if(!((this.matCodigo == null && this.quantidade == null ) ||
	 * (this.matCodigo != null && this.quantidade!= null && this.quantidade >
	 * 0))){ throw new
	 * BaseRuntimeException(ModBasicProcedimentosExceptionCode.MPM_MBP_CK1); }
	 * 
	 * if( !((this.procedEspecialDiverso != null && this.procedimentoCirurgico
	 * == null && this.matCodigo == null) || (this.procedEspecialDiverso == null
	 * && this.procedimentoCirurgico != null && this.matCodigo == null ) ||
	 * (this.procedEspecialDiverso == null && this.procedimentoCirurgico == null
	 * && this.matCodigo != null ))){ throw new
	 * BaseRuntimeException(ModBasicProcedimentosExceptionCode.MPM_MBP_CK2); } }
	 */
}
