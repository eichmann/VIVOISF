package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Seq extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Seq currentInstance = null;
	private static final Log log = LogFactory.getLog(Seq.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			SeqIterator theSeqIterator = (SeqIterator) findAncestorWithClass(this, SeqIterator.class);

			if (theSeqIterator != null) {
				subjectURI = theSeqIterator.getSubjectURI();
				label = theSeqIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator)this.getParent()).getEditorList();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator)this.getParent()).getAuthorList();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator)this.getParent()).getContributorList();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator theDocumentEditorListIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator.class);

			if (subjectURI == null && theDocumentEditorListIterator != null) {
				subjectURI = theDocumentEditorListIterator.getEditorList();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator theDocumentAuthorListIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator.class);

			if (subjectURI == null && theDocumentAuthorListIterator != null) {
				subjectURI = theDocumentAuthorListIterator.getAuthorList();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator theDocumentContributorListIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator.class);

			if (subjectURI == null && theDocumentContributorListIterator != null) {
				subjectURI = theDocumentContributorListIterator.getContributorList();
			}

			if (theSeqIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Seq doStartTag", e);
			throw new JspTagException("Exception raised in Seq doStartTag");
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
			log.error("Exception raised in Seq doEndTag", e);
			throw new JspTagException("Exception raised in Seq doEndTag");
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
