package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteIssuerIterator theNoteIssuerIterator = (NoteIssuerIterator)findAncestorWithClass(this, NoteIssuerIterator.class);
			pageContext.getOut().print(theNoteIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for issuer tag ");
		}
		return SKIP_BODY;
	}
}

