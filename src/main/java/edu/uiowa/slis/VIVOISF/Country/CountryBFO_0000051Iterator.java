package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CountryBFO_0000051Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryBFO_0000051Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryBFO_0000051Iterator.class);

	String subjectURI = null;
	String type = null;
	String BFO_0000051 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Country theCountry = (Country) findAncestorWithClass(this, Country.class);

			if (theCountry != null) {
				subjectURI = theCountry.getSubjectURI();
			}

			if (theCountry == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.obolibrary.org/obo/BFO_0000051> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				BFO_0000051 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + BFO_0000051 + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CountryBFO_0000051Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CountryBFO_0000051Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				BFO_0000051 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + BFO_0000051 + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CountryBFO_0000051Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CountryBFO_0000051Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in CountryBFO_0000051 doEndTag", e);
			throw new JspTagException("Exception raised in CountryBFO_0000051 doEndTag");
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

	public void setBFO_0000051(String BFO_0000051) {
		this.BFO_0000051 = BFO_0000051;
	}

	public String getBFO_0000051() {
		return BFO_0000051;
	}

}
