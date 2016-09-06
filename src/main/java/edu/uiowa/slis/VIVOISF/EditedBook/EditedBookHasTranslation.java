package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookHasTranslationIterator theEditedBookHasTranslationIterator = (EditedBookHasTranslationIterator)findAncestorWithClass(this, EditedBookHasTranslationIterator.class);
			pageContext.getOut().print(theEditedBookHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

