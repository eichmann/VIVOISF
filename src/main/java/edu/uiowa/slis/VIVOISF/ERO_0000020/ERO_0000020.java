package edu.uiowa.slis.VIVOISF.ERO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000020 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000020 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000020.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000020Iterator theERO_0000020Iterator = (ERO_0000020Iterator) findAncestorWithClass(this, ERO_0000020Iterator.class);

			if (theERO_0000020Iterator != null) {
				subjectURI = theERO_0000020Iterator.getSubjectURI();
				label = theERO_0000020Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000919Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000919Iterator)this.getParent()).getERO_0000919();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000919Iterator theERO_0000014ERO_0000919Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000919Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000919Iterator.class);

			if (subjectURI == null && theERO_0000014ERO_0000919Iterator != null) {
				subjectURI = theERO_0000014ERO_0000919Iterator.getERO_0000919();
			}

			if (theERO_0000020Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000020 doStartTag", e);
			throw new JspTagException("Exception raised in ERO_0000020 doStartTag");
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
			log.error("Exception raised in ERO_0000020 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000020 doEndTag");
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
