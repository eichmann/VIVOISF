package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleHasTranslationIterator theEditorialArticleHasTranslationIterator = (EditorialArticleHasTranslationIterator)findAncestorWithClass(this, EditorialArticleHasTranslationIterator.class);
			pageContext.getOut().print(theEditorialArticleHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

