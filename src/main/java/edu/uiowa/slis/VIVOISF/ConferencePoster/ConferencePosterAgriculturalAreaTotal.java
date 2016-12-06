package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAgriculturalAreaTotalIterator theConferencePoster = (ConferencePosterAgriculturalAreaTotalIterator)findAncestorWithClass(this, ConferencePosterAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theConferencePoster.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

