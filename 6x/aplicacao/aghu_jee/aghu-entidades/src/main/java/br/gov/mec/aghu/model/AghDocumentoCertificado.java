package br.gov.mec.aghu.model;

// Generated 30/05/2011 11:19:07 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioIdentificadorDocumentoAssinado;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoDocumento;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghDocumentosCertificados generated by hbm2java
 */

@Entity
@SequenceGenerator(name="aghDceSq1", sequenceName="AGH_DCE_SQ1", allocationSize = 1)
@Table(name = "AGH_DOCUMENTOS_CERTIFICADOS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {"TIPO", "NOME" }))
public class AghDocumentoCertificado extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4507199417354056221L;
	private Integer seq;
	private Integer version;
	private String nome;
	private Date dthrEdicao;
	private DominioIdentificadorDocumentoAssinado identificador;
	private DominioTipoDocumento tipo;
	private DominioSituacao indSituacao;

	public AghDocumentoCertificado() {
	}

	public AghDocumentoCertificado(Integer seq, String nome, Date dthrEdicao,
			DominioTipoDocumento tipo, DominioSituacao indSituacao) {
		this.seq = seq;
		this.nome = nome;
		this.dthrEdicao = dthrEdicao;
		this.tipo = tipo;
		this.indSituacao = indSituacao;
	}

	public AghDocumentoCertificado(Integer seq, String nome, Date dthrEdicao,
			DominioIdentificadorDocumentoAssinado identificador,
			DominioTipoDocumento tipo, DominioSituacao indSituacao) {
		this.seq = seq;
		this.nome = nome;
		this.dthrEdicao = dthrEdicao;
		this.identificador = identificador;
		this.tipo = tipo;
		this.indSituacao = indSituacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghDceSq1")
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

	@Column(name = "NOME", nullable = false, length = 100)
	@Length(max = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EDICAO", nullable = false, length = 29)
	public Date getDthrEdicao() {
		return this.dthrEdicao;
	}

	public void setDthrEdicao(Date dthrEdicao) {
		this.dthrEdicao = dthrEdicao;
	}

	@Column(name = "IDENTIFICADOR", length = 15)
	@Enumerated(EnumType.STRING)
	public DominioIdentificadorDocumentoAssinado getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(
			DominioIdentificadorDocumentoAssinado identificador) {
		this.identificador = identificador;
	}

	@Column(name = "TIPO", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public DominioTipoDocumento getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioTipoDocumento tipo) {
		this.tipo = tipo;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AghDocumentoCertificado)) {
			return false;
		}
		AghDocumentoCertificado castOther = (AghDocumentoCertificado) other;
		return new EqualsBuilder().append(this.seq, castOther.getSeq()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.seq).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append(Fields.SEQ.toString(), this.seq).append(
						Fields.NOME.toString(), this.nome).toString();
	}

	public enum Fields {

		SEQ("seq"), NOME("nome"), DTHR_EDICAO("dthrEdicao"), IDENTIFICADOR(
				"identificador"), TIPO("tipo"), IND_SITUACAO("indSituacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

}