package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeUNDPIterator theJournal = (JournalCodeUNDPIterator)findAncestorWithClass(this, JournalCodeUNDPIterator.class);
			pageContext.getOut().print(theJournal.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

