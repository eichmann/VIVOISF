package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameOfficialENIterator theJournal = (JournalNameOfficialENIterator)findAncestorWithClass(this, JournalNameOfficialENIterator.class);
			pageContext.getOut().print(theJournal.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

