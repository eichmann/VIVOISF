package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortARIterator theArticle = (ArticleNameShortARIterator)findAncestorWithClass(this, ArticleNameShortARIterator.class);
			pageContext.getOut().print(theArticle.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

