package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortENIterator theArticle = (ArticleNameShortENIterator)findAncestorWithClass(this, ArticleNameShortENIterator.class);
			pageContext.getOut().print(theArticle.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

