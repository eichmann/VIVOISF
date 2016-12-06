package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialRUIterator theConferencePaper = (ConferencePaperNameOfficialRUIterator)findAncestorWithClass(this, ConferencePaperNameOfficialRUIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

