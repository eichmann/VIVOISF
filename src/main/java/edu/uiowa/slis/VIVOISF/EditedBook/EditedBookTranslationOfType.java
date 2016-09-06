package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookTranslationOfIterator theEditedBookTranslationOfIterator = (EditedBookTranslationOfIterator)findAncestorWithClass(this, EditedBookTranslationOfIterator.class);
			pageContext.getOut().print(theEditedBookTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

