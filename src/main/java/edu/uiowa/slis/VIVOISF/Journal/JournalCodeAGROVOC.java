package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeAGROVOCIterator theJournal = (JournalCodeAGROVOCIterator)findAncestorWithClass(this, JournalCodeAGROVOCIterator.class);
			pageContext.getOut().print(theJournal.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

