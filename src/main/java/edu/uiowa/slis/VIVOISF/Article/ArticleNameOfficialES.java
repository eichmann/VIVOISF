package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialESIterator theArticle = (ArticleNameOfficialESIterator)findAncestorWithClass(this, ArticleNameOfficialESIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

