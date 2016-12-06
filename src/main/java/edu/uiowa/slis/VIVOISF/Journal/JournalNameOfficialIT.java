package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameOfficialITIterator theJournal = (JournalNameOfficialITIterator)findAncestorWithClass(this, JournalNameOfficialITIterator.class);
			pageContext.getOut().print(theJournal.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

