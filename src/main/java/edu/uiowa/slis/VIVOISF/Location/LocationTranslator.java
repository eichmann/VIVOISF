package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationTranslatorIterator theLocationTranslatorIterator = (LocationTranslatorIterator)findAncestorWithClass(this, LocationTranslatorIterator.class);
			pageContext.getOut().print(theLocationTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for translator tag ");
		}
		return SKIP_BODY;
	}
}

