package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHDITotalIterator theJournal = (JournalHDITotalIterator)findAncestorWithClass(this, JournalHDITotalIterator.class);
			pageContext.getOut().print(theJournal.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

