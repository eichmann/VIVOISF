package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class ResearchOrganizationOwnerInverseIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationOwnerInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationOwnerInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String ownerInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization) findAncestorWithClass(this, ResearchOrganization.class);

			if (theResearchOrganization != null) {
				subjectURI = theResearchOrganization.getSubjectURI();
			}

			if (theResearchOrganization == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://purl.org/ontology/bibo/owner> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ownerInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + ownerInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ResearchOrganizationOwnerInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ResearchOrganizationOwnerInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ownerInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + ownerInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ResearchOrganizationOwnerIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ResearchOrganizationOwnerIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ResearchOrganizationOwner doEndTag", e);
			throw new JspTagException("Exception raised in ResearchOrganizationOwner doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		ownerInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setOwnerInverse(String ownerInverse) {
		this.ownerInverse = ownerInverse;
	}

	public String getOwnerInverse() {
		return ownerInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to ResearchOrganizationOwnerIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
