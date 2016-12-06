package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeGAULIterator theGeographicLocation = (GeographicLocationCodeGAULIterator)findAncestorWithClass(this, GeographicLocationCodeGAULIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

