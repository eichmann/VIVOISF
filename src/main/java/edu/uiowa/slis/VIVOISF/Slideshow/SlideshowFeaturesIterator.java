package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class SlideshowFeaturesIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowFeaturesIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowFeaturesIterator.class);

	String subjectURI = null;
	String type = null;
	String features = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Slideshow theSlideshow = (Slideshow) findAncestorWithClass(this, Slideshow.class);

			if (theSlideshow != null) {
				subjectURI = theSlideshow.getSubjectURI();
			}

			if (theSlideshow == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#features> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				features = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + features + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in SlideshowFeaturesIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in SlideshowFeaturesIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				features = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + features + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in SlideshowFeaturesIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in SlideshowFeaturesIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in SlideshowFeatures doEndTag", e);
			throw new JspTagException("Exception raised in SlideshowFeatures doEndTag");
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

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getFeatures() {
		return features;
	}

}
