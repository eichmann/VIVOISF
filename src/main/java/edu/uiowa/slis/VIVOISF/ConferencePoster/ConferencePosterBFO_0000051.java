package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterBFO_0000051Iterator theConferencePosterBFO_0000051Iterator = (ConferencePosterBFO_0000051Iterator)findAncestorWithClass(this, ConferencePosterBFO_0000051Iterator.class);
			pageContext.getOut().print(theConferencePosterBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

