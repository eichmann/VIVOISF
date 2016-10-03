package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalEanucc13Iterator theJournal = (JournalEanucc13Iterator)findAncestorWithClass(this, JournalEanucc13Iterator.class);
			pageContext.getOut().print(theJournal.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

