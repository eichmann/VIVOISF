package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class FoundationGoverningAuthorityForIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationGoverningAuthorityForIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationGoverningAuthorityForIterator.class);

	String subjectURI = null;
	String type = null;
	String governingAuthorityFor = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Foundation theFoundation = (Foundation) findAncestorWithClass(this, Foundation.class);

			if (theFoundation != null) {
				subjectURI = theFoundation.getSubjectURI();
			}

			if (theFoundation == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#governingAuthorityFor> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				governingAuthorityFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + governingAuthorityFor + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in FoundationGoverningAuthorityForIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FoundationGoverningAuthorityForIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				governingAuthorityFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + governingAuthorityFor + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in FoundationGoverningAuthorityForIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FoundationGoverningAuthorityForIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in FoundationGoverningAuthorityFor doEndTag", e);
			throw new JspTagException("Exception raised in FoundationGoverningAuthorityFor doEndTag");
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

	public void setGoverningAuthorityFor(String governingAuthorityFor) {
		this.governingAuthorityFor = governingAuthorityFor;
	}

	public String getGoverningAuthorityFor() {
		return governingAuthorityFor;
	}

}
