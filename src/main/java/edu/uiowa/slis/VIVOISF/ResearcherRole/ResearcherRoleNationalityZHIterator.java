package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityZHIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityZHIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityZHIterator.class);

	String subjectURI = null;
	String nationalityZH = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ResearcherRole ancestorInstance = (ResearcherRole) findAncestorWithClass(this, ResearcherRole.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nationalityZH> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityZH = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ResearcherRoleIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ResearcherRoleIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityZH = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ResearcherRoleIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ResearcherRoleIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ResearcherRole doEndTag", e);
			throw new JspTagException("Exception raised in ResearcherRole doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNationalityZH(String nationalityZH) {
		this.nationalityZH = nationalityZH;
	}

	public String getNationalityZH() {
		return nationalityZH;
	}

}