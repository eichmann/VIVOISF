package edu.uiowa.slis.VIVOISF.OCRE100038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OCRE100038 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OCRE100038 currentInstance = null;
	private static final Log log = LogFactory.getLog(OCRE100038.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OCRE100038Iterator theOCRE100038Iterator = (OCRE100038Iterator) findAncestorWithClass(this, OCRE100038Iterator.class);

			if (theOCRE100038Iterator != null) {
				subjectURI = theOCRE100038Iterator.getSubjectURI();
				label = theOCRE100038Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000016.ERO_0000016ERO_0001518Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000016.ERO_0000016ERO_0001518Iterator)this.getParent()).getERO_0001518();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000016.ERO_0000016ERO_0001518Iterator theERO_0000016ERO_0001518Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000016.ERO_0000016ERO_0001518Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000016.ERO_0000016ERO_0001518Iterator.class);

			if (subjectURI == null && theERO_0000016ERO_0001518Iterator != null) {
				subjectURI = theERO_0000016ERO_0001518Iterator.getERO_0001518();
			}

			if (theOCRE100038Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OCRE100038 doStartTag", e);
			throw new JspTagException("Exception raised in OCRE100038 doStartTag");
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
			log.error("Exception raised in OCRE100038 doEndTag", e);
			throw new JspTagException("Exception raised in OCRE100038 doEndTag");
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
