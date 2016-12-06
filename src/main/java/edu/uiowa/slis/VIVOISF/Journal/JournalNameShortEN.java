package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameShortENIterator theJournal = (JournalNameShortENIterator)findAncestorWithClass(this, JournalNameShortENIterator.class);
			pageContext.getOut().print(theJournal.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

