package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalBFO_0000050Iterator theJournalBFO_0000050Iterator = (JournalBFO_0000050Iterator)findAncestorWithClass(this, JournalBFO_0000050Iterator.class);
			pageContext.getOut().print(theJournalBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

