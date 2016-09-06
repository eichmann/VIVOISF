package edu.uiowa.slis.VIVOISF.Phase_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Phase_1RO_0000057Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_1RO_0000057Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_1RO_0000057Iterator.class);

	String subjectURI = null;
	String type = null;
	String RO_0000057 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Phase_1 thePhase_1 = (Phase_1) findAncestorWithClass(this, Phase_1.class);

			if (thePhase_1 != null) {
				subjectURI = thePhase_1.getSubjectURI();
			}

			if (thePhase_1 == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.obolibrary.org/obo/RO_0000057> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				RO_0000057 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + RO_0000057 + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in Phase_1RO_0000057Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Phase_1RO_0000057Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				RO_0000057 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + RO_0000057 + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in Phase_1RO_0000057Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Phase_1RO_0000057Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Phase_1RO_0000057 doEndTag", e);
			throw new JspTagException("Exception raised in Phase_1RO_0000057 doEndTag");
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

	public void setRO_0000057(String RO_0000057) {
		this.RO_0000057 = RO_0000057;
	}

	public String getRO_0000057() {
		return RO_0000057;
	}

}
