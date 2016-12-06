package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRO_0001015Iterator theJournalRO_0001015Iterator = (JournalRO_0001015Iterator)findAncestorWithClass(this, JournalRO_0001015Iterator.class);
			pageContext.getOut().print(theJournalRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

