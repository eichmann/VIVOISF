package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeUNIterator theJournal = (JournalCodeUNIterator)findAncestorWithClass(this, JournalCodeUNIterator.class);
			pageContext.getOut().print(theJournal.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

