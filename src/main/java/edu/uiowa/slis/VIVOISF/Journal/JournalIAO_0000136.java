package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIAO_0000136Iterator theJournalIAO_0000136Iterator = (JournalIAO_0000136Iterator)findAncestorWithClass(this, JournalIAO_0000136Iterator.class);
			pageContext.getOut().print(theJournalIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

