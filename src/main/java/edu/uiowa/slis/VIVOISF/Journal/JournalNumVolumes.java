package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNumVolumesIterator theJournal = (JournalNumVolumesIterator)findAncestorWithClass(this, JournalNumVolumesIterator.class);
			pageContext.getOut().print(theJournal.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

