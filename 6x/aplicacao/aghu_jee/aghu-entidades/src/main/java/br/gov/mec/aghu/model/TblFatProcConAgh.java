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
 * TblFatProcConAgh generated by hbm2java
 */
@Entity
@Table(name = "TBL_FAT_PROC_CON_AGH", schema = "AGH")
public class TblFatProcConAgh extends BaseEntityId<TblFatProcConAghId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8162626250431817743L;
	private TblFatProcConAghId id;

	public TblFatProcConAgh() {
	}

	public TblFatProcConAgh(TblFatProcConAghId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codPrnt", column = @Column(name = "COD_PRNT")),
			@AttributeOverride(name = "codUnidHosp", column = @Column(name = "COD_UNID_HOSP")),
			@AttributeOverride(name = "dataSltcTemProcExme", column = @Column(name = "DATA_SLTC_TEM_PROC_EXME", length = 29)),
			@AttributeOverride(name = "qtdeItemProcExmeSltc", column = @Column(name = "QTDE_ITEM_PROC_EXME_SLTC")),
			@AttributeOverride(name = "nroCons", column = @Column(name = "NRO_CONS")),
			@AttributeOverride(name = "indFat", column = @Column(name = "IND_FAT")),
			@AttributeOverride(name = "codItemProc", column = @Column(name = "COD_ITEM_PROC")),
			@AttributeOverride(name = "dataNasc", column = @Column(name = "DATA_NASC", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public TblFatProcConAghId getId() {
		return this.id;
	}

	public void setId(TblFatProcConAghId id) {
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

}
