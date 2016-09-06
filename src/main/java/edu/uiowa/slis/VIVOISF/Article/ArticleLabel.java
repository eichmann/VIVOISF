package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			if (!theArticle.commitNeeded) {
				pageContext.getOut().print(theArticle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Article for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			return theArticle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Article for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			theArticle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Article for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for label tag ");
		}
	}
}

