package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameListFRIterator theArticle = (ArticleNameListFRIterator)findAncestorWithClass(this, ArticleNameListFRIterator.class);
			pageContext.getOut().print(theArticle.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

