package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleHandleIterator theEditorialArticle = (EditorialArticleHandleIterator)findAncestorWithClass(this, EditorialArticleHandleIterator.class);
			pageContext.getOut().print(theEditorialArticle.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for handle tag ");
		}
		return SKIP_BODY;
	}
}

