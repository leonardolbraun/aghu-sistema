package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamAcessoRefeitorio generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamMcrSq1", sequenceName="AGH.MAM_MCR_SQ1", allocationSize = 1)
@Table(name = "MAM_ACESSO_REFEITORIOS", schema = "AGH")
public class MamAcessoRefeitorio extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6081549351679419842L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidoresByMamMcrSerFk1;
	private RapServidores rapServidoresByMamMcrSerFk2;
	private AghAtendimentos aghAtendimentos;
	private AelSolicitacaoExames aelSolicitacaoExames;
	private Date dthrInicio;
	private Date dthrEncerramento;
	private Long numCra;
	private String motivoEncerramento;
	private Date criadoEm;
	private Date encerradoEm;
	private Short qtdeRefeicoes;
	private String tipoAcesso;

	public MamAcessoRefeitorio() {
	}

	public MamAcessoRefeitorio(Integer seq, RapServidores rapServidoresByMamMcrSerFk1, Date dthrInicio, Long numCra, Date criadoEm) {
		this.seq = seq;
		this.rapServidoresByMamMcrSerFk1 = rapServidoresByMamMcrSerFk1;
		this.dthrInicio = dthrInicio;
		this.numCra = numCra;
		this.criadoEm = criadoEm;
	}

	public MamAcessoRefeitorio(Integer seq, RapServidores rapServidoresByMamMcrSerFk1, RapServidores rapServidoresByMamMcrSerFk2,
			AghAtendimentos aghAtendimentos, AelSolicitacaoExames aelSolicitacaoExames, Date dthrInicio, Date dthrEncerramento,
			Long numCra, String motivoEncerramento, Date criadoEm, Date encerradoEm, Short qtdeRefeicoes, String tipoAcesso) {
		this.seq = seq;
		this.rapServidoresByMamMcrSerFk1 = rapServidoresByMamMcrSerFk1;
		this.rapServidoresByMamMcrSerFk2 = rapServidoresByMamMcrSerFk2;
		this.aghAtendimentos = aghAtendimentos;
		this.aelSolicitacaoExames = aelSolicitacaoExames;
		this.dthrInicio = dthrInicio;
		this.dthrEncerramento = dthrEncerramento;
		this.numCra = numCra;
		this.motivoEncerramento = motivoEncerramento;
		this.criadoEm = criadoEm;
		this.encerradoEm = encerradoEm;
		this.qtdeRefeicoes = qtdeRefeicoes;
		this.tipoAcesso = tipoAcesso;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamMcrSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMamMcrSerFk1() {
		return this.rapServidoresByMamMcrSerFk1;
	}

	public void setRapServidoresByMamMcrSerFk1(RapServidores rapServidoresByMamMcrSerFk1) {
		this.rapServidoresByMamMcrSerFk1 = rapServidoresByMamMcrSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ENCERRA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ENCERRA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamMcrSerFk2() {
		return this.rapServidoresByMamMcrSerFk2;
	}

	public void setRapServidoresByMamMcrSerFk2(RapServidores rapServidoresByMamMcrSerFk2) {
		this.rapServidoresByMamMcrSerFk2 = rapServidoresByMamMcrSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAghAtendimentos() {
		return this.aghAtendimentos;
	}

	public void setAghAtendimentos(AghAtendimentos aghAtendimentos) {
		this.aghAtendimentos = aghAtendimentos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOE_SEQ")
	public AelSolicitacaoExames getAelSolicitacaoExames() {
		return this.aelSolicitacaoExames;
	}

	public void setAelSolicitacaoExames(AelSolicitacaoExames aelSolicitacaoExames) {
		this.aelSolicitacaoExames = aelSolicitacaoExames;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO", nullable = false, length = 29)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_ENCERRAMENTO", length = 29)
	public Date getDthrEncerramento() {
		return this.dthrEncerramento;
	}

	public void setDthrEncerramento(Date dthrEncerramento) {
		this.dthrEncerramento = dthrEncerramento;
	}

	@Column(name = "NUM_CRA", nullable = false)
	public Long getNumCra() {
		return this.numCra;
	}

	public void setNumCra(Long numCra) {
		this.numCra = numCra;
	}

	@Column(name = "MOTIVO_ENCERRAMENTO", length = 1)
	@Length(max = 1)
	public String getMotivoEncerramento() {
		return this.motivoEncerramento;
	}

	public void setMotivoEncerramento(String motivoEncerramento) {
		this.motivoEncerramento = motivoEncerramento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENCERRADO_EM", length = 29)
	public Date getEncerradoEm() {
		return this.encerradoEm;
	}

	public void setEncerradoEm(Date encerradoEm) {
		this.encerradoEm = encerradoEm;
	}

	@Column(name = "QTDE_REFEICOES")
	public Short getQtdeRefeicoes() {
		return this.qtdeRefeicoes;
	}

	public void setQtdeRefeicoes(Short qtdeRefeicoes) {
		this.qtdeRefeicoes = qtdeRefeicoes;
	}

	@Column(name = "TIPO_ACESSO", length = 1)
	@Length(max = 1)
	public String getTipoAcesso() {
		return this.tipoAcesso;
	}

	public void setTipoAcesso(String tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_MAM_MCR_SER_FK1("rapServidoresByMamMcrSerFk1"),
		RAP_SERVIDORES_BY_MAM_MCR_SER_FK2("rapServidoresByMamMcrSerFk2"),
		AGH_ATENDIMENTOS("aghAtendimentos"),
		AEL_SOLICITACAO_EXAMES("aelSolicitacaoExames"),
		DTHR_INICIO("dthrInicio"),
		DTHR_ENCERRAMENTO("dthrEncerramento"),
		NUM_CRA("numCra"),
		MOTIVO_ENCERRAMENTO("motivoEncerramento"),
		CRIADO_EM("criadoEm"),
		ENCERRADO_EM("encerradoEm"),
		QTDE_REFEICOES("qtdeRefeicoes"),
		TIPO_ACESSO("tipoAcesso");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamAcessoRefeitorio)) {
			return false;
		}
		MamAcessoRefeitorio other = (MamAcessoRefeitorio) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}