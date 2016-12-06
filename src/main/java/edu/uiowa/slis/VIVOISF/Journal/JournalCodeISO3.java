package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeISO3Iterator theJournal = (JournalCodeISO3Iterator)findAncestorWithClass(this, JournalCodeISO3Iterator.class);
			pageContext.getOut().print(theJournal.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

