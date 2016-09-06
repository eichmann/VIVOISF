package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Authorship extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Authorship currentInstance = null;
	private static final Log log = LogFactory.getLog(Authorship.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String isCorrespondingAuthor = null;
	String hideFromDisplay = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AuthorshipIterator theAuthorshipIterator = (AuthorshipIterator) findAncestorWithClass(this, AuthorshipIterator.class);

			if (theAuthorshipIterator != null) {
				subjectURI = theAuthorshipIterator.getSubjectURI();
				label = theAuthorshipIterator.getLabel();
			}

			if (theAuthorshipIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?isCorrespondingAuthor ?hideFromDisplay where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#isCorrespondingAuthor> ?isCorrespondingAuthor } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#hideFromDisplay> ?hideFromDisplay } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").toString();
					isCorrespondingAuthor = sol.get("?isCorrespondingAuthor") == null ? null : sol.get("?isCorrespondingAuthor").toString();
					hideFromDisplay = sol.get("?hideFromDisplay") == null ? null : sol.get("?hideFromDisplay").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Authorship doStartTag", e);
			throw new JspTagException("Exception raised in Authorship doStartTag");
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
			log.error("Exception raised in Authorship doEndTag", e);
			throw new JspTagException("Exception raised in Authorship doEndTag");
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

	public void setIsCorrespondingAuthor(String isCorrespondingAuthor) {
		this.isCorrespondingAuthor = isCorrespondingAuthor;
	}

	public String getIsCorrespondingAuthor() {
		return isCorrespondingAuthor;
	}

	public void setHideFromDisplay(String hideFromDisplay) {
		this.hideFromDisplay = hideFromDisplay;
	}

	public String getHideFromDisplay() {
		return hideFromDisplay;
	}

}
