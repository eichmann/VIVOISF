package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasMaxLongitudeIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasMaxLongitudeIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasMaxLongitudeIterator.class);

	String subjectURI = null;
	String hasMaxLongitude = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeopoliticalEntity ancestorInstance = (GeopoliticalEntity) findAncestorWithClass(this, GeopoliticalEntity.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#hasMaxLongitude> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasMaxLongitude = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in GeopoliticalEntityIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GeopoliticalEntityIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasMaxLongitude = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in GeopoliticalEntityIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GeopoliticalEntityIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GeopoliticalEntity doEndTag", e);
			throw new JspTagException("Exception raised in GeopoliticalEntity doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHasMaxLongitude(String hasMaxLongitude) {
		this.hasMaxLongitude = hasMaxLongitude;
	}

	public String getHasMaxLongitude() {
		return hasMaxLongitude;
	}

}
