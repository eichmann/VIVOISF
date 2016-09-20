package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterERO_0000045Iterator theConferencePoster = (ConferencePosterERO_0000045Iterator)findAncestorWithClass(this, ConferencePosterERO_0000045Iterator.class);
			pageContext.getOut().print(theConferencePoster.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

