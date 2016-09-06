package edu.uiowa.slis.VIVOISF.ERO_0001261;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0001261InformationResourceSupportedByIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001261InformationResourceSupportedByIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001261InformationResourceSupportedByIterator.class);

	String subjectURI = null;
	String type = null;
	String informationResourceSupportedBy = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0001261 theERO_0001261 = (ERO_0001261) findAncestorWithClass(this, ERO_0001261.class);

			if (theERO_0001261 != null) {
				subjectURI = theERO_0001261.getSubjectURI();
			}

			if (theERO_0001261 == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#informationResourceSupportedBy> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				informationResourceSupportedBy = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + informationResourceSupportedBy + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001261InformationResourceSupportedByIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0001261InformationResourceSupportedByIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				informationResourceSupportedBy = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + informationResourceSupportedBy + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001261InformationResourceSupportedByIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0001261InformationResourceSupportedByIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001261InformationResourceSupportedBy doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0001261InformationResourceSupportedBy doEndTag");
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

	public void setInformationResourceSupportedBy(String informationResourceSupportedBy) {
		this.informationResourceSupportedBy = informationResourceSupportedBy;
	}

	public String getInformationResourceSupportedBy() {
		return informationResourceSupportedBy;
	}

}
