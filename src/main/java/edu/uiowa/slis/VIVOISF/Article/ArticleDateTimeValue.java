package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleDateTimeValueIterator theArticleDateTimeValueIterator = (ArticleDateTimeValueIterator)findAncestorWithClass(this, ArticleDateTimeValueIterator.class);
			pageContext.getOut().print(theArticleDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

