package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteReproducesIterator theNoteReproducesIterator = (NoteReproducesIterator)findAncestorWithClass(this, NoteReproducesIterator.class);
			pageContext.getOut().print(theNoteReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

