package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticlePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticlePages currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticlePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticlePagesIterator theEditorialArticle = (EditorialArticlePagesIterator)findAncestorWithClass(this, EditorialArticlePagesIterator.class);
			pageContext.getOut().print(theEditorialArticle.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for pages tag ");
		}
		return SKIP_BODY;
	}
}

