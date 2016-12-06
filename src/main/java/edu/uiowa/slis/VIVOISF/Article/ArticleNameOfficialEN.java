package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialENIterator theArticle = (ArticleNameOfficialENIterator)findAncestorWithClass(this, ArticleNameOfficialENIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

