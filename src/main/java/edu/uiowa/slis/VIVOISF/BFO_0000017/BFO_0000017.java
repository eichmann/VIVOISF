package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000017 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000017Iterator theBFO_0000017Iterator = (BFO_0000017Iterator) findAncestorWithClass(this, BFO_0000017Iterator.class);

			if (theBFO_0000017Iterator != null) {
				subjectURI = theBFO_0000017Iterator.getSubjectURI();
				label = theBFO_0000017Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015BFO_0000055Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015BFO_0000055Iterator)this.getParent()).getBFO_0000055();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015BFO_0000055Iterator theBFO_0000015BFO_0000055Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015BFO_0000055Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015BFO_0000055Iterator.class);

			if (subjectURI == null && theBFO_0000015BFO_0000055Iterator != null) {
				subjectURI = theBFO_0000015BFO_0000055Iterator.getBFO_0000055();
			}

			if (theBFO_0000017Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in BFO_0000017 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000017 doStartTag");
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
			log.error("Exception raised in BFO_0000017 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000017 doEndTag");
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
