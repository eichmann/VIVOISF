package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ArticleNameListESIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListESIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListESIterator.class);

	String subjectURI = null;
	String nameListES = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Article ancestorInstance = (Article) findAncestorWithClass(this, Article.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nameListES> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameListES = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ArticleIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ArticleIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameListES = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ArticleIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ArticleIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Article doEndTag", e);
			throw new JspTagException("Exception raised in Article doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNameListES(String nameListES) {
		this.nameListES = nameListES;
	}

	public String getNameListES() {
		return nameListES;
	}

}
