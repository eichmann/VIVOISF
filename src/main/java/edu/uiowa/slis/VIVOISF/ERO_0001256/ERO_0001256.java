package edu.uiowa.slis.VIVOISF.ERO_0001256;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0001256 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001256 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001256.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0001256Iterator theERO_0001256Iterator = (ERO_0001256Iterator) findAncestorWithClass(this, ERO_0001256Iterator.class);

			if (theERO_0001256Iterator != null) {
				subjectURI = theERO_0001256Iterator.getSubjectURI();
				label = theERO_0001256Iterator.getLabel();
			}

			if (theERO_0001256Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001256 doStartTag", e);
			throw new JspTagException("Exception raised in ERO_0001256 doStartTag");
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
			log.error("Exception raised in ERO_0001256 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0001256 doEndTag");
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
