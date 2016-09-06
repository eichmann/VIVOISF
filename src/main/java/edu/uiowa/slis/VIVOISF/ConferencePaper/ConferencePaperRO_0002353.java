package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRO_0002353Iterator theConferencePaperRO_0002353Iterator = (ConferencePaperRO_0002353Iterator)findAncestorWithClass(this, ConferencePaperRO_0002353Iterator.class);
			pageContext.getOut().print(theConferencePaperRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

