package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BlogPostingNihmsidIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingNihmsidIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingNihmsidIterator.class);

	String subjectURI = null;
	String nihmsid = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BlogPosting ancestorInstance = (BlogPosting) findAncestorWithClass(this, BlogPosting.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#nihmsid> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nihmsid = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in BlogPostingIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BlogPostingIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nihmsid = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in BlogPostingIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BlogPostingIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in BlogPosting doEndTag", e);
			throw new JspTagException("Exception raised in BlogPosting doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNihmsid(String nihmsid) {
		this.nihmsid = nihmsid;
	}

	public String getNihmsid() {
		return nihmsid;
	}

}
