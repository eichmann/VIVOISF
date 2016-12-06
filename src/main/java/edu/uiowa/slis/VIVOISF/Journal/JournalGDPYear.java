package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalGDPYearIterator theJournal = (JournalGDPYearIterator)findAncestorWithClass(this, JournalGDPYearIterator.class);
			pageContext.getOut().print(theJournal.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

