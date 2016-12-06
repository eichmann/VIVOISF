package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameOfficialFRIterator theConferencePoster = (ConferencePosterNameOfficialFRIterator)findAncestorWithClass(this, ConferencePosterNameOfficialFRIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

