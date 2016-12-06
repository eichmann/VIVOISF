package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalGDPUnitIterator theJournal = (JournalGDPUnitIterator)findAncestorWithClass(this, JournalGDPUnitIterator.class);
			pageContext.getOut().print(theJournal.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

