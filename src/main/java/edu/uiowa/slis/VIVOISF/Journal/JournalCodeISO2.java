package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeISO2Iterator theJournal = (JournalCodeISO2Iterator)findAncestorWithClass(this, JournalCodeISO2Iterator.class);
			pageContext.getOut().print(theJournal.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

