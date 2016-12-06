package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityFRIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityFRIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityFRIterator.class);

	String subjectURI = null;
	String nationalityFR = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			LibrarianPosition ancestorInstance = (LibrarianPosition) findAncestorWithClass(this, LibrarianPosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nationalityFR> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityFR = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in LibrarianPositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LibrarianPositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityFR = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in LibrarianPositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LibrarianPositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in LibrarianPosition doEndTag", e);
			throw new JspTagException("Exception raised in LibrarianPosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNationalityFR(String nationalityFR) {
		this.nationalityFR = nationalityFR;
	}

	public String getNationalityFR() {
		return nationalityFR;
	}

}
