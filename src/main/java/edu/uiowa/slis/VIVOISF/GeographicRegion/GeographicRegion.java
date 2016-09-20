package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GeographicRegion extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegion currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegion.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeographicRegionIterator theGeographicRegionIterator = (GeographicRegionIterator) findAncestorWithClass(this, GeographicRegionIterator.class);

			if (theGeographicRegionIterator != null) {
				subjectURI = theGeographicRegionIterator.getSubjectURI();
				label = theGeographicRegionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator thePersonGeographicFocusIterator = (edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator.class);

			if (subjectURI == null && thePersonGeographicFocusIterator != null) {
				subjectURI = thePersonGeographicFocusIterator.getGeographicFocus();
			}

			if (theGeographicRegionIterator == null && subjectURI == null) {
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
			log.error("Exception raised in GeographicRegion doStartTag", e);
			throw new JspTagException("Exception raised in GeographicRegion doStartTag");
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
			log.error("Exception raised in GeographicRegion doEndTag", e);
			throw new JspTagException("Exception raised in GeographicRegion doEndTag");
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
