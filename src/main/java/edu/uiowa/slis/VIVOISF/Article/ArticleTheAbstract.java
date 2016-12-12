package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleTheAbstractIterator theArticle = (ArticleTheAbstractIterator)findAncestorWithClass(this, ArticleTheAbstractIterator.class);
			pageContext.getOut().print(theArticle.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

