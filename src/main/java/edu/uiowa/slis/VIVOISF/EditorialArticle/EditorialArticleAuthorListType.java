package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleAuthorListIterator theEditorialArticleAuthorListIterator = (EditorialArticleAuthorListIterator)findAncestorWithClass(this, EditorialArticleAuthorListIterator.class);
			pageContext.getOut().print(theEditorialArticleAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for authorList tag ");
		}
		return SKIP_BODY;
	}
}

