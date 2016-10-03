package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleIdentifierIterator theEditorialArticle = (EditorialArticleIdentifierIterator)findAncestorWithClass(this, EditorialArticleIdentifierIterator.class);
			pageContext.getOut().print(theEditorialArticle.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for identifier tag ");
		}
		return SKIP_BODY;
	}
}

