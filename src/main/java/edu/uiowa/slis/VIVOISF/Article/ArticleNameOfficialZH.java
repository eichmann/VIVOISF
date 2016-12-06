package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialZHIterator theArticle = (ArticleNameOfficialZHIterator)findAncestorWithClass(this, ArticleNameOfficialZHIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}
