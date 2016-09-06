package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookVolumeIterator theEditedBook = (EditedBookVolumeIterator)findAncestorWithClass(this, EditedBookVolumeIterator.class);
			pageContext.getOut().print(theEditedBook.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for volume tag ");
		}
		return SKIP_BODY;
	}
}

