package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class StudentOrganizationSponsorsIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationSponsorsIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationSponsorsIterator.class);

	String subjectURI = null;
	String type = null;
	String sponsors = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization) findAncestorWithClass(this, StudentOrganization.class);

			if (theStudentOrganization != null) {
				subjectURI = theStudentOrganization.getSubjectURI();
			}

			if (theStudentOrganization == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#sponsors> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				sponsors = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + sponsors + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in StudentOrganizationSponsorsIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in StudentOrganizationSponsorsIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				sponsors = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + sponsors + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in StudentOrganizationSponsorsIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in StudentOrganizationSponsorsIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in StudentOrganizationSponsors doEndTag", e);
			throw new JspTagException("Exception raised in StudentOrganizationSponsors doEndTag");
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

	public void setSponsors(String sponsors) {
		this.sponsors = sponsors;
	}

	public String getSponsors() {
		return sponsors;
	}

}
