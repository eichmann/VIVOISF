package edu.uiowa.slis.VIVOISF.ERO_0000014;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000014 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000014 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000014.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000014Iterator theERO_0000014Iterator = (ERO_0000014Iterator) findAncestorWithClass(this, ERO_0000014Iterator.class);

			if (theERO_0000014Iterator != null) {
				subjectURI = theERO_0000014Iterator.getSubjectURI();
				label = theERO_0000014Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator)this.getParent()).getDocumentationFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000918Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000918Iterator)this.getParent()).getERO_0000918();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ProtocolRealizedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ProtocolRealizedByIterator)this.getParent()).getProtocolRealizedBy();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator theDocumentDocumentationForIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator.class);

			if (subjectURI == null && theDocumentDocumentationForIterator != null) {
				subjectURI = theDocumentDocumentationForIterator.getDocumentationFor();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000918Iterator theERO_0000020ERO_0000918Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000918Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000918Iterator.class);

			if (subjectURI == null && theERO_0000020ERO_0000918Iterator != null) {
				subjectURI = theERO_0000020ERO_0000918Iterator.getERO_0000918();
			}

			edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ProtocolRealizedByIterator theOBI_0000272ProtocolRealizedByIterator = (edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ProtocolRealizedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ProtocolRealizedByIterator.class);

			if (subjectURI == null && theOBI_0000272ProtocolRealizedByIterator != null) {
				subjectURI = theOBI_0000272ProtocolRealizedByIterator.getProtocolRealizedBy();
			}

			if (theERO_0000014Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in ERO_0000014 doStartTag", e);
			throw new JspTagException("Exception raised in ERO_0000014 doStartTag");
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
			log.error("Exception raised in ERO_0000014 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000014 doEndTag");
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
