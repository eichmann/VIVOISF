package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteTranslatorIterator theNoteTranslatorIterator = (NoteTranslatorIterator)findAncestorWithClass(this, NoteTranslatorIterator.class);
			pageContext.getOut().print(theNoteTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for translator tag ");
		}
		return SKIP_BODY;
	}
}

