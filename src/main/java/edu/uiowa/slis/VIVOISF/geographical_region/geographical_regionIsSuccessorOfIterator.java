package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class geographical_regionIsSuccessorOfIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionIsSuccessorOfIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionIsSuccessorOfIterator.class);

	String subjectURI = null;
	String type = null;
	String isSuccessorOf = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			geographical_region thegeographical_region = (geographical_region) findAncestorWithClass(this, geographical_region.class);

			if (thegeographical_region != null) {
				subjectURI = thegeographical_region.getSubjectURI();
			}

			if (thegeographical_region == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#isSuccessorOf> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isSuccessorOf = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + isSuccessorOf + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in geographical_regionIsSuccessorOfIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in geographical_regionIsSuccessorOfIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isSuccessorOf = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + isSuccessorOf + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in geographical_regionIsSuccessorOfIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in geographical_regionIsSuccessorOfIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in geographical_regionIsSuccessorOf doEndTag", e);
			throw new JspTagException("Exception raised in geographical_regionIsSuccessorOf doEndTag");
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

	public void setIsSuccessorOf(String isSuccessorOf) {
		this.isSuccessorOf = isSuccessorOf;
	}

	public String getIsSuccessorOf() {
		return isSuccessorOf;
	}

}
