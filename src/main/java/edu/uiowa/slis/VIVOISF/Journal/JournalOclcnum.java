package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalOclcnumIterator theJournal = (JournalOclcnumIterator)findAncestorWithClass(this, JournalOclcnumIterator.class);
			pageContext.getOut().print(theJournal.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

