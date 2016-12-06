package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterBFO_0000050Iterator theConferencePosterBFO_0000050Iterator = (ConferencePosterBFO_0000050Iterator)findAncestorWithClass(this, ConferencePosterBFO_0000050Iterator.class);
			pageContext.getOut().print(theConferencePosterBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

