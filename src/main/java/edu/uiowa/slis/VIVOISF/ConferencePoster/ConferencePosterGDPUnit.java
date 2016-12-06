package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterGDPUnitIterator theConferencePoster = (ConferencePosterGDPUnitIterator)findAncestorWithClass(this, ConferencePosterGDPUnitIterator.class);
			pageContext.getOut().print(theConferencePoster.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

