package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NewsReleaseDocumentationForIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseDocumentationForIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseDocumentationForIterator.class);

	String subjectURI = null;
	String type = null;
	String documentationFor = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NewsRelease theNewsRelease = (NewsRelease) findAncestorWithClass(this, NewsRelease.class);

			if (theNewsRelease != null) {
				subjectURI = theNewsRelease.getSubjectURI();
			}

			if (theNewsRelease == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/scientific-research#documentationFor> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				documentationFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + documentationFor + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in NewsReleaseDocumentationForIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NewsReleaseDocumentationForIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				documentationFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + documentationFor + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in NewsReleaseDocumentationForIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NewsReleaseDocumentationForIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in NewsReleaseDocumentationFor doEndTag", e);
			throw new JspTagException("Exception raised in NewsReleaseDocumentationFor doEndTag");
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

	public void setDocumentationFor(String documentationFor) {
		this.documentationFor = documentationFor;
	}

	public String getDocumentationFor() {
		return documentationFor;
	}

}
