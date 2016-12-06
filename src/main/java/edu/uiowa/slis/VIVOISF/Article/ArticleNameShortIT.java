package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortITIterator theArticle = (ArticleNameShortITIterator)findAncestorWithClass(this, ArticleNameShortITIterator.class);
			pageContext.getOut().print(theArticle.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

