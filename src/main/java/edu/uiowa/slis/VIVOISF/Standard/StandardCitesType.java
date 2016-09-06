package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardCitesIterator theStandardCitesIterator = (StandardCitesIterator)findAncestorWithClass(this, StandardCitesIterator.class);
			pageContext.getOut().print(theStandardCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for cites tag ");
		}
		return SKIP_BODY;
	}
}

