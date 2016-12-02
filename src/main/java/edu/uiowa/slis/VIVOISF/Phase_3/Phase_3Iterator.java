package edu.uiowa.slis.VIVOISF.Phase_3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Phase_3Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_3Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_3Iterator.class);

	String subjectURI = null;
	String label = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			rs = getResultSet(prefix+
					" SELECT ?s ?labelUS ?labelENG, ?label ?labelANY where { "+
					"  ?s rdf:type <http://purl.org/net/OCRe/study_design.owl#Phase_3> . "+
					"  OPTIONAL { SELECT ?labelUS  WHERE { ?s rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "+
					"  OPTIONAL { SELECT ?labelENG WHERE { ?s rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "+
					"  OPTIONAL { SELECT ?label    WHERE { ?s rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "+
					"  OPTIONAL { SELECT ?labelANY WHERE { ?s rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "+
					"} ORDER BY ?label");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				subjectURI = sol.get("?s").toString();
				label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
				if (label == null)
					label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
				if (label == null)
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				if (label == null)
					label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in Phase_3Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Phase_3Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				subjectURI = sol.get("?s").toString();
				label = sol.get("?l") == null ? null : sol.get("?l").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in Phase_3Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Phase_3Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Phase_3 doEndTag", e);
			throw new JspTagException("Exception raised in Phase_3 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		label = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
