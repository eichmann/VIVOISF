package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleUri currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleUriIterator theEditorialArticle = (EditorialArticleUriIterator)findAncestorWithClass(this, EditorialArticleUriIterator.class);
			pageContext.getOut().print(theEditorialArticle.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for uri tag ");
		}
		return SKIP_BODY;
	}
}

