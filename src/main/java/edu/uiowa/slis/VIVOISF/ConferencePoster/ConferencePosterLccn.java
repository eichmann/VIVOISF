package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterLccnIterator theConferencePoster = (ConferencePosterLccnIterator)findAncestorWithClass(this, ConferencePosterLccnIterator.class);
			pageContext.getOut().print(theConferencePoster.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for lccn tag ");
		}
		return SKIP_BODY;
	}
}

