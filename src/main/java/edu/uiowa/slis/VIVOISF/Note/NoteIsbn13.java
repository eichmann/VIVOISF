package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteIsbn13Iterator theNote = (NoteIsbn13Iterator)findAncestorWithClass(this, NoteIsbn13Iterator.class);
			pageContext.getOut().print(theNote.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

