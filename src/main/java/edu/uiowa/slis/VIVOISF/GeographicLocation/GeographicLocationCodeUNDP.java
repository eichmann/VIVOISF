package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeUNDPIterator theGeographicLocation = (GeographicLocationCodeUNDPIterator)findAncestorWithClass(this, GeographicLocationCodeUNDPIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

