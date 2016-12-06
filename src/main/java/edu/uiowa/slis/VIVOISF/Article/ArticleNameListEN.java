package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameListENIterator theArticle = (ArticleNameListENIterator)findAncestorWithClass(this, ArticleNameListENIterator.class);
			pageContext.getOut().print(theArticle.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

