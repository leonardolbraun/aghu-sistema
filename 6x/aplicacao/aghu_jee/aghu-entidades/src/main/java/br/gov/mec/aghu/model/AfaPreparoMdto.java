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
 * AfaPreparoMdto generated by hbm2java
 */
@Entity
@SequenceGenerator(name="afaPtoSq1", sequenceName="AGH.AFA_PTO_SQ1", allocationSize = 1)
@Table(name = "AFA_PREPARO_MDTOS", schema = "AGH")
public class AfaPreparoMdto extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1080832248443354130L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidoresByAfaPtoSerFk2;
	private MpmPrescricaoMedica mpmPrescricaoMedica;
	private MptPrescricaoMedicamento mptPrescricaoMedicamento;
	private MpmPrescricaoMdto mpmPrescricaoMdto;
	private RapServidores rapServidoresByAfaPtoSerFk1;
	private AfaPrescricaoAssociada afaPrescricaoAssociada;
	private AghUnidadesFuncionais aghUnidadesFuncionais;
	private AghAtendimentos aghAtendimentos;
	private Date criadoEm;
	private Date dataPrescricao;
	private String tipoPreparo;
	private String tipoEtiqueta;
	private Date alteradoEm;
	private Set<AfaItemPreparoMdto> afaItemPreparoMdtoes = new HashSet<AfaItemPreparoMdto>(0);
	private Set<AfaHistoricoPrepMdto> afaHistoricoPrepMdtoes = new HashSet<AfaHistoricoPrepMdto>(0);

	public AfaPreparoMdto() {
	}

	public AfaPreparoMdto(Integer seq, RapServidores rapServidoresByAfaPtoSerFk1, AghUnidadesFuncionais aghUnidadesFuncionais,
			AghAtendimentos aghAtendimentos, Date criadoEm, Date dataPrescricao, String tipoPreparo, String tipoEtiqueta) {
		this.seq = seq;
		this.rapServidoresByAfaPtoSerFk1 = rapServidoresByAfaPtoSerFk1;
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
		this.aghAtendimentos = aghAtendimentos;
		this.criadoEm = criadoEm;
		this.dataPrescricao = dataPrescricao;
		this.tipoPreparo = tipoPreparo;
		this.tipoEtiqueta = tipoEtiqueta;
	}

	public AfaPreparoMdto(Integer seq, RapServidores rapServidoresByAfaPtoSerFk2, MpmPrescricaoMedica mpmPrescricaoMedica,
			MptPrescricaoMedicamento mptPrescricaoMedicamento, MpmPrescricaoMdto mpmPrescricaoMdto, RapServidores rapServidoresByAfaPtoSerFk1,
			AfaPrescricaoAssociada afaPrescricaoAssociada, AghUnidadesFuncionais aghUnidadesFuncionais,
			AghAtendimentos aghAtendimentos, Date criadoEm, Date dataPrescricao, String tipoPreparo, String tipoEtiqueta,
			Date alteradoEm, Set<AfaItemPreparoMdto> afaItemPreparoMdtoes, Set<AfaHistoricoPrepMdto> afaHistoricoPrepMdtoes) {
		this.seq = seq;
		this.rapServidoresByAfaPtoSerFk2 = rapServidoresByAfaPtoSerFk2;
		this.mpmPrescricaoMedica = mpmPrescricaoMedica;
		this.mptPrescricaoMedicamento = mptPrescricaoMedicamento;
		this.mpmPrescricaoMdto = mpmPrescricaoMdto;
		this.rapServidoresByAfaPtoSerFk1 = rapServidoresByAfaPtoSerFk1;
		this.afaPrescricaoAssociada = afaPrescricaoAssociada;
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
		this.aghAtendimentos = aghAtendimentos;
		this.criadoEm = criadoEm;
		this.dataPrescricao = dataPrescricao;
		this.tipoPreparo = tipoPreparo;
		this.tipoEtiqueta = tipoEtiqueta;
		this.alteradoEm = alteradoEm;
		this.afaItemPreparoMdtoes = afaItemPreparoMdtoes;
		this.afaHistoricoPrepMdtoes = afaHistoricoPrepMdtoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "afaPtoSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByAfaPtoSerFk2() {
		return this.rapServidoresByAfaPtoSerFk2;
	}

	public void setRapServidoresByAfaPtoSerFk2(RapServidores rapServidoresByAfaPtoSerFk2) {
		this.rapServidoresByAfaPtoSerFk2 = rapServidoresByAfaPtoSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PME_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PME_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoMedica getMpmPrescricaoMedica() {
		return this.mpmPrescricaoMedica;
	}

	public void setMpmPrescricaoMedica(MpmPrescricaoMedica mpmPrescricaoMedica) {
		this.mpmPrescricaoMedica = mpmPrescricaoMedica;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PMO_PTE_ATD_SEQ", referencedColumnName = "PTE_ATD_SEQ"),
			@JoinColumn(name = "PMO_PTE_SEQ", referencedColumnName = "PTE_SEQ"),
			@JoinColumn(name = "PMO_SEQ", referencedColumnName = "SEQ") })
	public MptPrescricaoMedicamento getMptPrescricaoMedicamento() {
		return this.mptPrescricaoMedicamento;
	}

	public void setMptPrescricaoMedicamento(MptPrescricaoMedicamento mptPrescricaoMedicamento) {
		this.mptPrescricaoMedicamento = mptPrescricaoMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PMD_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PMD_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoMdto getMpmPrescricaoMdto() {
		return this.mpmPrescricaoMdto;
	}

	public void setMpmPrescricaoMdto(MpmPrescricaoMdto mpmPrescricaoMdto) {
		this.mpmPrescricaoMdto = mpmPrescricaoMdto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByAfaPtoSerFk1() {
		return this.rapServidoresByAfaPtoSerFk1;
	}

	public void setRapServidoresByAfaPtoSerFk1(RapServidores rapServidoresByAfaPtoSerFk1) {
		this.rapServidoresByAfaPtoSerFk1 = rapServidoresByAfaPtoSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PSO_CMD_SEQ", referencedColumnName = "CMD_SEQ"),
			@JoinColumn(name = "PSO_SEQP", referencedColumnName = "SEQP") })
	public AfaPrescricaoAssociada getAfaPrescricaoAssociada() {
		return this.afaPrescricaoAssociada;
	}

	public void setAfaPrescricaoAssociada(AfaPrescricaoAssociada afaPrescricaoAssociada) {
		this.afaPrescricaoAssociada = afaPrescricaoAssociada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = false)
	public AghUnidadesFuncionais getAghUnidadesFuncionais() {
		return this.aghUnidadesFuncionais;
	}

	public void setAghUnidadesFuncionais(AghUnidadesFuncionais aghUnidadesFuncionais) {
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = false)
	public AghAtendimentos getAghAtendimentos() {
		return this.aghAtendimentos;
	}

	public void setAghAtendimentos(AghAtendimentos aghAtendimentos) {
		this.aghAtendimentos = aghAtendimentos;
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
	@Column(name = "DATA_PRESCRICAO", nullable = false, length = 29)
	public Date getDataPrescricao() {
		return this.dataPrescricao;
	}

	public void setDataPrescricao(Date dataPrescricao) {
		this.dataPrescricao = dataPrescricao;
	}

	@Column(name = "TIPO_PREPARO", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipoPreparo() {
		return this.tipoPreparo;
	}

	public void setTipoPreparo(String tipoPreparo) {
		this.tipoPreparo = tipoPreparo;
	}

	@Column(name = "TIPO_ETIQUETA", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipoEtiqueta() {
		return this.tipoEtiqueta;
	}

	public void setTipoEtiqueta(String tipoEtiqueta) {
		this.tipoEtiqueta = tipoEtiqueta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afaPreparoMdto")
	public Set<AfaItemPreparoMdto> getAfaItemPreparoMdtoes() {
		return this.afaItemPreparoMdtoes;
	}

	public void setAfaItemPreparoMdtoes(Set<AfaItemPreparoMdto> afaItemPreparoMdtoes) {
		this.afaItemPreparoMdtoes = afaItemPreparoMdtoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afaPreparoMdto")
	public Set<AfaHistoricoPrepMdto> getAfaHistoricoPrepMdtoes() {
		return this.afaHistoricoPrepMdtoes;
	}

	public void setAfaHistoricoPrepMdtoes(Set<AfaHistoricoPrepMdto> afaHistoricoPrepMdtoes) {
		this.afaHistoricoPrepMdtoes = afaHistoricoPrepMdtoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_AFA_PTO_SER_FK2("rapServidoresByAfaPtoSerFk2"),
		MPM_PRESCRICAO_MEDICA("mpmPrescricaoMedica"),
		MPT_PRESCRICAO_MEDICAMENTO("mptPrescricaoMedicamento"),
		MPM_PRESCRICAO_MDTO("mpmPrescricaoMdto"),
		RAP_SERVIDORES_BY_AFA_PTO_SER_FK1("rapServidoresByAfaPtoSerFk1"),
		AFA_PRESCRICAO_ASSOCIADAS("afaPrescricaoAssociada"),
		AGH_UNIDADES_FUNCIONAIS("aghUnidadesFuncionais"),
		AGH_ATENDIMENTOS("aghAtendimentos"),
		CRIADO_EM("criadoEm"),
		DATA_PRESCRICAO("dataPrescricao"),
		TIPO_PREPARO("tipoPreparo"),
		TIPO_ETIQUETA("tipoEtiqueta"),
		ALTERADO_EM("alteradoEm"),
		AFA_ITEM_PREPARO_MDTOES("afaItemPreparoMdtoes"),
		AFA_HISTORICO_PREP_MDTOES("afaHistoricoPrepMdtoes");

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
		if (!(obj instanceof AfaPreparoMdto)) {
			return false;
		}
		AfaPreparoMdto other = (AfaPreparoMdto) obj;
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
