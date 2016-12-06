package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeDBPediaIDIterator theJournal = (JournalCodeDBPediaIDIterator)findAncestorWithClass(this, JournalCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theJournal.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

