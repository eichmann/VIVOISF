package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeGAULIterator theJournal = (JournalCodeGAULIterator)findAncestorWithClass(this, JournalCodeGAULIterator.class);
			pageContext.getOut().print(theJournal.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

