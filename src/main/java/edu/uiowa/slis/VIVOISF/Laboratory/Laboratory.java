package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Laboratory extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Laboratory currentInstance = null;
	private static final Log log = LogFactory.getLog(Laboratory.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String overview = null;
	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			LaboratoryIterator theLaboratoryIterator = (LaboratoryIterator) findAncestorWithClass(this, LaboratoryIterator.class);

			if (theLaboratoryIterator != null) {
				subjectURI = theLaboratoryIterator.getSubjectURI();
				label = theLaboratoryIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator)this.getParent()).getERO_0000398();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator theERO_0000007ERO_0000398Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator.class);

			if (subjectURI == null && theERO_0000007ERO_0000398Iterator != null) {
				subjectURI = theERO_0000007ERO_0000398Iterator.getERO_0000398();
			}

			if (theLaboratoryIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  ?overview ?abbreviation where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?abbreviation } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
					abbreviation = sol.get("?abbreviation") == null ? null : sol.get("?abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Laboratory doStartTag", e);
			throw new JspTagException("Exception raised in Laboratory doStartTag");
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
			log.error("Exception raised in Laboratory doEndTag", e);
			throw new JspTagException("Exception raised in Laboratory doEndTag");
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

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
