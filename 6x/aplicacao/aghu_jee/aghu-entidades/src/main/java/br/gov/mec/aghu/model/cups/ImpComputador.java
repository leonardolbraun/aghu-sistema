package br.gov.mec.aghu.model.cups;

// Generated 15/09/2010 09:39:00 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * ImpComputador generated by hbm2java
 */
@Entity
@Table(name = "IMP_COMPUTADOR", schema = "AGH", uniqueConstraints = {
		@UniqueConstraint(columnNames = "NOME_COMPUTADOR"),
		@UniqueConstraint(columnNames = "IP_COMPUTADOR") })
@SequenceGenerator(name = "impComputadorSq1", sequenceName = "AGH.IMP_COMPUTADOR_SQ1", allocationSize = 1)
public class ImpComputador extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = -7533035307132948699L;

	private Integer seq;
	private String ipComputador;
	private String nomeComputador;
	private String descricao;
	private String localizacao;
	private Integer version;

	public ImpComputador() {
	}

	public ImpComputador(Integer seq, String ipComputador, String nomeComputador,
			String descricao) {
		this.seq = seq;
		this.ipComputador = ipComputador;
		this.nomeComputador = nomeComputador;
		this.descricao = descricao;
	}

	public ImpComputador(Integer seq, String ipComputador, String nomeComputador,
			String descricao, String localizacao) {
		this.seq = seq;
		this.ipComputador = ipComputador;
		this.nomeComputador = nomeComputador;
		this.descricao = descricao;
		this.localizacao = localizacao;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "impComputadorSq1")
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Integer seq) {
		this.seq = seq;
		
	}
	
	@Column(name = "IP_COMPUTADOR", unique = true, nullable = false, length = 20)
	@Length(max = 20)
	public String getIpComputador() {
		return this.ipComputador;
	}

	public void setIpComputador(String ipComputador) {
		this.ipComputador = ipComputador;
	}

	@Column(name = "NOME_COMPUTADOR", unique = true, nullable = false, length = 30)
	@Length(max = 30)
	public String getNomeComputador() {
		return this.nomeComputador;
	}

	public void setNomeComputador(String nomeComputador) {
		this.nomeComputador = (nomeComputador != null) ? nomeComputador.toUpperCase():nomeComputador;		
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = (descricao != null) ? descricao.toUpperCase():descricao;
	}

	@Column(name = "LOCALIZACAO", length = 500)
	@Length(max = 500)
	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = (localizacao != null) ? localizacao.toUpperCase():localizacao;
	}

	public String toString() {
		return new ToStringBuilder(this).append("id", this.getSeq()).toString();
	}

	public enum Fields {
		IP("ipComputador"), NOME("nomeComputador"), DESCRICAO("descricao");
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@Version
	@Column(name = "VERSION", nullable = false)	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
