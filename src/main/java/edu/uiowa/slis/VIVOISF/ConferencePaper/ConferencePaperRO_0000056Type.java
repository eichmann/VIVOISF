package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRO_0000056Iterator theConferencePaperRO_0000056Iterator = (ConferencePaperRO_0000056Iterator)findAncestorWithClass(this, ConferencePaperRO_0000056Iterator.class);
			pageContext.getOut().print(theConferencePaperRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

