package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BookSectionDoiIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDoiIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDoiIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String doi = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BookSection ancestorInstance = (BookSection) findAncestorWithClass(this, BookSection.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/doi> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				doi = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in BookSectionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BookSectionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				doi = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in BookSectionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BookSectionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in BookSection doEndTag", e);
			throw new JspTagException("Exception raised in BookSection doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setDoi(String theDoi) {
		doi = theDoi;
	}

	public String getDoi() {
		return doi;
	}

	public static void setFirstInstance(Boolean theFirstInstance) {
		firstInstance = theFirstInstance;
	}

	public static Boolean getFirstInstance() {
		return firstInstance;
	}

	public static void setLastInstance(Boolean theLastInstance) {
		lastInstance = theLastInstance;
	}

	public static Boolean getLastInstance() {
		return lastInstance;
	}

}
