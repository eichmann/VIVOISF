package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleDocumentationForIterator theEditorialArticleDocumentationForIterator = (EditorialArticleDocumentationForIterator)findAncestorWithClass(this, EditorialArticleDocumentationForIterator.class);
			pageContext.getOut().print(theEditorialArticleDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

