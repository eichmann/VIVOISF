package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalOwnerIterator theJournalOwnerIterator = (JournalOwnerIterator)findAncestorWithClass(this, JournalOwnerIterator.class);
			pageContext.getOut().print(theJournalOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for owner tag ");
		}
		return SKIP_BODY;
	}
}

