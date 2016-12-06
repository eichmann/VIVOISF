package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameListARIterator theArticle = (ArticleNameListARIterator)findAncestorWithClass(this, ArticleNameListARIterator.class);
			pageContext.getOut().print(theArticle.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

