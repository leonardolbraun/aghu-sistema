package br.gov.mec.aghu.model;

// Generated 27/12/2010 20:08:36 by Hibernate Tools 3.3.0.GA

import java.util.Date;
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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioSituacaoPrescricao;
import br.gov.mec.aghu.dominio.DominioTipoEmissaoSumario;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * EpePrescricoesEnfermagem generated by hbm2java
 */
@Entity
@Table(name = "EPE_PRESCRICOES_ENFERMAGEM", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"ATD_SEQ", "DTHR_INICIO" }))

public class EpePrescricaoEnfermagem extends BaseEntityId<EpePrescricaoEnfermagemId> implements java.io.Serializable {
	
	public enum Fields {
		ATD_SEQ("id.atdSeq"),
		ATENDIMENTO("atendimento"),
		DTHR_INICIO("dthrInicio"),
		DTHR_FIM("dthrFim"),
		SITUACAO("situacao"),
		SEQ("id.seq"),
		DT_REFERENCIA("dtReferencia"),
		SERVIDOR_VALIDA("servidorValida"),
		DATA_IMP_SUMARIO("dataImpSumario"), CRIADO_EM("criadoEm"), 
		SERVIDOR_VALIDA_MATRICULA("servidorValida.id.matricula"),
		SERVIDOR_VALIDA_VINCULO("servidorValida.id.vinculo")
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 9161581524603065127L;
	private Integer version;
	private EpePrescricaoEnfermagemId id;
	private RapServidores servidor;
	private Date criadoEm;
	private Date dthrInicio;
	private Date dthrFim;
	private Date dtReferencia;
	private DominioSituacaoPrescricao situacao;
	private RapServidores servidorValida;
	private RapServidores servidorAtualizada;
	private Date dthrInicioMvtoPendente;
	private Date dthrMovimento;
	private Date dataImpSumario;
	private DominioTipoEmissaoSumario tipoEmissaoSumario;
	private AghAtendimentos atendimento;
	private Set<EceOrdemDeAdministracao> ordensDeAdministracao = new HashSet<EceOrdemDeAdministracao>(
			0);

	private enum EpePrescricaoEnfermagemExceptionCode implements BusinessExceptionCode {
		DTHR_INICIO_MENOR_DTHR_FIM
	}
	
	public EpePrescricaoEnfermagem() {
	}

	public EpePrescricaoEnfermagem(EpePrescricaoEnfermagemId id,
			RapServidores servidor, Date criadoEm,
			Date dthrInicio, Date dthrFim, Date dtReferencia, DominioSituacaoPrescricao situacao) {
		this.id = id;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.dthrInicio = dthrInicio;
		this.dthrFim = dthrFim;
		this.dtReferencia = dtReferencia;
		this.situacao = situacao;
	}

	public EpePrescricaoEnfermagem(EpePrescricaoEnfermagemId id,
			RapServidores servidor, Date criadoEm,
			Date dthrInicio, Date dthrFim, Date dtReferencia,
			DominioSituacaoPrescricao situacao, RapServidores servidorValida, 
			RapServidores servidorAtualizada, Date dthrInicioMvtoPendente,
			Date dthrMovimento, Date dataImpSumario, DominioTipoEmissaoSumario tipoEmissaoSumario,
			Set<EceOrdemDeAdministracao> ordensDeAdministracao) {
		this.id = id;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.dthrInicio = dthrInicio;
		this.dthrFim = dthrFim;
		this.dtReferencia = dtReferencia;
		this.situacao = situacao;
		this.servidorValida = servidorValida;
		this.servidorAtualizada = servidorAtualizada;
		this.dthrInicioMvtoPendente = dthrInicioMvtoPendente;
		this.dthrMovimento = dthrMovimento;
		this.dataImpSumario = dataImpSumario;
		this.tipoEmissaoSumario = tipoEmissaoSumario;
		this.ordensDeAdministracao = ordensDeAdministracao;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 8, scale = 0)) })
	public EpePrescricaoEnfermagemId getId() {
		return this.id;
	}

	public void setId(EpePrescricaoEnfermagemId id) {
		this.id = id;
	}

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


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO", nullable = false, length = 7)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_FIM", nullable = false, length = 7)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_REFERENCIA", nullable = false, length = 7)
	public Date getDtReferencia() {
		return this.dtReferencia;
	}

	public void setDtReferencia(Date dtReferencia) {
		this.dtReferencia = dtReferencia;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoPrescricao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoPrescricao situacao) {
		this.situacao = situacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorValida() {
		return this.servidorValida;
	}

	public void setServidorValida(RapServidores servidorValida) {
		this.servidorValida = servidorValida;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ATUALIZADA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ATUALIZADA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAtualizada() {
		return this.servidorAtualizada;
	}

	public void setServidorAtualizada(RapServidores servidorAtualizada) {
		this.servidorAtualizada = servidorAtualizada;
	}

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO_MVTO_PENDENTE", length = 7)
	public Date getDthrInicioMvtoPendente() {
		return this.dthrInicioMvtoPendente;
	}

	public void setDthrInicioMvtoPendente(Date dthrInicioMvtoPendente) {
		this.dthrInicioMvtoPendente = dthrInicioMvtoPendente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MOVIMENTO", length = 7)
	public Date getDthrMovimento() {
		return this.dthrMovimento;
	}

	public void setDthrMovimento(Date dthrMovimento) {
		this.dthrMovimento = dthrMovimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_IMP_SUMARIO", length = 7)
	public Date getDataImpSumario() {
		return this.dataImpSumario;
	}

	public void setDataImpSumario(Date dataImpSumario) {
		this.dataImpSumario = dataImpSumario;
	}

	@Column(name = "TIPO_EMISSAO_SUMARIO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoEmissaoSumario getTipoEmissaoSumario() {
		return this.tipoEmissaoSumario;
	}

	public void setTipoEmissaoSumario(DominioTipoEmissaoSumario tipoEmissaoSumario) {
		this.tipoEmissaoSumario = tipoEmissaoSumario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoEnfermagem")
	public Set<EceOrdemDeAdministracao> getOrdensDeAdministracao() {
		return this.ordensDeAdministracao;
	}

	public void setOrdensDeAdministracao(
			Set<EceOrdemDeAdministracao> ordensDeAdministracao) {
		this.ordensDeAdministracao = ordensDeAdministracao;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", insertable=false, updatable=false)
	public AghAtendimentos getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
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
		EpePrescricaoEnfermagem other = (EpePrescricaoEnfermagem) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}



	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarDataInicio() {
		if (dthrInicio!=null && dthrFim!=null && dthrInicio.after(dthrFim)) {
			throw new BaseRuntimeException(EpePrescricaoEnfermagemExceptionCode.DTHR_INICIO_MENOR_DTHR_FIM);
		}
	}

}
