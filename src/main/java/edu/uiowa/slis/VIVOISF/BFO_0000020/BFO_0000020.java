package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000020 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000020Iterator theBFO_0000020Iterator = (BFO_0000020Iterator) findAncestorWithClass(this, BFO_0000020Iterator.class);

			if (theBFO_0000020Iterator != null) {
				subjectURI = theBFO_0000020Iterator.getSubjectURI();
				label = theBFO_0000020Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator)this.getParent()).getRO_0000053();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator theBFO_0000004RO_0000053Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator.class);

			if (subjectURI == null && theBFO_0000004RO_0000053Iterator != null) {
				subjectURI = theBFO_0000004RO_0000053Iterator.getRO_0000053();
			}

			if (theBFO_0000020Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in BFO_0000020 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000020 doStartTag");
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
			log.error("Exception raised in BFO_0000020 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000020 doEndTag");
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
