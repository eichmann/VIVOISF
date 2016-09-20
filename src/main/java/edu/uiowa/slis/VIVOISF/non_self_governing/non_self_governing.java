package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class non_self_governing extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governing currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governing.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			non_self_governingIterator thenon_self_governingIterator = (non_self_governingIterator) findAncestorWithClass(this, non_self_governingIterator.class);

			if (thenon_self_governingIterator != null) {
				subjectURI = thenon_self_governingIterator.getSubjectURI();
				label = thenon_self_governingIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.self_governing.self_governingIsAdministeredByInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.self_governing.self_governingIsAdministeredByInverseIterator)this.getParent()).getIsAdministeredByInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryIsAdministeredByInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryIsAdministeredByInverseIterator)this.getParent()).getIsAdministeredByInverse();
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

			if (thenon_self_governingIterator == null && subjectURI == null) {
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
			log.error("Exception raised in non_self_governing doStartTag", e);
			throw new JspTagException("Exception raised in non_self_governing doStartTag");
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
			log.error("Exception raised in non_self_governing doEndTag", e);
			throw new JspTagException("Exception raised in non_self_governing doEndTag");
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
