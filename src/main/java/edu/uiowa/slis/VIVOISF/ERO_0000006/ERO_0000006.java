package edu.uiowa.slis.VIVOISF.ERO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000006 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000006 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000006.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000006Iterator theERO_0000006Iterator = (ERO_0000006Iterator) findAncestorWithClass(this, ERO_0000006Iterator.class);

			if (theERO_0000006Iterator != null) {
				subjectURI = theERO_0000006Iterator.getSubjectURI();
				label = theERO_0000006Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000029Iterator)this.getParent()).getERO_0000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator)this.getParent()).getDocumentationFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000038Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000038Iterator)this.getParent()).getERO_0000038();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OBI_0000835.OBI_0000835ERO_0000034InverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OBI_0000835.OBI_0000835ERO_0000034InverseIterator)this.getParent()).getERO_0000034Inverse();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000029Iterator theERO_0000005ERO_0000029Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000029Iterator.class);

			if (subjectURI == null && theERO_0000005ERO_0000029Iterator != null) {
				subjectURI = theERO_0000005ERO_0000029Iterator.getERO_0000029();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator theDocumentDocumentationForIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentDocumentationForIterator.class);

			if (subjectURI == null && theDocumentDocumentationForIterator != null) {
				subjectURI = theDocumentDocumentationForIterator.getDocumentationFor();
			}

			edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000038Iterator theOBI_0000272ERO_0000038Iterator = (edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000038Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000038Iterator.class);

			if (subjectURI == null && theOBI_0000272ERO_0000038Iterator != null) {
				subjectURI = theOBI_0000272ERO_0000038Iterator.getERO_0000038();
			}

			if (theERO_0000006Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in ERO_0000006 doStartTag", e);
			throw new JspTagException("Exception raised in ERO_0000006 doStartTag");
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
			log.error("Exception raised in ERO_0000006 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000006 doEndTag");
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
