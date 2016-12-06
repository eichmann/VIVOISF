package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameOfficialARIterator theJournal = (JournalNameOfficialARIterator)findAncestorWithClass(this, JournalNameOfficialARIterator.class);
			pageContext.getOut().print(theJournal.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

