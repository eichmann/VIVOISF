package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleNumPagesIterator theEditorialArticle = (EditorialArticleNumPagesIterator)findAncestorWithClass(this, EditorialArticleNumPagesIterator.class);
			pageContext.getOut().print(theEditorialArticle.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for numPages tag ");
		}
		return SKIP_BODY;
	}
}

