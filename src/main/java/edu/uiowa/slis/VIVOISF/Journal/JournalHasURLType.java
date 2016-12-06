package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasURLIterator theJournalHasURLIterator = (JournalHasURLIterator)findAncestorWithClass(this, JournalHasURLIterator.class);
			pageContext.getOut().print(theJournalHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

