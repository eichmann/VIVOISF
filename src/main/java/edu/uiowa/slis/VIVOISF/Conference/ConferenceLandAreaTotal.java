package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceLandAreaTotalIterator theConference = (ConferenceLandAreaTotalIterator)findAncestorWithClass(this, ConferenceLandAreaTotalIterator.class);
			pageContext.getOut().print(theConference.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

