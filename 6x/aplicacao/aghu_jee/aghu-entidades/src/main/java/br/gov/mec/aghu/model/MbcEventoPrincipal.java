package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoEventoMbcPrincipal;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcEventoPrincipais generated by hbm2java
 */
@Entity
@Table(name = "MBC_EVENTO_PRINCIPAIS", schema = "AGH")
public class MbcEventoPrincipal extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3114817787039240128L;
	private Short seq;
	private Integer version;
	private MbcEventoPrincipal mbcEventoPrincipais;
	private String nome;
	private String nomeReduzido;
	private Short ordem;
	private DominioTipoEventoMbcPrincipal tipoEvento;
	private Boolean complemento;
	private String tipoComplemento;
	private Boolean pareado;
	private Boolean unico;
	private String icone;
	private DominioSituacao situacao;
	private RapServidores servidor;
	private Date criadoEm;
	private Set<MbcFichaEvento> mbcFichaEventoses = new HashSet<MbcFichaEvento>(
			0);
	private Set<MbcEventoPrincipal> mbcEventoPrincipaises = new HashSet<MbcEventoPrincipal>(
			0);

	public MbcEventoPrincipal() {
	}

	public MbcEventoPrincipal(Short seq, Integer version,
			MbcEventoPrincipal mbcEventoPrincipais, String nome,
			String nomeReduzido, Short ordem, DominioTipoEventoMbcPrincipal tipoEvento,
			Boolean complemento, String tipoComplemento, Boolean pareado,
			Boolean unico, String icone, DominioSituacao situacao,
			RapServidores servidor, Date criadoEm,
			Set<MbcFichaEvento> mbcFichaEventoses,
			Set<MbcEventoPrincipal> mbcEventoPrincipaises) {
		super();
		this.seq = seq;
		this.version = version;
		this.mbcEventoPrincipais = mbcEventoPrincipais;
		this.nome = nome;
		this.nomeReduzido = nomeReduzido;
		this.ordem = ordem;
		this.tipoEvento = tipoEvento;
		this.complemento = complemento;
		this.tipoComplemento = tipoComplemento;
		this.pareado = pareado;
		this.unico = unico;
		this.icone = icone;
		this.situacao = situacao;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.mbcFichaEventoses = mbcFichaEventoses;
		this.mbcEventoPrincipaises = mbcEventoPrincipaises;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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
	@JoinColumn(name = "EVP_SEQ")
	public MbcEventoPrincipal getMbcEventoPrincipais() {
		return this.mbcEventoPrincipais;
	}

	public void setMbcEventoPrincipais(MbcEventoPrincipal mbcEventoPrincipais) {
		this.mbcEventoPrincipais = mbcEventoPrincipais;
	}

	@Column(name = "NOME", nullable = false, length = 120)
	@Length(max = 120)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "NOME_REDUZIDO", nullable = false, length = 20)
	@Length(max = 20)
	public String getNomeReduzido() {
		return this.nomeReduzido;
	}

	public void setNomeReduzido(String nomeReduzido) {
		this.nomeReduzido = nomeReduzido;
	}

	@Column(name = "ORDEM", nullable = false)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Column(name = "TIPO_EVENTO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoEventoMbcPrincipal getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(DominioTipoEventoMbcPrincipal tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	@Column(name = "COMPLEMENTO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getComplemento() {
		return this.complemento;
	}

	public void setComplemento(Boolean complemento) {
		this.complemento = complemento;
	}

	@Column(name = "TIPO_COMPLEMENTO", length = 1)
	@Length(max = 1)
	public String getTipoComplemento() {
		return this.tipoComplemento;
	}

	public void setTipoComplemento(String tipoComplemento) {
		this.tipoComplemento = tipoComplemento;
	}

	@Column(name = "PAREADO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPareado() {
		return this.pareado;
	}

	public void setPareado(Boolean pareado) {
		this.pareado = pareado;
	}

	@Column(name = "UNICO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getUnico() {
		return this.unico;
	}

	public void setUnico(Boolean unico) {
		this.unico = unico;
	}

	@Column(name = "ICONE", length = 45)
	@Length(max = 45)
	public String getIcone() {
		return this.icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcEventoPrincipais")
	public Set<MbcFichaEvento> getMbcFichaEventoses() {
		return this.mbcFichaEventoses;
	}

	public void setMbcFichaEventoses(Set<MbcFichaEvento> mbcFichaEventoses) {
		this.mbcFichaEventoses = mbcFichaEventoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcEventoPrincipais")
	public Set<MbcEventoPrincipal> getMbcEventoPrincipaises() {
		return this.mbcEventoPrincipaises;
	}

	public void setMbcEventoPrincipaises(
			Set<MbcEventoPrincipal> mbcEventoPrincipaises) {
		this.mbcEventoPrincipaises = mbcEventoPrincipaises;
	}

	
	public enum Fields {
		
		SEQ("seq"),
		EVENTO_PRINCIPAL("mbcEventoPrincipais"),
		NOME("nome"),
		NOME_REDUZIDO("nomeReduzido"),
		ORDEM("ordem"),
		TIPO_EVENTO("tipoEvento"),
		COMPLEMENTO("complemento"),
		TIPO_COMPLEMENTO("tipoComplemento"),
		PAREADO("pareado"),
		UNICO("unico"),
		ICONE("icone"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		FICHAS_EVENTOS("mbcFichaEventoses"),
		EVENTOS_PRINCIPAIS("mbcEventoPrincipaises");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
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
		if (!(obj instanceof MbcEventoPrincipal)) {
			return false;
		}
		MbcEventoPrincipal other = (MbcEventoPrincipal) obj;
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
