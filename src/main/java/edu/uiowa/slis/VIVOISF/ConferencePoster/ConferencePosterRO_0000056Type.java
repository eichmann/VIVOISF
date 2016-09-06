package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRO_0000056Iterator theConferencePosterRO_0000056Iterator = (ConferencePosterRO_0000056Iterator)findAncestorWithClass(this, ConferencePosterRO_0000056Iterator.class);
			pageContext.getOut().print(theConferencePosterRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

