package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteLocatorIterator theNote = (NoteLocatorIterator)findAncestorWithClass(this, NoteLocatorIterator.class);
			pageContext.getOut().print(theNote.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for locator tag ");
		}
		return SKIP_BODY;
	}
}

