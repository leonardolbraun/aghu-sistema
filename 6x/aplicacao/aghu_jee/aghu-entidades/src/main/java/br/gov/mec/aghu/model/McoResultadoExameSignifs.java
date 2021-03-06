package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * McoResultadoExameSignifs generated by hbm2java
 */
@Entity
@Table(name = "MCO_RESULTADO_EXAME_SIGNIFS", schema = "AGH")
public class McoResultadoExameSignifs extends BaseEntityId<McoResultadoExameSignifsId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1247597253311989223L;
	private McoResultadoExameSignifsId id;
	private McoGestacoes mcoGestacoes;
	private Date dataRealizacao;
	private String resultado;
	private Date criadoEm;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Short iseSeqp;
	private Integer iseSoeSeq;
	private McoExameExterno exameExterno;
	private Integer serMatricula;
	private Short serVinCodigo;

	public McoResultadoExameSignifs() {
	}

	public McoResultadoExameSignifs(McoResultadoExameSignifsId id,
			McoGestacoes mcoGestacoes, Date criadoEm, Integer serMatricula,
			Short serVinCodigo) {
		this.id = id;
		this.mcoGestacoes = mcoGestacoes;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public McoResultadoExameSignifs(McoResultadoExameSignifsId id,
			McoGestacoes mcoGestacoes, Date dataRealizacao, String resultado,
			Date criadoEm, String emaExaSigla, Integer emaManSeq,
			Short iseSeqp, Integer iseSoeSeq, McoExameExterno exameExterno, Integer serMatricula,
			Short serVinCodigo) {
		this.id = id;
		this.mcoGestacoes = mcoGestacoes;
		this.dataRealizacao = dataRealizacao;
		this.resultado = resultado;
		this.criadoEm = criadoEm;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.iseSeqp = iseSeqp;
		this.iseSoeSeq = iseSoeSeq;
		this.exameExterno = exameExterno;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "gsoPacCodigo", column = @Column(name = "GSO_PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "gsoSeqp", column = @Column(name = "GSO_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public McoResultadoExameSignifsId getId() {
		return this.id;
	}

	public void setId(McoResultadoExameSignifsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "GSO_PAC_CODIGO", referencedColumnName = "PAC_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "GSO_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public McoGestacoes getMcoGestacoes() {
		return this.mcoGestacoes;
	}

	public void setMcoGestacoes(McoGestacoes mcoGestacoes) {
		this.mcoGestacoes = mcoGestacoes;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_REALIZACAO", length = 7)
	public Date getDataRealizacao() {
		return this.dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	@Column(name = "RESULTADO", length = 55)
	@Length(max = 55)
	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "EMA_EXA_SIGLA", length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", precision = 5, scale = 0)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "ISE_SEQP", precision = 3, scale = 0)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "ISE_SOE_SEQ", precision = 8, scale = 0)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EEX_SEQ", referencedColumnName = "SEQ", nullable = true)
	public McoExameExterno getExameExterno() {
		return exameExterno;
	}

	public void setExameExterno(McoExameExterno exameExterno) {
		this.exameExterno = exameExterno;
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

	public enum Fields {
		CODIGO_PACIENTE("id.gsoPacCodigo"), 
		SEQUENCE("id.gsoSeqp"),
		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		SEQP("id.seqp"),
		MCO_GESTACOES("mcoGestacoes"),
		EXA_EXT_SEQ("exameExterno.seq"),
		DATA_REALIZACAO("dataRealizacao"),
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
		if (!(obj instanceof McoResultadoExameSignifs)) {
			return false;
		}
		McoResultadoExameSignifs other = (McoResultadoExameSignifs) obj;
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
