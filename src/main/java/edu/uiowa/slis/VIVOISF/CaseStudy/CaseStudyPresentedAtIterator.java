package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CaseStudyPresentedAtIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPresentedAtIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPresentedAtIterator.class);

	String subjectURI = null;
	String type = null;
	String presentedAt = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CaseStudy theCaseStudy = (CaseStudy) findAncestorWithClass(this, CaseStudy.class);

			if (theCaseStudy != null) {
				subjectURI = theCaseStudy.getSubjectURI();
			}

			if (theCaseStudy == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.org/ontology/bibo/presentedAt> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				presentedAt = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + presentedAt + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CaseStudyPresentedAtIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CaseStudyPresentedAtIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				presentedAt = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + presentedAt + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CaseStudyPresentedAtIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CaseStudyPresentedAtIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in CaseStudyPresentedAt doEndTag", e);
			throw new JspTagException("Exception raised in CaseStudyPresentedAt doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setPresentedAt(String presentedAt) {
		this.presentedAt = presentedAt;
	}

	public String getPresentedAt() {
		return presentedAt;
	}

}
