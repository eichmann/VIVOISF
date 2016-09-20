package edu.uiowa.slis.VIVOISF.BFO_0000019;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000019 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000019 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000019.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000019Iterator theBFO_0000019Iterator = (BFO_0000019Iterator) findAncestorWithClass(this, BFO_0000019Iterator.class);

			if (theBFO_0000019Iterator != null) {
				subjectURI = theBFO_0000019Iterator.getSubjectURI();
				label = theBFO_0000019Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000109.IAO_0000109IAO_0000221Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000109.IAO_0000109IAO_0000221Iterator)this.getParent()).getIAO_0000221();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000109.IAO_0000109IAO_0000221Iterator theIAO_0000109IAO_0000221Iterator = (edu.uiowa.slis.VIVOISF.IAO_0000109.IAO_0000109IAO_0000221Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000109.IAO_0000109IAO_0000221Iterator.class);

			if (subjectURI == null && theIAO_0000109IAO_0000221Iterator != null) {
				subjectURI = theIAO_0000109IAO_0000221Iterator.getIAO_0000221();
			}

			if (theBFO_0000019Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in BFO_0000019 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000019 doStartTag");
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
			log.error("Exception raised in BFO_0000019 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000019 doEndTag");
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
