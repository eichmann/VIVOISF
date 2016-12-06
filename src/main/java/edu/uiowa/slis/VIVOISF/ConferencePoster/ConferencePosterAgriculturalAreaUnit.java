package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAgriculturalAreaUnitIterator theConferencePoster = (ConferencePosterAgriculturalAreaUnitIterator)findAncestorWithClass(this, ConferencePosterAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theConferencePoster.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

