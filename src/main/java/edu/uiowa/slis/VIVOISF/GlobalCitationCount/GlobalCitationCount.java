package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GlobalCitationCount extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCount currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCount.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GlobalCitationCountIterator theGlobalCitationCountIterator = (GlobalCitationCountIterator) findAncestorWithClass(this, GlobalCitationCountIterator.class);

			if (theGlobalCitationCountIterator != null) {
				subjectURI = theGlobalCitationCountIterator.getSubjectURI();
				label = theGlobalCitationCountIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BibliographicInformationSource.BibliographicInformationSourceHasGlobalCountSourceInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BibliographicInformationSource.BibliographicInformationSourceHasGlobalCountSourceInverseIterator)this.getParent()).getHasGlobalCountSourceInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueHasGlobalCountDateInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueHasGlobalCountDateInverseIterator)this.getParent()).getHasGlobalCountDateInverse();
			}

			if (theGlobalCitationCountIterator == null && subjectURI == null) {
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
			log.error("Exception raised in GlobalCitationCount doStartTag", e);
			throw new JspTagException("Exception raised in GlobalCitationCount doStartTag");
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
			log.error("Exception raised in GlobalCitationCount doEndTag", e);
			throw new JspTagException("Exception raised in GlobalCitationCount doEndTag");
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
