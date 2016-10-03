package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleAsinIterator theEditorialArticle = (EditorialArticleAsinIterator)findAncestorWithClass(this, EditorialArticleAsinIterator.class);
			pageContext.getOut().print(theEditorialArticle.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for asin tag ");
		}
		return SKIP_BODY;
	}
}

