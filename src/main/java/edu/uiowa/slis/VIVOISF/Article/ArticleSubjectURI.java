package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			if (!theArticle.commitNeeded) {
				pageContext.getOut().print(theArticle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Article for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			return theArticle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Article for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			theArticle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Article for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for subjectURI tag ");
		}
	}
}

