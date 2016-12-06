package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHDIYearIterator theJournal = (JournalHDIYearIterator)findAncestorWithClass(this, JournalHDIYearIterator.class);
			pageContext.getOut().print(theJournal.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

