package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterSiciIterator theConferencePoster = (ConferencePosterSiciIterator)findAncestorWithClass(this, ConferencePosterSiciIterator.class);
			pageContext.getOut().print(theConferencePoster.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for sici tag ");
		}
		return SKIP_BODY;
	}
}

