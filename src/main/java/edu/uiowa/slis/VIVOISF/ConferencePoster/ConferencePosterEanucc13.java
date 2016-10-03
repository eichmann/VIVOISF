package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterEanucc13Iterator theConferencePoster = (ConferencePosterEanucc13Iterator)findAncestorWithClass(this, ConferencePosterEanucc13Iterator.class);
			pageContext.getOut().print(theConferencePoster.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

