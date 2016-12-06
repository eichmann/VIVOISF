package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortFRIterator theArticle = (ArticleNameShortFRIterator)findAncestorWithClass(this, ArticleNameShortFRIterator.class);
			pageContext.getOut().print(theArticle.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

