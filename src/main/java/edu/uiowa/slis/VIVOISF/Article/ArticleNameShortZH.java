package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortZHIterator theArticle = (ArticleNameShortZHIterator)findAncestorWithClass(this, ArticleNameShortZHIterator.class);
			pageContext.getOut().print(theArticle.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

