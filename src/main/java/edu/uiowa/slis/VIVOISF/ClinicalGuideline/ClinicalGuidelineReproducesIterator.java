package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ClinicalGuidelineReproducesIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineReproducesIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineReproducesIterator.class);

	String subjectURI = null;
	String type = null;
	String reproduces = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline) findAncestorWithClass(this, ClinicalGuideline.class);

			if (theClinicalGuideline != null) {
				subjectURI = theClinicalGuideline.getSubjectURI();
			}

			if (theClinicalGuideline == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#reproduces> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				reproduces = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + reproduces + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ClinicalGuidelineReproducesIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ClinicalGuidelineReproducesIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				reproduces = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + reproduces + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ClinicalGuidelineReproducesIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ClinicalGuidelineReproducesIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ClinicalGuidelineReproduces doEndTag", e);
			throw new JspTagException("Exception raised in ClinicalGuidelineReproduces doEndTag");
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

	public void setReproduces(String reproduces) {
		this.reproduces = reproduces;
	}

	public String getReproduces() {
		return reproduces;
	}

}
