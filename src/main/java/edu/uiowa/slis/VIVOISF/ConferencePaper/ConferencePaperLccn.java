package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperLccnIterator theConferencePaper = (ConferencePaperLccnIterator)findAncestorWithClass(this, ConferencePaperLccnIterator.class);
			pageContext.getOut().print(theConferencePaper.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for lccn tag ");
		}
		return SKIP_BODY;
	}
}

