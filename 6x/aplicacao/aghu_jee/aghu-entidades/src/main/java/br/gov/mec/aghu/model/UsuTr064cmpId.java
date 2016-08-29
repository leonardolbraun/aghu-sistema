package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * UsuTr064cmpId generated by hbm2java
 */
@Embeddable
public class UsuTr064cmpId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2589647976219611316L;
	private Short usuNumemp;
	private Short usuTipcol;
	private Integer usuNumcad;
	private Date usuDatini;
	private Short usuTipcmp;
	private Short usuPercmp;
	private Date usuDatfim;
	private Integer usuIniint;
	private Integer usuFimint;
	private Integer usuQtdhor;
	private Short usuCodsit;
	private Short usuMotsit;
	private Short usuCodhor;
	private Short usuMotsit2;
	private String usuSitrel;
	private String usuJnUsu;
	private String usuJnOper;
	private Date usuJnData;

	public UsuTr064cmpId() {
	}

	public UsuTr064cmpId(Short usuNumemp, Short usuTipcol, Integer usuNumcad, Date usuDatini, Short usuTipcmp, Short usuPercmp,
			Date usuDatfim, Integer usuIniint, Integer usuFimint, Integer usuQtdhor, Short usuCodsit, Short usuMotsit,
			Short usuCodhor, Short usuMotsit2, String usuSitrel, String usuJnUsu, String usuJnOper, Date usuJnData) {
		this.usuNumemp = usuNumemp;
		this.usuTipcol = usuTipcol;
		this.usuNumcad = usuNumcad;
		this.usuDatini = usuDatini;
		this.usuTipcmp = usuTipcmp;
		this.usuPercmp = usuPercmp;
		this.usuDatfim = usuDatfim;
		this.usuIniint = usuIniint;
		this.usuFimint = usuFimint;
		this.usuQtdhor = usuQtdhor;
		this.usuCodsit = usuCodsit;
		this.usuMotsit = usuMotsit;
		this.usuCodhor = usuCodhor;
		this.usuMotsit2 = usuMotsit2;
		this.usuSitrel = usuSitrel;
		this.usuJnUsu = usuJnUsu;
		this.usuJnOper = usuJnOper;
		this.usuJnData = usuJnData;
	}

	@Column(name = "USU_NUMEMP")
	public Short getUsuNumemp() {
		return this.usuNumemp;
	}

	public void setUsuNumemp(Short usuNumemp) {
		this.usuNumemp = usuNumemp;
	}

	@Column(name = "USU_TIPCOL")
	public Short getUsuTipcol() {
		return this.usuTipcol;
	}

	public void setUsuTipcol(Short usuTipcol) {
		this.usuTipcol = usuTipcol;
	}

	@Column(name = "USU_NUMCAD")
	public Integer getUsuNumcad() {
		return this.usuNumcad;
	}

	public void setUsuNumcad(Integer usuNumcad) {
		this.usuNumcad = usuNumcad;
	}

	@Column(name = "USU_DATINI", length = 29)
	public Date getUsuDatini() {
		return this.usuDatini;
	}

	public void setUsuDatini(Date usuDatini) {
		this.usuDatini = usuDatini;
	}

	@Column(name = "USU_TIPCMP")
	public Short getUsuTipcmp() {
		return this.usuTipcmp;
	}

	public void setUsuTipcmp(Short usuTipcmp) {
		this.usuTipcmp = usuTipcmp;
	}

	@Column(name = "USU_PERCMP")
	public Short getUsuPercmp() {
		return this.usuPercmp;
	}

	public void setUsuPercmp(Short usuPercmp) {
		this.usuPercmp = usuPercmp;
	}

	@Column(name = "USU_DATFIM", length = 29)
	public Date getUsuDatfim() {
		return this.usuDatfim;
	}

	public void setUsuDatfim(Date usuDatfim) {
		this.usuDatfim = usuDatfim;
	}

	@Column(name = "USU_INIINT")
	public Integer getUsuIniint() {
		return this.usuIniint;
	}

	public void setUsuIniint(Integer usuIniint) {
		this.usuIniint = usuIniint;
	}

	@Column(name = "USU_FIMINT")
	public Integer getUsuFimint() {
		return this.usuFimint;
	}

	public void setUsuFimint(Integer usuFimint) {
		this.usuFimint = usuFimint;
	}

	@Column(name = "USU_QTDHOR")
	public Integer getUsuQtdhor() {
		return this.usuQtdhor;
	}

	public void setUsuQtdhor(Integer usuQtdhor) {
		this.usuQtdhor = usuQtdhor;
	}

	@Column(name = "USU_CODSIT")
	public Short getUsuCodsit() {
		return this.usuCodsit;
	}

	public void setUsuCodsit(Short usuCodsit) {
		this.usuCodsit = usuCodsit;
	}

	@Column(name = "USU_MOTSIT")
	public Short getUsuMotsit() {
		return this.usuMotsit;
	}

	public void setUsuMotsit(Short usuMotsit) {
		this.usuMotsit = usuMotsit;
	}

	@Column(name = "USU_CODHOR")
	public Short getUsuCodhor() {
		return this.usuCodhor;
	}

	public void setUsuCodhor(Short usuCodhor) {
		this.usuCodhor = usuCodhor;
	}

	@Column(name = "USU_MOTSIT2")
	public Short getUsuMotsit2() {
		return this.usuMotsit2;
	}

	public void setUsuMotsit2(Short usuMotsit2) {
		this.usuMotsit2 = usuMotsit2;
	}

	@Column(name = "USU_SITREL", length = 2)
	@Length(max = 2)
	public String getUsuSitrel() {
		return this.usuSitrel;
	}

	public void setUsuSitrel(String usuSitrel) {
		this.usuSitrel = usuSitrel;
	}

	@Column(name = "USU_JN_USU", length = 30)
	@Length(max = 30)
	public String getUsuJnUsu() {
		return this.usuJnUsu;
	}

	public void setUsuJnUsu(String usuJnUsu) {
		this.usuJnUsu = usuJnUsu;
	}

	@Column(name = "USU_JN_OPER", length = 3)
	@Length(max = 3)
	public String getUsuJnOper() {
		return this.usuJnOper;
	}

	public void setUsuJnOper(String usuJnOper) {
		this.usuJnOper = usuJnOper;
	}

	@Column(name = "USU_JN_DATA", length = 29)
	public Date getUsuJnData() {
		return this.usuJnData;
	}

	public void setUsuJnData(Date usuJnData) {
		this.usuJnData = usuJnData;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUsuNumemp());
		umHashCodeBuilder.append(this.getUsuTipcol());
		umHashCodeBuilder.append(this.getUsuNumcad());
		umHashCodeBuilder.append(this.getUsuDatini());
		umHashCodeBuilder.append(this.getUsuCodhor());
		umHashCodeBuilder.append(this.getUsuJnUsu());
		umHashCodeBuilder.append(this.getUsuJnOper());
		umHashCodeBuilder.append(this.getUsuJnData());
		umHashCodeBuilder.append(this.getUsuCodsit());
		umHashCodeBuilder.append(this.getUsuSitrel());
		umHashCodeBuilder.append(this.getUsuTipcmp());
		umHashCodeBuilder.append(this.getUsuPercmp());
		umHashCodeBuilder.append(this.getUsuDatfim());
		umHashCodeBuilder.append(this.getUsuIniint());
		umHashCodeBuilder.append(this.getUsuFimint());
		umHashCodeBuilder.append(this.getUsuQtdhor());
		umHashCodeBuilder.append(this.getUsuMotsit());
		umHashCodeBuilder.append(this.getUsuMotsit2());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UsuTr064cmpId)) {
			return false;
		}
		UsuTr064cmpId other = (UsuTr064cmpId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUsuNumemp(), other.getUsuNumemp());
		umEqualsBuilder.append(this.getUsuTipcol(), other.getUsuTipcol());
		umEqualsBuilder.append(this.getUsuNumcad(), other.getUsuNumcad());
		umEqualsBuilder.append(this.getUsuDatini(), other.getUsuDatini());
		umEqualsBuilder.append(this.getUsuCodhor(), other.getUsuCodhor());
		umEqualsBuilder.append(this.getUsuJnUsu(), other.getUsuJnUsu());
		umEqualsBuilder.append(this.getUsuJnOper(), other.getUsuJnOper());
		umEqualsBuilder.append(this.getUsuJnData(), other.getUsuJnData());
		umEqualsBuilder.append(this.getUsuCodsit(), other.getUsuCodsit());
		umEqualsBuilder.append(this.getUsuSitrel(), other.getUsuSitrel());
		umEqualsBuilder.append(this.getUsuTipcmp(), other.getUsuTipcmp());
		umEqualsBuilder.append(this.getUsuPercmp(), other.getUsuPercmp());
		umEqualsBuilder.append(this.getUsuDatfim(), other.getUsuDatfim());
		umEqualsBuilder.append(this.getUsuIniint(), other.getUsuIniint());
		umEqualsBuilder.append(this.getUsuFimint(), other.getUsuFimint());
		umEqualsBuilder.append(this.getUsuQtdhor(), other.getUsuQtdhor());
		umEqualsBuilder.append(this.getUsuMotsit(), other.getUsuMotsit());
		umEqualsBuilder.append(this.getUsuMotsit2(), other.getUsuMotsit2());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}