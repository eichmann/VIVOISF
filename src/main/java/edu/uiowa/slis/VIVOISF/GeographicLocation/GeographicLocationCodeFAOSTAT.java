package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeFAOSTATIterator theGeographicLocation = (GeographicLocationCodeFAOSTATIterator)findAncestorWithClass(this, GeographicLocationCodeFAOSTATIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

