package edu.uiowa.slis.VIVOISF.ERO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000007 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000007 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000007.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000007Iterator theERO_0000007Iterator = (ERO_0000007Iterator) findAncestorWithClass(this, ERO_0000007Iterator.class);

			if (theERO_0000007Iterator != null) {
				subjectURI = theERO_0000007Iterator.getSubjectURI();
				label = theERO_0000007Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.null.nullERO_0000397Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.null.nullERO_0000397Iterator)this.getParent()).getERO_0000397();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonERO_0000033Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonERO_0000033Iterator)this.getParent()).getERO_0000033();
			}

			edu.uiowa.slis.VIVOISF.null.nullERO_0000397Iterator thenullERO_0000397Iterator = (edu.uiowa.slis.VIVOISF.null.nullERO_0000397Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.null.nullERO_0000397Iterator.class);

			if (subjectURI == null && thenullERO_0000397Iterator != null) {
				subjectURI = thenullERO_0000397Iterator.getERO_0000397();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonERO_0000033Iterator thePersonERO_0000033Iterator = (edu.uiowa.slis.VIVOISF.Person.PersonERO_0000033Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonERO_0000033Iterator.class);

			if (subjectURI == null && thePersonERO_0000033Iterator != null) {
				subjectURI = thePersonERO_0000033Iterator.getERO_0000033();
			}

			if (theERO_0000007Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in ERO_0000007 doStartTag", e);
			throw new JspTagException("Exception raised in ERO_0000007 doStartTag");
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
			log.error("Exception raised in ERO_0000007 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000007 doEndTag");
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
