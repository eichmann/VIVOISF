package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRO_0002353Iterator theConferencePosterRO_0002353Iterator = (ConferencePosterRO_0002353Iterator)findAncestorWithClass(this, ConferencePosterRO_0002353Iterator.class);
			pageContext.getOut().print(theConferencePosterRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

