package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleRelatesIterator theEditorialArticleRelatesIterator = (EditorialArticleRelatesIterator)findAncestorWithClass(this, EditorialArticleRelatesIterator.class);
			pageContext.getOut().print(theEditorialArticleRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for relates tag ");
		}
		return SKIP_BODY;
	}
}

