package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterLandAreaTotalIterator theConferencePoster = (ConferencePosterLandAreaTotalIterator)findAncestorWithClass(this, ConferencePosterLandAreaTotalIterator.class);
			pageContext.getOut().print(theConferencePoster.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

