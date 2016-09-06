package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookTranslatorIterator theEditedBookTranslatorIterator = (EditedBookTranslatorIterator)findAncestorWithClass(this, EditedBookTranslatorIterator.class);
			pageContext.getOut().print(theEditedBookTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for translator tag ");
		}
		return SKIP_BODY;
	}
}

