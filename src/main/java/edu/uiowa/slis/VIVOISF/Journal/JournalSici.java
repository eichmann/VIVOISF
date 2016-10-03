package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalSici currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalSiciIterator theJournal = (JournalSiciIterator)findAncestorWithClass(this, JournalSiciIterator.class);
			pageContext.getOut().print(theJournal.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for sici tag ");
		}
		return SKIP_BODY;
	}
}

