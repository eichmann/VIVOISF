package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class OrganizationUnitNameHasOrganizationalUnitNameInverseIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameHasOrganizationalUnitNameInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameHasOrganizationalUnitNameInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String hasOrganizationalUnitNameInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName) findAncestorWithClass(this, OrganizationUnitName.class);

			if (theOrganizationUnitName != null) {
				subjectURI = theOrganizationUnitName.getSubjectURI();
			}

			if (theOrganizationUnitName == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://www.w3.org/2006/vcard/ns#hasOrganizationalUnitName> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasOrganizationalUnitNameInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasOrganizationalUnitNameInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OrganizationUnitNameHasOrganizationalUnitNameInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OrganizationUnitNameHasOrganizationalUnitNameInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasOrganizationalUnitNameInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasOrganizationalUnitNameInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OrganizationUnitNameHasOrganizationalUnitNameIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OrganizationUnitNameHasOrganizationalUnitNameIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in OrganizationUnitNameHasOrganizationalUnitName doEndTag", e);
			throw new JspTagException("Exception raised in OrganizationUnitNameHasOrganizationalUnitName doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		hasOrganizationalUnitNameInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setHasOrganizationalUnitNameInverse(String hasOrganizationalUnitNameInverse) {
		this.hasOrganizationalUnitNameInverse = hasOrganizationalUnitNameInverse;
	}

	public String getHasOrganizationalUnitNameInverse() {
		return hasOrganizationalUnitNameInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to OrganizationUnitNameHasOrganizationalUnitNameIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
