package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperERO_0000045Iterator theConferencePaper = (ConferencePaperERO_0000045Iterator)findAncestorWithClass(this, ConferencePaperERO_0000045Iterator.class);
			pageContext.getOut().print(theConferencePaper.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

