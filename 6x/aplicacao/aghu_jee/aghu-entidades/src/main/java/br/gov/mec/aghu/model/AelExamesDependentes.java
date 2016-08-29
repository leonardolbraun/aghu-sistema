package br.gov.mec.aghu.model;

// Generated 17/03/2011 15:19:44 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelExamesDependentes generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "AEL_EXAMES_DEPENDENTES", schema = "AGH")
public class AelExamesDependentes extends BaseEntityId<AelExamesDependentesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3567825740785400077L;
	private AelExamesDependentesId id;
	private AelExamesDependentesId idAux;
	private Integer version;
	private DominioSimNao indOpcional;
	private DominioSimNao indCancelaAutomatico;
	private DominioSituacao indSituacao;
	
	private DominioSimNao indCancLaudoUnico;
	private RapServidores servidor;
	private AelExamesMaterialAnalise aelExamesMaterialAnalise;
	private VAelExameMatAnalise exameDependente;
	
	
	public AelExamesDependentes() {
	}

	public AelExamesDependentes(AelExamesDependentesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false)),
			@AttributeOverride(name = "emaExaSiglaEhDependente", column = @Column(name = "EMA_EXA_SIGLA_EH_DEPENDENTE", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeqEhDependente", column = @Column(name = "EMA_MAN_SEQ_EH_DEPENDENTE", nullable = false)) })
	public AelExamesDependentesId getId() {
		return this.id;
	}

	public void setId(AelExamesDependentesId id) {
		this.id = id;
	}
	
	@Transient
	public AelExamesDependentesId getIdAux() {
		return this.idAux;
	}

	public void setIdAux(AelExamesDependentesId idAux) {
		this.idAux = idAux;
	}
	

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "IND_OPCIONAL", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndOpcional() {
		return this.indOpcional;
	}

	public void setIndOpcional(DominioSimNao indOpcional) {
		this.indOpcional = indOpcional;
	}
	
	
	@Transient
	public boolean isIndOpcionalAux() {
		if (indOpcional != null && indOpcional.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	@Column(name = "IND_CANCELA_AUTOMATICO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCancelaAutomatico() {
		return this.indCancelaAutomatico;
	}

	public void setIndCancelaAutomatico(DominioSimNao indCancelaAutomatico) {
		this.indCancelaAutomatico = indCancelaAutomatico;
	}

	@Transient
	public boolean isIndCancelaAutomaticoAux() {
		if (indCancelaAutomatico != null && indCancelaAutomatico.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
	
	@Column(name = "IND_CANC_LAUDO_UNICO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCancLaudoUnico() {
		return this.indCancLaudoUnico;
	}

	public void setIndCancLaudoUnico(DominioSimNao indCancLaudoUnico) {
		this.indCancLaudoUnico = indCancLaudoUnico;
	}

	@Transient
	public boolean isIndCancLaudoUnicoAux() {
		if (indCancLaudoUnico != null && indCancLaudoUnico.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {
		ID("id"),
		EMA_EXA_SIGLA("id.emaExaSigla"),
		EMA_MAN_SEQ("id.emaManSeq"),
		EMA_EXA_SIGLA_DEPENDENTE("id.emaExaSiglaEhDependente"),
		EMA_MAN_SEQ_DEPENDENTE("id.emaManSeqEhDependente"),
		SITUACAO("indSituacao"),
		IND_OPCIONAL("indOpcional"),
		IND_CANC_AUTOMATICO("indCancelaAutomatico"),
		EMA_EXA_SIGLA_EH_DEPENDENTE("id.emaExaSiglaEhDependente"),
		EMA_MAN_SEQ_EH_DEPENDENTE("id.emaManSeqEhDependente"),
		IND_CANC_LAUDO_UNICO("indCancLaudoUnico"),
		EXAMES_MATERIAL_ANALISE("aelExamesMaterialAnalise"),
		EXAME_DEPENDENTE("exameDependente");
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
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumns( {
		@JoinColumn(name = "EMA_EXA_SIGLA",referencedColumnName = "EXA_SIGLA", nullable = false,insertable=false, updatable=false),
		@JoinColumn(name = "EMA_MAN_SEQ",referencedColumnName = "MAN_SEQ", nullable = false,insertable=false, updatable=false) })	
	public AelExamesMaterialAnalise getAelExamesMaterialAnalise() {
		return aelExamesMaterialAnalise;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumns( { 
		@JoinColumn(name = "EMA_EXA_SIGLA_EH_DEPENDENTE",referencedColumnName = "SIGLA", nullable = false,insertable=false, updatable=false),
		@JoinColumn(name = "EMA_MAN_SEQ_EH_DEPENDENTE",referencedColumnName = "MAN_SEQ", nullable = false,insertable=false, updatable=false)})
	public VAelExameMatAnalise getExameDependente() {
		return exameDependente;
	}

	public void setAelExamesMaterialAnalise(
			AelExamesMaterialAnalise aelExamesMaterialAnalise) {
		this.aelExamesMaterialAnalise = aelExamesMaterialAnalise;
	}

	public void setIndCancelaAutomaticoAux(boolean indCancelaAutomaticoAux) {
		this.setIndCancelaAutomatico(DominioSimNao.getInstance(indCancelaAutomaticoAux));
	}

	public void setIndCancLaudoUnicoAux(boolean indCancLaudoUnicoAux) {
		this.setIndCancLaudoUnico(DominioSimNao.getInstance(indCancLaudoUnicoAux));
	}

	public void setIndOpcionalAux(boolean indOpcionalAux) {
		this.setIndOpcional(DominioSimNao.getInstance(indOpcionalAux));
	}

	@PostLoad
	protected void setIdAuxFromId(){
		AelExamesDependentesId idAux = new AelExamesDependentesId();
		idAux.setEmaExaSigla(id.getEmaExaSigla());
		idAux.setEmaManSeq(id.getEmaManSeq());
		idAux.setEmaExaSiglaEhDependente(id.getEmaExaSiglaEhDependente());
		idAux.setEmaManSeqEhDependente(id.getEmaManSeqEhDependente());

		setIdAux(idAux);
	}

	public void setExameDependente(VAelExameMatAnalise exameDependente) {
		this.exameDependente = exameDependente;
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
		if (!(obj instanceof AelExamesDependentes)) {
			return false;
		}
		AelExamesDependentes other = (AelExamesDependentes) obj;
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