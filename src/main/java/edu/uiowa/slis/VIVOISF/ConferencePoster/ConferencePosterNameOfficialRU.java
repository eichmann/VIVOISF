package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameOfficialRUIterator theConferencePoster = (ConferencePosterNameOfficialRUIterator)findAncestorWithClass(this, ConferencePosterNameOfficialRUIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

