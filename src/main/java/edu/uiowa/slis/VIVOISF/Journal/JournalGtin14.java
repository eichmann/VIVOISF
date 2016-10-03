package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalGtin14Iterator theJournal = (JournalGtin14Iterator)findAncestorWithClass(this, JournalGtin14Iterator.class);
			pageContext.getOut().print(theJournal.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

