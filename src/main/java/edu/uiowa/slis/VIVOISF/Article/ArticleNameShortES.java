package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortESIterator theArticle = (ArticleNameShortESIterator)findAncestorWithClass(this, ArticleNameShortESIterator.class);
			pageContext.getOut().print(theArticle.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

