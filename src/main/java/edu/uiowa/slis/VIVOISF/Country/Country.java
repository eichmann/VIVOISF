package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Country extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Country currentInstance = null;
	private static final Log log = LogFactory.getLog(Country.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CountryIterator theCountryIterator = (CountryIterator) findAncestorWithClass(this, CountryIterator.class);

			if (theCountryIterator != null) {
				subjectURI = theCountryIterator.getSubjectURI();
				label = theCountryIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingIsAdministeredByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingIsAdministeredByIterator)this.getParent()).getIsAdministeredBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.self_governing.self_governingHasBorderWithIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.self_governing.self_governingHasBorderWithIterator)this.getParent()).getHasBorderWith();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryHasBorderWithIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryHasBorderWithIterator)this.getParent()).getHasBorderWith();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingHasBorderWithIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingHasBorderWithIterator)this.getParent()).getHasBorderWith();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingIsAdministeredByIterator thenon_self_governingIsAdministeredByIterator = (edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingIsAdministeredByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingIsAdministeredByIterator.class);

			if (subjectURI == null && thenon_self_governingIsAdministeredByIterator != null) {
				subjectURI = thenon_self_governingIsAdministeredByIterator.getIsAdministeredBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator thePersonRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator.class);

			if (subjectURI == null && thePersonRO_0001025Iterator != null) {
				subjectURI = thePersonRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.self_governing.self_governingHasBorderWithIterator theself_governingHasBorderWithIterator = (edu.uiowa.slis.VIVOISF.self_governing.self_governingHasBorderWithIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.self_governing.self_governingHasBorderWithIterator.class);

			if (subjectURI == null && theself_governingHasBorderWithIterator != null) {
				subjectURI = theself_governingHasBorderWithIterator.getHasBorderWith();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryHasBorderWithIterator theCountryHasBorderWithIterator = (edu.uiowa.slis.VIVOISF.Country.CountryHasBorderWithIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryHasBorderWithIterator.class);

			if (subjectURI == null && theCountryHasBorderWithIterator != null) {
				subjectURI = theCountryHasBorderWithIterator.getHasBorderWith();
			}

			edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingHasBorderWithIterator thenon_self_governingHasBorderWithIterator = (edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingHasBorderWithIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.non_self_governing.non_self_governingHasBorderWithIterator.class);

			if (subjectURI == null && thenon_self_governingHasBorderWithIterator != null) {
				subjectURI = thenon_self_governingHasBorderWithIterator.getHasBorderWith();
			}

			edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator theStateOrProvinceBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator.class);

			if (subjectURI == null && theStateOrProvinceBFO_0000050Iterator != null) {
				subjectURI = theStateOrProvinceBFO_0000050Iterator.getBFO_0000050();
			}

			if (theCountryIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Country doStartTag", e);
			throw new JspTagException("Exception raised in Country doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Country doEndTag", e);
			throw new JspTagException("Exception raised in Country doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
