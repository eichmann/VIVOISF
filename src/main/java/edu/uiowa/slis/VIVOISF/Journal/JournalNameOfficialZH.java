package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameOfficialZHIterator theJournal = (JournalNameOfficialZHIterator)findAncestorWithClass(this, JournalNameOfficialZHIterator.class);
			pageContext.getOut().print(theJournal.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

