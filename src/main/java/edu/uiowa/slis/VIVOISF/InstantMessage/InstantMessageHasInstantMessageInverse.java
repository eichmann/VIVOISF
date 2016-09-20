package edu.uiowa.slis.VIVOISF.InstantMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstantMessageHasInstantMessageInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstantMessageHasInstantMessageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstantMessageHasInstantMessageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstantMessageHasInstantMessageInverseIterator theInstantMessageHasInstantMessageInverseIterator = (InstantMessageHasInstantMessageInverseIterator)findAncestorWithClass(this, InstantMessageHasInstantMessageInverseIterator.class);
			pageContext.getOut().print(theInstantMessageHasInstantMessageInverseIterator.getHasInstantMessageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for hasInstantMessage tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for hasInstantMessage tag ");
		}
		return SKIP_BODY;
	}
}

