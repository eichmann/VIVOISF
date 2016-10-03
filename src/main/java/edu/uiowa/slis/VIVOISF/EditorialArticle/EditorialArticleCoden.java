package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleCodenIterator theEditorialArticle = (EditorialArticleCodenIterator)findAncestorWithClass(this, EditorialArticleCodenIterator.class);
			pageContext.getOut().print(theEditorialArticle.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for coden tag ");
		}
		return SKIP_BODY;
	}
}

