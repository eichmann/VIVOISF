package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleTranslationOfIterator theEditorialArticleTranslationOfIterator = (EditorialArticleTranslationOfIterator)findAncestorWithClass(this, EditorialArticleTranslationOfIterator.class);
			pageContext.getOut().print(theEditorialArticleTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

