package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalUpcIterator theJournal = (JournalUpcIterator)findAncestorWithClass(this, JournalUpcIterator.class);
			pageContext.getOut().print(theJournal.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for upc tag ");
		}
		return SKIP_BODY;
	}
}

