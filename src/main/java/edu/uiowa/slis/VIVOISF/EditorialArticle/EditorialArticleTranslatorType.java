package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleTranslatorIterator theEditorialArticleTranslatorIterator = (EditorialArticleTranslatorIterator)findAncestorWithClass(this, EditorialArticleTranslatorIterator.class);
			pageContext.getOut().print(theEditorialArticleTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for translator tag ");
		}
		return SKIP_BODY;
	}
}

