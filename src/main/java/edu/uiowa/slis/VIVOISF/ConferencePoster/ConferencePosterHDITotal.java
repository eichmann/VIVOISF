package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHDITotalIterator theConferencePoster = (ConferencePosterHDITotalIterator)findAncestorWithClass(this, ConferencePosterHDITotalIterator.class);
			pageContext.getOut().print(theConferencePoster.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

