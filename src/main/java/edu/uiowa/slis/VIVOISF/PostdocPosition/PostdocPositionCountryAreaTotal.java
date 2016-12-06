package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCountryAreaTotalIterator thePostdocPosition = (PostdocPositionCountryAreaTotalIterator)findAncestorWithClass(this, PostdocPositionCountryAreaTotalIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

