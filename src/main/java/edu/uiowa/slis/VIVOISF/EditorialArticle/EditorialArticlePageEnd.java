package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticlePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticlePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticlePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticlePageEndIterator theEditorialArticle = (EditorialArticlePageEndIterator)findAncestorWithClass(this, EditorialArticlePageEndIterator.class);
			pageContext.getOut().print(theEditorialArticle.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

