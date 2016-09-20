package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class StateOrProvince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvince currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvince.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			StateOrProvinceIterator theStateOrProvinceIterator = (StateOrProvinceIterator) findAncestorWithClass(this, StateOrProvinceIterator.class);

			if (theStateOrProvinceIterator != null) {
				subjectURI = theStateOrProvinceIterator.getSubjectURI();
				label = theStateOrProvinceIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.self_governing.self_governingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.self_governing.self_governingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.self_governing.self_governingBFO_0000051Iterator theself_governingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.self_governing.self_governingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.self_governing.self_governingBFO_0000051Iterator.class);

			if (subjectURI == null && theself_governingBFO_0000051Iterator != null) {
				subjectURI = theself_governingBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator theCountryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator.class);

			if (subjectURI == null && theCountryBFO_0000051Iterator != null) {
				subjectURI = theCountryBFO_0000051Iterator.getBFO_0000051();
			}

			if (theStateOrProvinceIterator == null && subjectURI == null) {
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
			log.error("Exception raised in StateOrProvince doStartTag", e);
			throw new JspTagException("Exception raised in StateOrProvince doStartTag");
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
			log.error("Exception raised in StateOrProvince doEndTag", e);
			throw new JspTagException("Exception raised in StateOrProvince doEndTag");
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
