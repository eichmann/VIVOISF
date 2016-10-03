package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteSici currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteSiciIterator theNote = (NoteSiciIterator)findAncestorWithClass(this, NoteSiciIterator.class);
			pageContext.getOut().print(theNote.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for sici tag ");
		}
		return SKIP_BODY;
	}
}

