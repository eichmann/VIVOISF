package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalEissnIterator theJournal = (JournalEissnIterator)findAncestorWithClass(this, JournalEissnIterator.class);
			pageContext.getOut().print(theJournal.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for eissn tag ");
		}
		return SKIP_BODY;
	}
}

