package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class EditorialArticleARG_2000028Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleARG_2000028Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleARG_2000028Iterator.class);

	String subjectURI = null;
	String type = null;
	String ARG_2000028 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle) findAncestorWithClass(this, EditorialArticle.class);

			if (theEditorialArticle != null) {
				subjectURI = theEditorialArticle.getSubjectURI();
			}

			if (theEditorialArticle == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.obolibrary.org/obo/ARG_2000028> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_2000028 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + ARG_2000028 + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in EditorialArticleARG_2000028Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EditorialArticleARG_2000028Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_2000028 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + ARG_2000028 + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in EditorialArticleARG_2000028Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EditorialArticleARG_2000028Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in EditorialArticleARG_2000028 doEndTag", e);
			throw new JspTagException("Exception raised in EditorialArticleARG_2000028 doEndTag");
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

	public void setARG_2000028(String ARG_2000028) {
		this.ARG_2000028 = ARG_2000028;
	}

	public String getARG_2000028() {
		return ARG_2000028;
	}

}
