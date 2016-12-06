package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			if (!theArticle.commitNeeded) {
				pageContext.getOut().print(theArticle.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Article for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			return theArticle.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Article for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			theArticle.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Article for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for abbreviation tag ");
		}
	}
}

