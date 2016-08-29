package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * UsuTafa generated by hbm2java
 */
@Entity
@Table(name = "USU_TAFA", schema = "AGH")
public class UsuTafa extends BaseEntityId<UsuTafaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1201537747332639461L;
	private UsuTafaId id;

	public UsuTafa() {
	}

	public UsuTafa(UsuTafaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "usuExmret", column = @Column(name = "USU_EXMRET", length = 1)),
			@AttributeOverride(name = "usuQhrafa", column = @Column(name = "USU_QHRAFA")),
			@AttributeOverride(name = "usuOriafa", column = @Column(name = "USU_ORIAFA")),
			@AttributeOverride(name = "usuCaudem", column = @Column(name = "USU_CAUDEM")),
			@AttributeOverride(name = "usuPrvter", column = @Column(name = "USU_PRVTER", length = 29)),
			@AttributeOverride(name = "usuHorter", column = @Column(name = "USU_HORTER")),
			@AttributeOverride(name = "usuDatter", column = @Column(name = "USU_DATTER", length = 29)),
			@AttributeOverride(name = "usuTipcol", column = @Column(name = "USU_TIPCOL")),
			@AttributeOverride(name = "usuDiajus", column = @Column(name = "USU_DIAJUS")),
			@AttributeOverride(name = "usuObsafa", column = @Column(name = "USU_OBSAFA", length = 80)),
			@AttributeOverride(name = "usuContov", column = @Column(name = "USU_CONTOV", length = 1)),
			@AttributeOverride(name = "usuHorafa", column = @Column(name = "USU_HORAFA")),
			@AttributeOverride(name = "usuDatafa", column = @Column(name = "USU_DATAFA", length = 29)),
			@AttributeOverride(name = "usuNumcad", column = @Column(name = "USU_NUMCAD")),
			@AttributeOverride(name = "usuSitafa", column = @Column(name = "USU_SITAFA")),
			@AttributeOverride(name = "usuStaatu", column = @Column(name = "USU_STAATU", length = 1)),
			@AttributeOverride(name = "usuNumemp", column = @Column(name = "USU_NUMEMP")) })
	public UsuTafaId getId() {
		return this.id;
	}

	public void setId(UsuTafaId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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
		if (!(obj instanceof UsuTafa)) {
			return false;
		}
		UsuTafa other = (UsuTafa) obj;
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