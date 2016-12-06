package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameListITIterator theArticle = (ArticleNameListITIterator)findAncestorWithClass(this, ArticleNameListITIterator.class);
			pageContext.getOut().print(theArticle.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

