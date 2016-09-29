package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Event extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Event currentInstance = null;
	private static final Log log = LogFactory.getLog(Event.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EventIterator theEventIterator = (EventIterator) findAncestorWithClass(this, EventIterator.class);

			if (theEventIterator != null) {
				subjectURI = theEventIterator.getSubjectURI();
				label = theEventIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentPresentedAtIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentPresentedAtIterator)this.getParent()).getPresentedAt();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentPresentedAtIterator theDocumentPresentedAtIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentPresentedAtIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentPresentedAtIterator.class);

			if (subjectURI == null && theDocumentPresentedAtIterator != null) {
				subjectURI = theDocumentPresentedAtIterator.getPresentedAt();
			}

			if (theEventIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Event doStartTag", e);
			throw new JspTagException("Exception raised in Event doStartTag");
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
			log.error("Exception raised in Event doEndTag", e);
			throw new JspTagException("Exception raised in Event doEndTag");
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
