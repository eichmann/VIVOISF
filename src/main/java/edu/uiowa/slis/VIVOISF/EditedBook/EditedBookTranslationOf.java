package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookTranslationOfIterator theEditedBookTranslationOfIterator = (EditedBookTranslationOfIterator)findAncestorWithClass(this, EditedBookTranslationOfIterator.class);
			pageContext.getOut().print(theEditedBookTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

