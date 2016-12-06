package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasTelephoneIterator theArticleHasTelephoneIterator = (ArticleHasTelephoneIterator)findAncestorWithClass(this, ArticleHasTelephoneIterator.class);
			pageContext.getOut().print(theArticleHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

