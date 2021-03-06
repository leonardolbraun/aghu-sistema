package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * RapProgramacaoEvento generated by hbm2java
 */
@Entity
@SequenceGenerator(name="rapEvtSq1", sequenceName="AGH.RAP_EVT_SQ1", allocationSize = 1)
@Table(name = "RAP_PROGRAMACAO_EVENTOS", schema = "AGH")
public class RapProgramacaoEvento extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7694629375369441668L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidoresByRapEvtSerFk2;
	private RapTipoQualificacao rapTipoQualificacao;
	private RapInstituicaoQualificadora rapInstituicaoQualificadora;
	private RapServidores rapServidoresByRapEvtSerFk1;
	private Date dtInicioInscricao;
	private Date dtFimInscricao;
	private Date dtInicioRealizacao;
	private Date dtFimRealizacao;
	private Short cargaHoraria;
	private String local;
	private String horario;
	private String publicoAlvo;
	private String indTreinamentoServico;
	private String nomeCoordenador;
	private String tituloCoordenador;
	private String nomeChefe;
	private String tituloChefe;
	private String indConsisteFerias;
	private String tipoEvento;
	private Set<RapParticipanteEvento> rapParticipanteEventos = new HashSet<RapParticipanteEvento>(0);
	private Set<RapInstrutorEvento> rapInstrutorEventos = new HashSet<RapInstrutorEvento>(0);

	public RapProgramacaoEvento() {
	}

	public RapProgramacaoEvento(Integer seq, RapTipoQualificacao rapTipoQualificacao) {
		this.seq = seq;
		this.rapTipoQualificacao = rapTipoQualificacao;
	}

	public RapProgramacaoEvento(Integer seq, RapServidores rapServidoresByRapEvtSerFk2, RapTipoQualificacao rapTipoQualificacao,
			RapInstituicaoQualificadora rapInstituicaoQualificadora, RapServidores rapServidoresByRapEvtSerFk1, Date dtInicioInscricao,
			Date dtFimInscricao, Date dtInicioRealizacao, Date dtFimRealizacao, Short cargaHoraria, String local, String horario,
			String publicoAlvo, String indTreinamentoServico, String nomeCoordenador, String tituloCoordenador, String nomeChefe,
			String tituloChefe, String indConsisteFerias, String tipoEvento, Set<RapParticipanteEvento> rapParticipanteEventos,
			Set<RapInstrutorEvento> rapInstrutorEventos) {
		this.seq = seq;
		this.rapServidoresByRapEvtSerFk2 = rapServidoresByRapEvtSerFk2;
		this.rapTipoQualificacao = rapTipoQualificacao;
		this.rapInstituicaoQualificadora = rapInstituicaoQualificadora;
		this.rapServidoresByRapEvtSerFk1 = rapServidoresByRapEvtSerFk1;
		this.dtInicioInscricao = dtInicioInscricao;
		this.dtFimInscricao = dtFimInscricao;
		this.dtInicioRealizacao = dtInicioRealizacao;
		this.dtFimRealizacao = dtFimRealizacao;
		this.cargaHoraria = cargaHoraria;
		this.local = local;
		this.horario = horario;
		this.publicoAlvo = publicoAlvo;
		this.indTreinamentoServico = indTreinamentoServico;
		this.nomeCoordenador = nomeCoordenador;
		this.tituloCoordenador = tituloCoordenador;
		this.nomeChefe = nomeChefe;
		this.tituloChefe = tituloChefe;
		this.indConsisteFerias = indConsisteFerias;
		this.tipoEvento = tipoEvento;
		this.rapParticipanteEventos = rapParticipanteEventos;
		this.rapInstrutorEventos = rapInstrutorEventos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rapEvtSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CHEFIA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_CHEFIA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapEvtSerFk2() {
		return this.rapServidoresByRapEvtSerFk2;
	}

	public void setRapServidoresByRapEvtSerFk2(RapServidores rapServidoresByRapEvtSerFk2) {
		this.rapServidoresByRapEvtSerFk2 = rapServidoresByRapEvtSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TQL_CODIGO", nullable = false)
	public RapTipoQualificacao getRapTipoQualificacao() {
		return this.rapTipoQualificacao;
	}

	public void setRapTipoQualificacao(RapTipoQualificacao rapTipoQualificacao) {
		this.rapTipoQualificacao = rapTipoQualificacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IQL_CODIGO")
	public RapInstituicaoQualificadora getRapInstituicaoQualificadora() {
		return this.rapInstituicaoQualificadora;
	}

	public void setRapInstituicaoQualificadora(RapInstituicaoQualificadora rapInstituicaoQualificadora) {
		this.rapInstituicaoQualificadora = rapInstituicaoQualificadora;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_COORD", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_COORD", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapEvtSerFk1() {
		return this.rapServidoresByRapEvtSerFk1;
	}

	public void setRapServidoresByRapEvtSerFk1(RapServidores rapServidoresByRapEvtSerFk1) {
		this.rapServidoresByRapEvtSerFk1 = rapServidoresByRapEvtSerFk1;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_INSCRICAO", length = 29)
	public Date getDtInicioInscricao() {
		return this.dtInicioInscricao;
	}

	public void setDtInicioInscricao(Date dtInicioInscricao) {
		this.dtInicioInscricao = dtInicioInscricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_INSCRICAO", length = 29)
	public Date getDtFimInscricao() {
		return this.dtFimInscricao;
	}

	public void setDtFimInscricao(Date dtFimInscricao) {
		this.dtFimInscricao = dtFimInscricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_REALIZACAO", length = 29)
	public Date getDtInicioRealizacao() {
		return this.dtInicioRealizacao;
	}

	public void setDtInicioRealizacao(Date dtInicioRealizacao) {
		this.dtInicioRealizacao = dtInicioRealizacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_REALIZACAO", length = 29)
	public Date getDtFimRealizacao() {
		return this.dtFimRealizacao;
	}

	public void setDtFimRealizacao(Date dtFimRealizacao) {
		this.dtFimRealizacao = dtFimRealizacao;
	}

	@Column(name = "CARGA_HORARIA")
	public Short getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(Short cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Column(name = "LOCAL", length = 60)
	@Length(max = 60)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Column(name = "HORARIO", length = 60)
	@Length(max = 60)
	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Column(name = "PUBLICO_ALVO", length = 300)
	@Length(max = 300)
	public String getPublicoAlvo() {
		return this.publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	@Column(name = "IND_TREINAMENTO_SERVICO", length = 1)
	@Length(max = 1)
	public String getIndTreinamentoServico() {
		return this.indTreinamentoServico;
	}

	public void setIndTreinamentoServico(String indTreinamentoServico) {
		this.indTreinamentoServico = indTreinamentoServico;
	}

	@Column(name = "NOME_COORDENADOR", length = 60)
	@Length(max = 60)
	public String getNomeCoordenador() {
		return this.nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	@Column(name = "TITULO_COORDENADOR", length = 60)
	@Length(max = 60)
	public String getTituloCoordenador() {
		return this.tituloCoordenador;
	}

	public void setTituloCoordenador(String tituloCoordenador) {
		this.tituloCoordenador = tituloCoordenador;
	}

	@Column(name = "NOME_CHEFE", length = 60)
	@Length(max = 60)
	public String getNomeChefe() {
		return this.nomeChefe;
	}

	public void setNomeChefe(String nomeChefe) {
		this.nomeChefe = nomeChefe;
	}

	@Column(name = "TITULO_CHEFE", length = 60)
	@Length(max = 60)
	public String getTituloChefe() {
		return this.tituloChefe;
	}

	public void setTituloChefe(String tituloChefe) {
		this.tituloChefe = tituloChefe;
	}

	@Column(name = "IND_CONSISTE_FERIAS", length = 1)
	@Length(max = 1)
	public String getIndConsisteFerias() {
		return this.indConsisteFerias;
	}

	public void setIndConsisteFerias(String indConsisteFerias) {
		this.indConsisteFerias = indConsisteFerias;
	}

	@Column(name = "TIPO_EVENTO", length = 2)
	@Length(max = 2)
	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapProgramacaoEvento")
	public Set<RapParticipanteEvento> getRapParticipanteEventos() {
		return this.rapParticipanteEventos;
	}

	public void setRapParticipanteEventos(Set<RapParticipanteEvento> rapParticipanteEventos) {
		this.rapParticipanteEventos = rapParticipanteEventos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapProgramacaoEvento")
	public Set<RapInstrutorEvento> getRapInstrutorEventos() {
		return this.rapInstrutorEventos;
	}

	public void setRapInstrutorEventos(Set<RapInstrutorEvento> rapInstrutorEventos) {
		this.rapInstrutorEventos = rapInstrutorEventos;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_EVT_SER_FK2("rapServidoresByRapEvtSerFk2"),
		RAP_TIPO_QUALIFICACAO("rapTipoQualificacao"),
		RAP_INSTITUICAO_QUALIFICADORA("rapInstituicaoQualificadora"),
		RAP_SERVIDORES_BY_RAP_EVT_SER_FK1("rapServidoresByRapEvtSerFk1"),
		DT_INICIO_INSCRICAO("dtInicioInscricao"),
		DT_FIM_INSCRICAO("dtFimInscricao"),
		DT_INICIO_REALIZACAO("dtInicioRealizacao"),
		DT_FIM_REALIZACAO("dtFimRealizacao"),
		CARGA_HORARIA("cargaHoraria"),
		LOCAL("local"),
		HORARIO("horario"),
		PUBLICO_ALVO("publicoAlvo"),
		IND_TREINAMENTO_SERVICO("indTreinamentoServico"),
		NOME_COORDENADOR("nomeCoordenador"),
		TITULO_COORDENADOR("tituloCoordenador"),
		NOME_CHEFE("nomeChefe"),
		TITULO_CHEFE("tituloChefe"),
		IND_CONSISTE_FERIAS("indConsisteFerias"),
		TIPO_EVENTO("tipoEvento"),
		RAP_PARTICIPANTE_EVENTOS("rapParticipanteEventos"),
		RAP_INSTRUTOR_EVENTOS("rapInstrutorEventos");

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
		if (!(obj instanceof RapProgramacaoEvento)) {
			return false;
		}
		RapProgramacaoEvento other = (RapProgramacaoEvento) obj;
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
