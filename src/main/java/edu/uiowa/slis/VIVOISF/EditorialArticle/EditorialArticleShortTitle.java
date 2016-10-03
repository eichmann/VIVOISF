package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleShortTitleIterator theEditorialArticle = (EditorialArticleShortTitleIterator)findAncestorWithClass(this, EditorialArticleShortTitleIterator.class);
			pageContext.getOut().print(theEditorialArticle.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

