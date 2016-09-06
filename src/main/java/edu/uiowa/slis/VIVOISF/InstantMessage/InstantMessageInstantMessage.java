package edu.uiowa.slis.VIVOISF.InstantMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstantMessageInstantMessage extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstantMessageInstantMessage currentInstance = null;
	private static final Log log = LogFactory.getLog(InstantMessageInstantMessage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstantMessageInstantMessageIterator theInstantMessage = (InstantMessageInstantMessageIterator)findAncestorWithClass(this, InstantMessageInstantMessageIterator.class);
			pageContext.getOut().print(theInstantMessage.getInstantMessage());
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for instantMessage tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for instantMessage tag ");
		}
		return SKIP_BODY;
	}
}

