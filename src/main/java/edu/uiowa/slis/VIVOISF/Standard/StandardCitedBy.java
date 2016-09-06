package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardCitedByIterator theStandardCitedByIterator = (StandardCitedByIterator)findAncestorWithClass(this, StandardCitedByIterator.class);
			pageContext.getOut().print(theStandardCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

