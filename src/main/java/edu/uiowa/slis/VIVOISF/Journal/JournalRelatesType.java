package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRelatesIterator theJournalRelatesIterator = (JournalRelatesIterator)findAncestorWithClass(this, JournalRelatesIterator.class);
			pageContext.getOut().print(theJournalRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for relates tag ");
		}
		return SKIP_BODY;
	}
}

