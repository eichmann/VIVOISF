package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameOfficialITIterator theConferencePoster = (ConferencePosterNameOfficialITIterator)findAncestorWithClass(this, ConferencePosterNameOfficialITIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

