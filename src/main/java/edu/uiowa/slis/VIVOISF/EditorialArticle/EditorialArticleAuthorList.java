package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleAuthorListIterator theEditorialArticleAuthorListIterator = (EditorialArticleAuthorListIterator)findAncestorWithClass(this, EditorialArticleAuthorListIterator.class);
			pageContext.getOut().print(theEditorialArticleAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for authorList tag ");
		}
		return SKIP_BODY;
	}
}

