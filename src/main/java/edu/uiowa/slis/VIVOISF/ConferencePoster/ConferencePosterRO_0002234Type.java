package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRO_0002234Iterator theConferencePosterRO_0002234Iterator = (ConferencePosterRO_0002234Iterator)findAncestorWithClass(this, ConferencePosterRO_0002234Iterator.class);
			pageContext.getOut().print(theConferencePosterRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

