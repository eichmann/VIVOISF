package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CompanyAgriculturalAreaNotesIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAgriculturalAreaNotesIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAgriculturalAreaNotesIterator.class);

	String subjectURI = null;
	String agriculturalAreaNotes = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Company ancestorInstance = (Company) findAncestorWithClass(this, Company.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#agriculturalAreaNotes> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				agriculturalAreaNotes = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CompanyIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CompanyIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				agriculturalAreaNotes = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CompanyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CompanyIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Company doEndTag", e);
			throw new JspTagException("Exception raised in Company doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setAgriculturalAreaNotes(String agriculturalAreaNotes) {
		this.agriculturalAreaNotes = agriculturalAreaNotes;
	}

	public String getAgriculturalAreaNotes() {
		return agriculturalAreaNotes;
	}

}
