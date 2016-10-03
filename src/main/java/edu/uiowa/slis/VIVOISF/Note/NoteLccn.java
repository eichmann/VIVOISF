package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteLccnIterator theNote = (NoteLccnIterator)findAncestorWithClass(this, NoteLccnIterator.class);
			pageContext.getOut().print(theNote.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for lccn tag ");
		}
		return SKIP_BODY;
	}
}

