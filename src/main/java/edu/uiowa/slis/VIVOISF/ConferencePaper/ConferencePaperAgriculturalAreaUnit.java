package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAgriculturalAreaUnitIterator theConferencePaper = (ConferencePaperAgriculturalAreaUnitIterator)findAncestorWithClass(this, ConferencePaperAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theConferencePaper.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

