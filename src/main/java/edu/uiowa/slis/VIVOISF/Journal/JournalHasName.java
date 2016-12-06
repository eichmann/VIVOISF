package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasNameIterator theJournalHasNameIterator = (JournalHasNameIterator)findAncestorWithClass(this, JournalHasNameIterator.class);
			pageContext.getOut().print(theJournalHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasName tag ");
		}
		return SKIP_BODY;
	}
}

