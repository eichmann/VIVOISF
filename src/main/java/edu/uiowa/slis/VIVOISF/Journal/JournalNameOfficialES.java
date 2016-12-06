package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameOfficialESIterator theJournal = (JournalNameOfficialESIterator)findAncestorWithClass(this, JournalNameOfficialESIterator.class);
			pageContext.getOut().print(theJournal.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

