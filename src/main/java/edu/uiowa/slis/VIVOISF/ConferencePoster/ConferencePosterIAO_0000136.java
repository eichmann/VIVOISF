package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterIAO_0000136Iterator theConferencePosterIAO_0000136Iterator = (ConferencePosterIAO_0000136Iterator)findAncestorWithClass(this, ConferencePosterIAO_0000136Iterator.class);
			pageContext.getOut().print(theConferencePosterIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

