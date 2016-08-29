package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamRespostaNotifInfeccao generated by hbm2java
 */
@Entity
@Table(name = "MAM_RESPOSTA_NOTIF_INFECCOES", schema = "AGH")
public class MamRespostaNotifInfeccao extends BaseEntityId<MamRespostaNotifInfeccaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5201995924099343747L;
	private MamRespostaNotifInfeccaoId id;
	private Integer version;
	private MciTopografiaProcedimento mciTopografiaProcedimentoByTopSeqSeg;
	private MciTopografiaProcedimento mciTopografiaProcedimentoByTopSeq;
	private MamPistaNotifInfeccao mamPistaNotifInfeccao;
	private String infeccao;
	private String endometrite;
	private String feridaOperatoria;
	private String indAnalisadoCcih;
	private String indUserRespondeu;
	private AacConsultas consulta;
	private String observacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String confirmacao;
	private String contaminacaoCcih;
	private String infeccaoCcih;
	private String endometriteCcih;
	private String feridaOperatoriaCcih;
	
	// FIXME Implementar este relacionamento
//	private Set<MciMvtoInfeccaoTopografias> mciMvtoInfeccaoTopografiases = new HashSet<MciMvtoInfeccaoTopografias>(0);

	public MamRespostaNotifInfeccao() {
	}

	public MamRespostaNotifInfeccao(MamRespostaNotifInfeccaoId id, MamPistaNotifInfeccao mamPistaNotifInfeccao,
			String indAnalisadoCcih, String indUserRespondeu, Date criadoEm, Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.mamPistaNotifInfeccao = mamPistaNotifInfeccao;
		this.indAnalisadoCcih = indAnalisadoCcih;
		this.indUserRespondeu = indUserRespondeu;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}


	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pnnSeq", column = @Column(name = "PNN_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MamRespostaNotifInfeccaoId getId() {
		return this.id;
	}

	public void setId(MamRespostaNotifInfeccaoId id) {
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
	@JoinColumn(name = "TOP_SEQ_SEG")
	public MciTopografiaProcedimento getMciTopografiaProcedimentoByTopSeqSeg() {
		return this.mciTopografiaProcedimentoByTopSeqSeg;
	}

	public void setMciTopografiaProcedimentoByTopSeqSeg(MciTopografiaProcedimento mciTopografiaProcedimentoByTopSeqSeg) {
		this.mciTopografiaProcedimentoByTopSeqSeg = mciTopografiaProcedimentoByTopSeqSeg;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TOP_SEQ")
	public MciTopografiaProcedimento getMciTopografiaProcedimentoByTopSeq() {
		return this.mciTopografiaProcedimentoByTopSeq;
	}

	public void setMciTopografiaProcedimentoByTopSeq(MciTopografiaProcedimento mciTopografiaProcedimentoByTopSeq) {
		this.mciTopografiaProcedimentoByTopSeq = mciTopografiaProcedimentoByTopSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PNN_SEQ", nullable = false, insertable = false, updatable = false)
	public MamPistaNotifInfeccao getMamPistaNotifInfeccao() {
		return this.mamPistaNotifInfeccao;
	}

	public void setMamPistaNotifInfeccao(MamPistaNotifInfeccao mamPistaNotifInfeccao) {
		this.mamPistaNotifInfeccao = mamPistaNotifInfeccao;
	}

	@Column(name = "INFECCAO", length = 1)
	@Length(max = 1)
	public String getInfeccao() {
		return this.infeccao;
	}

	public void setInfeccao(String infeccao) {
		this.infeccao = infeccao;
	}

	@Column(name = "ENDOMETRITE", length = 1)
	@Length(max = 1)
	public String getEndometrite() {
		return this.endometrite;
	}

	public void setEndometrite(String endometrite) {
		this.endometrite = endometrite;
	}

	@Column(name = "FERIDA_OPERATORIA", length = 1)
	@Length(max = 1)
	public String getFeridaOperatoria() {
		return this.feridaOperatoria;
	}

	public void setFeridaOperatoria(String feridaOperatoria) {
		this.feridaOperatoria = feridaOperatoria;
	}

	@Column(name = "IND_ANALISADO_CCIH", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndAnalisadoCcih() {
		return this.indAnalisadoCcih;
	}

	public void setIndAnalisadoCcih(String indAnalisadoCcih) {
		this.indAnalisadoCcih = indAnalisadoCcih;
	}

	@Column(name = "IND_USER_RESPONDEU", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUserRespondeu() {
		return this.indUserRespondeu;
	}

	public void setIndUserRespondeu(String indUserRespondeu) {
		this.indUserRespondeu = indUserRespondeu;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CON_NUMERO")
	public AacConsultas getConsulta() {
		return consulta;
	}
	
	public void setConsulta(AacConsultas consulta) {
		this.consulta = consulta;
	}

	@Column(name = "OBSERVACAO", length = 500)
	@Length(max = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "CONFIRMACAO", length = 1)
	@Length(max = 1)
	public String getConfirmacao() {
		return this.confirmacao;
	}

	public void setConfirmacao(String confirmacao) {
		this.confirmacao = confirmacao;
	}

	@Column(name = "CONTAMINACAO_CCIH", length = 1)
	@Length(max = 1)
	public String getContaminacaoCcih() {
		return this.contaminacaoCcih;
	}

	public void setContaminacaoCcih(String contaminacaoCcih) {
		this.contaminacaoCcih = contaminacaoCcih;
	}

	@Column(name = "INFECCAO_CCIH", length = 1)
	@Length(max = 1)
	public String getInfeccaoCcih() {
		return this.infeccaoCcih;
	}

	public void setInfeccaoCcih(String infeccaoCcih) {
		this.infeccaoCcih = infeccaoCcih;
	}

	@Column(name = "ENDOMETRITE_CCIH", length = 1)
	@Length(max = 1)
	public String getEndometriteCcih() {
		return this.endometriteCcih;
	}

	public void setEndometriteCcih(String endometriteCcih) {
		this.endometriteCcih = endometriteCcih;
	}

	@Column(name = "FERIDA_OPERATORIA_CCIH", length = 1)
	@Length(max = 1)
	public String getFeridaOperatoriaCcih() {
		return this.feridaOperatoriaCcih;
	}

	public void setFeridaOperatoriaCcih(String feridaOperatoriaCcih) {
		this.feridaOperatoriaCcih = feridaOperatoriaCcih;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamRespostaNotifInfeccao")
//	public Set<MciMvtoInfeccaoTopografias> getMciMvtoInfeccaoTopografiases() {
//		return this.mciMvtoInfeccaoTopografiases;
//	}
//
//	public void setMciMvtoInfeccaoTopografiases(Set<MciMvtoInfeccaoTopografias> mciMvtoInfeccaoTopografiases) {
//		this.mciMvtoInfeccaoTopografiases = mciMvtoInfeccaoTopografiases;
//	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MCI_TOPOGRAFIA_PROCEDIMENTO_BY_TOP_SEQ_SEG("mciTopografiaProcedimentoByTopSeqSeg"),
		MCI_TOPOGRAFIA_PROCEDIMENTO_BY_TOP_SEQ("mciTopografiaProcedimentoByTopSeq"),
		MAM_PISTA_NOTIF_INFECCOES("mamPistaNotifInfeccao"),
		INFECCAO("infeccao"),
		ENDOMETRITE("endometrite"),
		FERIDA_OPERATORIA("feridaOperatoria"),
		IND_ANALISADO_CCIH("indAnalisadoCcih"),
		IND_USER_RESPONDEU("indUserRespondeu"),
		OBSERVACAO("observacao"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CONFIRMACAO("confirmacao"),
		CONTAMINACAO_CCIH("contaminacaoCcih"),
		INFECCAO_CCIH("infeccaoCcih"),
		ENDOMETRITE_CCIH("endometriteCcih"),
		FERIDA_OPERATORIA_CCIH("feridaOperatoriaCcih"),
		CONSULTA("consulta"),
		PNN_SEQ("id.pnnSeq"),
		CONSULTA_NUMERO("consulta.numero")
//		MCI_MVTO_INFECCAO_TOPOGRAFIASES("mciMvtoInfeccaoTopografiases")
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
		if (!(obj instanceof MamRespostaNotifInfeccao)) {
			return false;
		}
		MamRespostaNotifInfeccao other = (MamRespostaNotifInfeccao) obj;
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