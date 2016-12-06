package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalLandAreaYearIterator theJournal = (JournalLandAreaYearIterator)findAncestorWithClass(this, JournalLandAreaYearIterator.class);
			pageContext.getOut().print(theJournal.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

