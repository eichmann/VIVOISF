package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCountryAreaYearIterator thePostdocPosition = (PostdocPositionCountryAreaYearIterator)findAncestorWithClass(this, PostdocPositionCountryAreaYearIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

