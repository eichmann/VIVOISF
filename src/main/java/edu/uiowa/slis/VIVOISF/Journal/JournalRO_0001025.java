package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRO_0001025Iterator theJournalRO_0001025Iterator = (JournalRO_0001025Iterator)findAncestorWithClass(this, JournalRO_0001025Iterator.class);
			pageContext.getOut().print(theJournalRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

