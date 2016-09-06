package edu.uiowa.slis.VIVOISF.ARG_2000377;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ARG_2000377ARG_2000029Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000377ARG_2000029Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000377ARG_2000029Iterator.class);

	String subjectURI = null;
	String type = null;
	String ARG_2000029 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ARG_2000377 theARG_2000377 = (ARG_2000377) findAncestorWithClass(this, ARG_2000377.class);

			if (theARG_2000377 != null) {
				subjectURI = theARG_2000377.getSubjectURI();
			}

			if (theARG_2000377 == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.obolibrary.org/obo/ARG_2000029> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_2000029 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + ARG_2000029 + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000377ARG_2000029Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ARG_2000377ARG_2000029Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_2000029 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + ARG_2000029 + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000377ARG_2000029Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ARG_2000377ARG_2000029Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000377ARG_2000029 doEndTag", e);
			throw new JspTagException("Exception raised in ARG_2000377ARG_2000029 doEndTag");
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

	public void setARG_2000029(String ARG_2000029) {
		this.ARG_2000029 = ARG_2000029;
	}

	public String getARG_2000029() {
		return ARG_2000029;
	}

}
