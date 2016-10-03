package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleLocatorIterator theEditorialArticle = (EditorialArticleLocatorIterator)findAncestorWithClass(this, EditorialArticleLocatorIterator.class);
			pageContext.getOut().print(theEditorialArticle.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for locator tag ");
		}
		return SKIP_BODY;
	}
}

