package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleNumberIterator theEditorialArticle = (EditorialArticleNumberIterator)findAncestorWithClass(this, EditorialArticleNumberIterator.class);
			pageContext.getOut().print(theEditorialArticle.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for number tag ");
		}
		return SKIP_BODY;
	}
}

