package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRO_0002234Iterator theJournalRO_0002234Iterator = (JournalRO_0002234Iterator)findAncestorWithClass(this, JournalRO_0002234Iterator.class);
			pageContext.getOut().print(theJournalRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

