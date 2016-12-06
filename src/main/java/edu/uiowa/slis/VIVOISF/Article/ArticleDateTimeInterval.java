package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleDateTimeIntervalIterator theArticleDateTimeIntervalIterator = (ArticleDateTimeIntervalIterator)findAncestorWithClass(this, ArticleDateTimeIntervalIterator.class);
			pageContext.getOut().print(theArticleDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

