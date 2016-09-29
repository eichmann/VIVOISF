package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCitationFrequencyInverseIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCitationFrequencyInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCitationFrequencyInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String hasGlobalCitationFrequencyInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount) findAncestorWithClass(this, GlobalCitationCount.class);

			if (theGlobalCitationCount != null) {
				subjectURI = theGlobalCitationCount.getSubjectURI();
			}

			if (theGlobalCitationCount == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://purl.org/spar/c4o/hasGlobalCitationFrequency> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGlobalCitationFrequencyInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasGlobalCitationFrequencyInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountHasGlobalCitationFrequencyInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GlobalCitationCountHasGlobalCitationFrequencyInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGlobalCitationFrequencyInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasGlobalCitationFrequencyInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountHasGlobalCitationFrequencyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GlobalCitationCountHasGlobalCitationFrequencyIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountHasGlobalCitationFrequency doEndTag", e);
			throw new JspTagException("Exception raised in GlobalCitationCountHasGlobalCitationFrequency doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		hasGlobalCitationFrequencyInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setHasGlobalCitationFrequencyInverse(String hasGlobalCitationFrequencyInverse) {
		this.hasGlobalCitationFrequencyInverse = hasGlobalCitationFrequencyInverse;
	}

	public String getHasGlobalCitationFrequencyInverse() {
		return hasGlobalCitationFrequencyInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to GlobalCitationCountHasGlobalCitationFrequencyIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
