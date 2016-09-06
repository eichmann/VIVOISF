package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRO_0000056Iterator theJournalRO_0000056Iterator = (JournalRO_0000056Iterator)findAncestorWithClass(this, JournalRO_0000056Iterator.class);
			pageContext.getOut().print(theJournalRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

