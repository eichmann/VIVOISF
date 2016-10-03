package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticlePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticlePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticlePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticlePageStartIterator theEditorialArticle = (EditorialArticlePageStartIterator)findAncestorWithClass(this, EditorialArticlePageStartIterator.class);
			pageContext.getOut().print(theEditorialArticle.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

