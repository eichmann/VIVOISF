package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OBI_0000835TranslatorOfIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835TranslatorOfIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835TranslatorOfIterator.class);

	String subjectURI = null;
	String type = null;
	String translatorOf = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OBI_0000835 theOBI_0000835 = (OBI_0000835) findAncestorWithClass(this, OBI_0000835.class);

			if (theOBI_0000835 != null) {
				subjectURI = theOBI_0000835.getSubjectURI();
			}

			if (theOBI_0000835 == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#translatorOf> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				translatorOf = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + translatorOf + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000835TranslatorOfIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OBI_0000835TranslatorOfIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				translatorOf = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + translatorOf + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000835TranslatorOfIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OBI_0000835TranslatorOfIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000835TranslatorOf doEndTag", e);
			throw new JspTagException("Exception raised in OBI_0000835TranslatorOf doEndTag");
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

	public void setTranslatorOf(String translatorOf) {
		this.translatorOf = translatorOf;
	}

	public String getTranslatorOf() {
		return translatorOf;
	}

}
