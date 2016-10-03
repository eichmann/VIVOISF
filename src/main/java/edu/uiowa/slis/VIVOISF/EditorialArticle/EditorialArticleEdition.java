package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleEditionIterator theEditorialArticle = (EditorialArticleEditionIterator)findAncestorWithClass(this, EditorialArticleEditionIterator.class);
			pageContext.getOut().print(theEditorialArticle.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for edition tag ");
		}
		return SKIP_BODY;
	}
}

