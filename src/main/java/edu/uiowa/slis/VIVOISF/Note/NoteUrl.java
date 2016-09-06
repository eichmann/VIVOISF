package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteUrlIterator theNote = (NoteUrlIterator)findAncestorWithClass(this, NoteUrlIterator.class);
			pageContext.getOut().print(theNote.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for url tag ");
		}
		return SKIP_BODY;
	}
}

