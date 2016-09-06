package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteTranslationOfIterator theNoteTranslationOfIterator = (NoteTranslationOfIterator)findAncestorWithClass(this, NoteTranslationOfIterator.class);
			pageContext.getOut().print(theNoteTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

