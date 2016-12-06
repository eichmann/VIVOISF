package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasAddressIterator theJournalHasAddressIterator = (JournalHasAddressIterator)findAncestorWithClass(this, JournalHasAddressIterator.class);
			pageContext.getOut().print(theJournalHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

