package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNihmsid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNihmsid currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNihmsid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNihmsidIterator theArticle = (ArticleNihmsidIterator)findAncestorWithClass(this, ArticleNihmsidIterator.class);
			pageContext.getOut().print(theArticle.getNihmsid());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nihmsid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nihmsid tag ");
		}
		return SKIP_BODY;
	}
}

