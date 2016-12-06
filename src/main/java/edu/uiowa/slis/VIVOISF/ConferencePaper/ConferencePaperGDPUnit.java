package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperGDPUnitIterator theConferencePaper = (ConferencePaperGDPUnitIterator)findAncestorWithClass(this, ConferencePaperGDPUnitIterator.class);
			pageContext.getOut().print(theConferencePaper.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

