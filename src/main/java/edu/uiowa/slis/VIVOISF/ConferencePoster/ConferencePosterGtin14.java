package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterGtin14Iterator theConferencePoster = (ConferencePosterGtin14Iterator)findAncestorWithClass(this, ConferencePosterGtin14Iterator.class);
			pageContext.getOut().print(theConferencePoster.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

