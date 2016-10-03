package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteIsbn10Iterator theNote = (NoteIsbn10Iterator)findAncestorWithClass(this, NoteIsbn10Iterator.class);
			pageContext.getOut().print(theNote.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

