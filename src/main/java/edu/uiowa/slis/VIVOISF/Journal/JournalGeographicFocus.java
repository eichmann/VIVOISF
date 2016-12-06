package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalGeographicFocusIterator theJournalGeographicFocusIterator = (JournalGeographicFocusIterator)findAncestorWithClass(this, JournalGeographicFocusIterator.class);
			pageContext.getOut().print(theJournalGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

