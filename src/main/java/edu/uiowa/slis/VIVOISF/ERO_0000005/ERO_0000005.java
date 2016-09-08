package edu.uiowa.slis.VIVOISF.ERO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000005 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000005 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000005.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000005Iterator theERO_0000005Iterator = (ERO_0000005Iterator) findAncestorWithClass(this, ERO_0000005Iterator.class);

			if (theERO_0000005Iterator != null) {
				subjectURI = theERO_0000005Iterator.getSubjectURI();
				label = theERO_0000005Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.null.nullERO_0000037Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.null.nullERO_0000037Iterator)this.getParent()).getERO_0000037();
			}

			edu.uiowa.slis.VIVOISF.null.nullERO_0000037Iterator thenullERO_0000037Iterator = (edu.uiowa.slis.VIVOISF.null.nullERO_0000037Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.null.nullERO_0000037Iterator.class);

			if (subjectURI == null && thenullERO_0000037Iterator != null) {
				subjectURI = thenullERO_0000037Iterator.getERO_0000037();
			}

			if (theERO_0000005Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in ERO_0000005 doStartTag", e);
			throw new JspTagException("Exception raised in ERO_0000005 doStartTag");
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
			log.error("Exception raised in ERO_0000005 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000005 doEndTag");
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
