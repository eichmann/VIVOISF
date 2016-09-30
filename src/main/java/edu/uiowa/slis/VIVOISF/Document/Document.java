package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Document extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Document currentInstance = null;
	private static final Log log = LogFactory.getLog(Document.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DocumentIterator theDocumentIterator = (DocumentIterator) findAncestorWithClass(this, DocumentIterator.class);

			if (theDocumentIterator != null) {
				subjectURI = theDocumentIterator.getSubjectURI();
				label = theDocumentIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentCitedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentCitedByIterator)this.getParent()).getCitedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentTranslationOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentTranslationOfIterator)this.getParent()).getTranslationOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentReproducesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentReproducesIterator)this.getParent()).getReproduces();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentReproducedInIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentReproducedInIterator)this.getParent()).getReproducedIn();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentTranslatorOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentTranslatorOfIterator)this.getParent()).getTranslatorOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000460Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000460Iterator)this.getParent()).getERO_0000460();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentHasTranslationIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentHasTranslationIterator)this.getParent()).getHasTranslation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentCitesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentCitesIterator)this.getParent()).getCites();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentStatus.DocumentStatusStatusInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentStatus.DocumentStatusStatusInverseIterator)this.getParent()).getStatusInverse();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentCitedByIterator theDocumentCitedByIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentCitedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentCitedByIterator.class);

			if (subjectURI == null && theDocumentCitedByIterator != null) {
				subjectURI = theDocumentCitedByIterator.getCitedBy();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentTranslationOfIterator theDocumentTranslationOfIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentTranslationOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentTranslationOfIterator.class);

			if (subjectURI == null && theDocumentTranslationOfIterator != null) {
				subjectURI = theDocumentTranslationOfIterator.getTranslationOf();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentReproducesIterator theDocumentReproducesIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentReproducesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentReproducesIterator.class);

			if (subjectURI == null && theDocumentReproducesIterator != null) {
				subjectURI = theDocumentReproducesIterator.getReproduces();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentReproducedInIterator theDocumentReproducedInIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentReproducedInIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentReproducedInIterator.class);

			if (subjectURI == null && theDocumentReproducedInIterator != null) {
				subjectURI = theDocumentReproducedInIterator.getReproducedIn();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentTranslatorOfIterator theAgentTranslatorOfIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentTranslatorOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentTranslatorOfIterator.class);

			if (subjectURI == null && theAgentTranslatorOfIterator != null) {
				subjectURI = theAgentTranslatorOfIterator.getTranslatorOf();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000460Iterator theERO_0000004ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0000004ERO_0000460Iterator != null) {
				subjectURI = theERO_0000004ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000460Iterator theERO_0000005ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0000005ERO_0000460Iterator != null) {
				subjectURI = theERO_0000005ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000460Iterator theERO_0000006ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0000006ERO_0000460Iterator != null) {
				subjectURI = theERO_0000006ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000460Iterator theERO_0000014ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0000014ERO_0000460Iterator != null) {
				subjectURI = theERO_0000014ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000460Iterator theERO_0000020ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000020.ERO_0000020ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0000020ERO_0000460Iterator != null) {
				subjectURI = theERO_0000020ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000460Iterator theERO_0000071ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0000071ERO_0000460Iterator != null) {
				subjectURI = theERO_0000071ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000460Iterator theERO_0001716ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000460Iterator.class);

			if (subjectURI == null && theERO_0001716ERO_0000460Iterator != null) {
				subjectURI = theERO_0001716ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000460Iterator theOBI_0000272ERO_0000460Iterator = (edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000460Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000460Iterator.class);

			if (subjectURI == null && theOBI_0000272ERO_0000460Iterator != null) {
				subjectURI = theOBI_0000272ERO_0000460Iterator.getERO_0000460();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentHasTranslationIterator theDocumentHasTranslationIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentHasTranslationIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentHasTranslationIterator.class);

			if (subjectURI == null && theDocumentHasTranslationIterator != null) {
				subjectURI = theDocumentHasTranslationIterator.getHasTranslation();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentCitesIterator theDocumentCitesIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentCitesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentCitesIterator.class);

			if (subjectURI == null && theDocumentCitesIterator != null) {
				subjectURI = theDocumentCitesIterator.getCites();
			}

			if (theDocumentIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Document doStartTag", e);
			throw new JspTagException("Exception raised in Document doStartTag");
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
			log.error("Exception raised in Document doEndTag", e);
			throw new JspTagException("Exception raised in Document doEndTag");
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
