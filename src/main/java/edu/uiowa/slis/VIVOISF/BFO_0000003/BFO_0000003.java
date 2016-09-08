package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000003 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000003Iterator theBFO_0000003Iterator = (BFO_0000003Iterator) findAncestorWithClass(this, BFO_0000003Iterator.class);

			if (theBFO_0000003Iterator != null) {
				subjectURI = theBFO_0000003Iterator.getSubjectURI();
				label = theBFO_0000003Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0000056Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0000056Iterator)this.getParent()).getRO_0000056();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0000056Iterator theBFO_0000002RO_0000056Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0000056Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0000056Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0000056Iterator != null) {
				subjectURI = theBFO_0000002RO_0000056Iterator.getRO_0000056();
			}

			if (theBFO_0000003Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in BFO_0000003 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000003 doStartTag");
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
			log.error("Exception raised in BFO_0000003 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000003 doEndTag");
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
