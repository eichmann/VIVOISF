package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class MagazineNumVolumesIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineNumVolumesIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineNumVolumesIterator.class);

	String subjectURI = null;
	String numVolumes = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Magazine ancestorInstance = (Magazine) findAncestorWithClass(this, Magazine.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/numVolumes> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				numVolumes = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in MagazineIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in MagazineIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				numVolumes = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in MagazineIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in MagazineIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Magazine doEndTag", e);
			throw new JspTagException("Exception raised in Magazine doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNumVolumes(String numVolumes) {
		this.numVolumes = numVolumes;
	}

	public String getNumVolumes() {
		return numVolumes;
	}

}