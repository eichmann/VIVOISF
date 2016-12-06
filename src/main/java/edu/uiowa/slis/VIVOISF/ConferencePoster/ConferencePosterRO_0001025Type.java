package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRO_0001025Iterator theConferencePosterRO_0001025Iterator = (ConferencePosterRO_0001025Iterator)findAncestorWithClass(this, ConferencePosterRO_0001025Iterator.class);
			pageContext.getOut().print(theConferencePosterRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

