package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalAsinIterator theJournal = (JournalAsinIterator)findAncestorWithClass(this, JournalAsinIterator.class);
			pageContext.getOut().print(theJournal.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for asin tag ");
		}
		return SKIP_BODY;
	}
}

