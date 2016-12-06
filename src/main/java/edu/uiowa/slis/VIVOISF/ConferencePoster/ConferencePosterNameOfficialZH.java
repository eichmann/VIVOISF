package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameOfficialZHIterator theConferencePoster = (ConferencePosterNameOfficialZHIterator)findAncestorWithClass(this, ConferencePosterNameOfficialZHIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

