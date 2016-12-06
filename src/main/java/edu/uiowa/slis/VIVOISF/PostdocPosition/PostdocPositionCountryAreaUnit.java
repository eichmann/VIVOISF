package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCountryAreaUnitIterator thePostdocPosition = (PostdocPositionCountryAreaUnitIterator)findAncestorWithClass(this, PostdocPositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

