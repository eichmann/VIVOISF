package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperBFO_0000050Iterator theConferencePaperBFO_0000050Iterator = (ConferencePaperBFO_0000050Iterator)findAncestorWithClass(this, ConferencePaperBFO_0000050Iterator.class);
			pageContext.getOut().print(theConferencePaperBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

