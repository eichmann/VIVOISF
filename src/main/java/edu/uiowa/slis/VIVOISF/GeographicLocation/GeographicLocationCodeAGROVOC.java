package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeAGROVOCIterator theGeographicLocation = (GeographicLocationCodeAGROVOCIterator)findAncestorWithClass(this, GeographicLocationCodeAGROVOCIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

