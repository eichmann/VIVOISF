package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000141LandAreaUnitIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141LandAreaUnitIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141LandAreaUnitIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String landAreaUnit = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000141 ancestorInstance = (BFO_0000141) findAncestorWithClass(this, BFO_0000141.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#landAreaUnit> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				landAreaUnit = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000141Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BFO_0000141Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				landAreaUnit = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000141Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BFO_0000141Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000141 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000141 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setLandAreaUnit(String theLandAreaUnit) {
		landAreaUnit = theLandAreaUnit;
	}

	public String getLandAreaUnit() {
		return landAreaUnit;
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

}
