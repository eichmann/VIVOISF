package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteReproducedInIterator theNoteReproducedInIterator = (NoteReproducedInIterator)findAncestorWithClass(this, NoteReproducedInIterator.class);
			pageContext.getOut().print(theNoteReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

