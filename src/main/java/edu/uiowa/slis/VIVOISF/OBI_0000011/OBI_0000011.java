package edu.uiowa.slis.VIVOISF.OBI_0000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OBI_0000011 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000011 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000011.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OBI_0000011Iterator theOBI_0000011Iterator = (OBI_0000011Iterator) findAncestorWithClass(this, OBI_0000011Iterator.class);

			if (theOBI_0000011Iterator != null) {
				subjectURI = theOBI_0000011Iterator.getSubjectURI();
				label = theOBI_0000011Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000005.IAO_0000005OBI_0000833Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000005.IAO_0000005OBI_0000833Iterator)this.getParent()).getOBI_0000833();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000005.IAO_0000005OBI_0000833Iterator theIAO_0000005OBI_0000833Iterator = (edu.uiowa.slis.VIVOISF.IAO_0000005.IAO_0000005OBI_0000833Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000005.IAO_0000005OBI_0000833Iterator.class);

			if (subjectURI == null && theIAO_0000005OBI_0000833Iterator != null) {
				subjectURI = theIAO_0000005OBI_0000833Iterator.getOBI_0000833();
			}

			if (theOBI_0000011Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000011 doStartTag", e);
			throw new JspTagException("Exception raised in OBI_0000011 doStartTag");
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
			log.error("Exception raised in OBI_0000011 doEndTag", e);
			throw new JspTagException("Exception raised in OBI_0000011 doEndTag");
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
