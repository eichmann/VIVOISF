package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionSponsorsIterator theDivisionSponsorsIterator = (DivisionSponsorsIterator)findAncestorWithClass(this, DivisionSponsorsIterator.class);
			pageContext.getOut().print(theDivisionSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

