package br.gov.mec.aghu.model;

// Generated 23/12/2010 11:18:44 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VRapServidorConselho generated by hbm2java
 */
@Entity
@Table(name = "V_RAP_SERVIDOR_CONSELHO", schema = "AGH")
@Immutable
public class VRapServidorConselho extends BaseEntityId<VRapServidorConselhoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4380456439563267571L;
	private VRapServidorConselhoId id;
	private Integer cctCodigo;
	private Integer cctCodigoAtua;
	private Integer ocaCodigo;
	private Short grfCodigo;
	private String nome;
	private String sigla;
	private Short cprCodigo;
	private String nroRegConselho;
	private String cprSigla;
	private String indSituacao;
	private Date dtInicioVinculo;
	private Date dtFimVinculo;
	private String conselhoSigla;
	private Long cpf;
	
	
	public VRapServidorConselho() {
	}

	public VRapServidorConselho(VRapServidorConselhoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "matricula", column = @Column(name = "MATRICULA", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "vinCodigo", column = @Column(name = "VIN_CODIGO", nullable = false, precision = 3, scale = 0))})
	public VRapServidorConselhoId getId() {
		return this.id;
	}

	public void setId(VRapServidorConselhoId id) {
		this.id = id;
	}
	
	public enum Fields {
		ID("id"),MATRICULA("id.matricula"),VIN_CODIGO("id.vinCodigo"),CCT_CODIGO("cctCodigo"),
		CCT_CODIGO_ATUA("cctCodigoAtua"),OCA_CODIGO("ocaCodigo"),GRF_CODIGO("grfCodigo"),
		NOME("nome"),SIGLA("sigla"),CPR_CODIGO("cprCodigo"),NRO_REG_CONSELHO("nroRegConselho"),
		CPR_SIGLA("cprSigla"),IND_SITUACAO("indSituacao"),DT_INICIO_VINCULO("dtInicioVinculo"),
		DT_FIM_VINCULO("dtFimVinculo"),CONSELHO_SIGLA("conselhoSigla"),CPF("cpf");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
	
	@Column(name = "CCT_CODIGO", precision = 6, scale = 0)
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "CCT_CODIGO_ATUA", precision = 6, scale = 0)
	public Integer getCctCodigoAtua() {
		return this.cctCodigoAtua;
	}

	public void setCctCodigoAtua(Integer cctCodigoAtua) {
		this.cctCodigoAtua = cctCodigoAtua;
	}

	@Column(name = "OCA_CODIGO", precision = 5, scale = 0)
	public Integer getOcaCodigo() {
		return this.ocaCodigo;
	}

	public void setOcaCodigo(Integer ocaCodigo) {
		this.ocaCodigo = ocaCodigo;
	}

	@Column(name = "GRF_CODIGO", precision = 3, scale = 0)
	public Short getGrfCodigo() {
		return this.grfCodigo;
	}

	public void setGrfCodigo(Short grfCodigo) {
		this.grfCodigo = grfCodigo;
	}

	@Column(name = "NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "SIGLA", length = 15)
	@Length(max = 15)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "CPR_CODIGO", precision = 4, scale = 0)
	public Short getCprCodigo() {
		return this.cprCodigo;
	}

	public void setCprCodigo(Short cprCodigo) {
		this.cprCodigo = cprCodigo;
	}

	@Column(name = "NRO_REG_CONSELHO", length = 9)
	@Length(max = 9)
	public String getNroRegConselho() {
		return this.nroRegConselho;
	}

	public void setNroRegConselho(String nroRegConselho) {
		this.nroRegConselho = nroRegConselho;
	}

	@Column(name = "CPR_SIGLA", length = 15)
	@Length(max = 15)
	public String getCprSigla() {
		return this.cprSigla;
	}

	public void setCprSigla(String cprSigla) {
		this.cprSigla = cprSigla;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "DT_INICIO_VINCULO", nullable = false, length = 7)
	public Date getDtInicioVinculo() {
		return this.dtInicioVinculo;
	}

	public void setDtInicioVinculo(Date dtInicioVinculo) {
		this.dtInicioVinculo = dtInicioVinculo;
	}

	@Column(name = "DT_FIM_VINCULO", length = 7)
	public Date getDtFimVinculo() {
		return this.dtFimVinculo;
	}

	public void setDtFimVinculo(Date dtFimVinculo) {
		this.dtFimVinculo = dtFimVinculo;
	}

	@Column(name = "CONSELHO_SIGLA", length = 34)
	@Length(max = 34)
	public String getConselhoSigla() {
		return this.conselhoSigla;
	}

	public void setConselhoSigla(String conselhoSigla) {
		this.conselhoSigla = conselhoSigla;
	}

	@Column(name = "CPF", precision = 12, scale = 0)
	public Long getCpf() {
		return this.cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	@Transient
	public String getVinculoMatricula() {
		return   id.getVinCodigo() + " - "+ id.getMatricula();
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
		if (!(obj instanceof VRapServidorConselho)) {
			return false;
		}
		VRapServidorConselho other = (VRapServidorConselho) obj;
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
