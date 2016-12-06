package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameListENIterator theJournal = (JournalNameListENIterator)findAncestorWithClass(this, JournalNameListENIterator.class);
			pageContext.getOut().print(theJournal.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

