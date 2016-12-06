package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameOfficialESIterator theConferencePoster = (ConferencePosterNameOfficialESIterator)findAncestorWithClass(this, ConferencePosterNameOfficialESIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

