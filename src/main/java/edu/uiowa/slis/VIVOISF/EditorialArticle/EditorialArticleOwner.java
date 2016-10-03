package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleOwnerIterator theEditorialArticleOwnerIterator = (EditorialArticleOwnerIterator)findAncestorWithClass(this, EditorialArticleOwnerIterator.class);
			pageContext.getOut().print(theEditorialArticleOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for owner tag ");
		}
		return SKIP_BODY;
	}
}

