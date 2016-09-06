package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleTheAbstractIterator theEditorialArticle = (EditorialArticleTheAbstractIterator)findAncestorWithClass(this, EditorialArticleTheAbstractIterator.class);
			pageContext.getOut().print(theEditorialArticle.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

