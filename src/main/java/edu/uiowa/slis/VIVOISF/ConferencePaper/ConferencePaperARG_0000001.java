package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperARG_0000001Iterator theConferencePaper = (ConferencePaperARG_0000001Iterator)findAncestorWithClass(this, ConferencePaperARG_0000001Iterator.class);
			pageContext.getOut().print(theConferencePaper.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

