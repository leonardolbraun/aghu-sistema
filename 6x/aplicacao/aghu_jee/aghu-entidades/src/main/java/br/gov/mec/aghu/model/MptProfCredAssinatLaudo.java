package br.gov.mec.aghu.model;

// Generated 01/06/2010 16:42:11 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptProfCredAssinatLaudo generated by hbm2java
 */
@Entity
@Table(name = "MPT_PROF_CRED_ASSINAT_LAUDOS", schema = "AGH")
public class MptProfCredAssinatLaudo extends BaseEntityId<MptProfCredAssinatLaudoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3287756139679785670L;
	private MptProfCredAssinatLaudoId id;
	private Date alteradoEm;
	private String indLiberaProtocolo;
	private String indSituacao;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;

	public MptProfCredAssinatLaudo() {
	}

	public MptProfCredAssinatLaudo(MptProfCredAssinatLaudoId id,
			String indLiberaProtocolo, String indSituacao, Integer serMatricula,
			Short serVinCodigo, Date criadoEm) {
		this.id = id;
		this.indLiberaProtocolo = indLiberaProtocolo;
		this.indSituacao = indSituacao;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
	}

	public MptProfCredAssinatLaudo(MptProfCredAssinatLaudoId id,
			Date alteradoEm, String indLiberaProtocolo, String indSituacao,
			Integer serMatricula, Short serVinCodigo, Date criadoEm) {
		this.id = id;
		this.alteradoEm = alteradoEm;
		this.indLiberaProtocolo = indLiberaProtocolo;
		this.indSituacao = indSituacao;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pecPreSerMatricula", column = @Column(name = "PEC_PRE_SER_MATRICULA", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "pecPreSerVinCodigo", column = @Column(name = "PEC_PRE_SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "pecPreEspSeq", column = @Column(name = "PEC_PRE_ESP_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "pecCnvCodigo", column = @Column(name = "PEC_CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "tptSeq", column = @Column(name = "TPT_SEQ", nullable = false, precision = 6, scale = 0)) })
	public MptProfCredAssinatLaudoId getId() {
		return this.id;
	}

	public void setId(MptProfCredAssinatLaudoId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_LIBERA_PROTOCOLO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndLiberaProtocolo() {
		return this.indLiberaProtocolo;
	}

	public void setIndLiberaProtocolo(String indLiberaProtocolo) {
		this.indLiberaProtocolo = indLiberaProtocolo;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	
	public enum Fields {
		MATRICULA("id.pecPreSerMatricula"),
		VINCULO("id.pecPreSerVinCodigo"),
		ESP_SEQ("id.pecPreEspSeq"),
		CNV_SEQ("id.pecCnvCodigo");

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
		if (!(obj instanceof MptProfCredAssinatLaudo)) {
			return false;
		}
		MptProfCredAssinatLaudo other = (MptProfCredAssinatLaudo) obj;
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
