package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class special_groupHasNameIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasNameIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasNameIterator.class);

	String subjectURI = null;
	String type = null;
	String hasName = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			special_group thespecial_group = (special_group) findAncestorWithClass(this, special_group.class);

			if (thespecial_group != null) {
				subjectURI = thespecial_group.getSubjectURI();
			}

			if (thespecial_group == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://www.w3.org/2006/vcard/ns#hasName> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasName = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasName + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in special_groupHasNameIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in special_groupHasNameIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasName = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasName + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in special_groupHasNameIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in special_groupHasNameIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in special_groupHasName doEndTag", e);
			throw new JspTagException("Exception raised in special_groupHasName doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		hasName = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setHasName(String hasName) {
		this.hasName = hasName;
	}

	public String getHasName() {
		return hasName;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to special_groupHasNameIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
