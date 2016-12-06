package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			if (!theArticle.commitNeeded) {
				pageContext.getOut().print(theArticle.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			return theArticle.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Article for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			theArticle.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hideFromDisplay tag ");
		}
	}
}

