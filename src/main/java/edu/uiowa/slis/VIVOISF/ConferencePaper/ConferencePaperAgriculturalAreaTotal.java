package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAgriculturalAreaTotalIterator theConferencePaper = (ConferencePaperAgriculturalAreaTotalIterator)findAncestorWithClass(this, ConferencePaperAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theConferencePaper.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

