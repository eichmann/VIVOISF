package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteProducerIterator theNoteProducerIterator = (NoteProducerIterator)findAncestorWithClass(this, NoteProducerIterator.class);
			pageContext.getOut().print(theNoteProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for producer tag ");
		}
		return SKIP_BODY;
	}
}

