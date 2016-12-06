package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRO_0001015Iterator theConferencePosterRO_0001015Iterator = (ConferencePosterRO_0001015Iterator)findAncestorWithClass(this, ConferencePosterRO_0001015Iterator.class);
			pageContext.getOut().print(theConferencePosterRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

