package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class BFO_0000002RO_0001025Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002RO_0001025Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002RO_0001025Iterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String type = null;
	String RO_0001025 = null;
	ResultSet rs = null;
	String sortCriteria = null;
	int limitCriteria = 0;
	int offsetCriteria = 0;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000002 theBFO_0000002 = (BFO_0000002) findAncestorWithClass(this, BFO_0000002.class);

			if (theBFO_0000002 != null) {
				subjectURI = theBFO_0000002.getSubjectURI();
			}

			if (theBFO_0000002 == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.obolibrary.org/obo/RO_0001025> ?s . "
					+" OPTIONAL { ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t } ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" } " +
					" } " +
					(limitCriteria == 0 ? "" : " LIMIT " + limitCriteria + " ") +
					(offsetCriteria == 0 ? "" : " OFFSET " + offsetCriteria + " ")
					);
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				RO_0001025 = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				type = sol.get("?t") == null ? null : getLocalName(sol.get("?t").toString());
//				if (type == null)
//					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + RO_0001025 + "	type: " + type);
					firstInstance = true;
					lastInstance = ! rs.hasNext();
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000002RO_0001025Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BFO_0000002RO_0001025Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				RO_0001025 = sol.get("?s").toString();
				type = sol.get("?t") == null ? null : getLocalName(sol.get("?t").toString());
//				if (type == null)
//					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + RO_0001025 + "	type: " + type);
					firstInstance = false;
					lastInstance = ! rs.hasNext();
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000002RO_0001025Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BFO_0000002RO_0001025Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000002RO_0001025 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000002RO_0001025 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		RO_0001025 = null;
		classFilter = null;
	}

	public void setSortCriteria(String theSortCriteria) {
		sortCriteria = theSortCriteria;
	}

	public String getSortCriteria() {
		return sortCriteria;
	}

	public void setLimitCriteria(Integer theLimitCriteria) {
		limitCriteria = theLimitCriteria;
	}

	public Integer getLimitCriteria() {
		return limitCriteria;
	}

	public void setOffsetCriteria(Integer theOffsetCriteria) {
		offsetCriteria = theOffsetCriteria;
	}

	public Integer getOffsetCriteria() {
		return offsetCriteria;
	}

	public void setType(String theType) {
		type = theType;
	}

	public String getType() {
		return type;
	}

	public void setRO_0001025(String theRO_0001025) {
		RO_0001025 = theRO_0001025;
	}

	public String getRO_0001025() {
		return RO_0001025;
	}

	public static void setFirstInstance(Boolean theFirstInstance) {
		firstInstance = theFirstInstance;
	}

	public static Boolean getFirstInstance() {
		return firstInstance;
	}

	public static void setLastInstance(Boolean theLastInstance) {
		lastInstance = theLastInstance;
	}

	public static Boolean getLastInstance() {
		return lastInstance;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to BFO_0000002RO_0001025Iterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
