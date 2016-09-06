package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalARG_2000028Iterator theJournalARG_2000028Iterator = (JournalARG_2000028Iterator)findAncestorWithClass(this, JournalARG_2000028Iterator.class);
			pageContext.getOut().print(theJournalARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

