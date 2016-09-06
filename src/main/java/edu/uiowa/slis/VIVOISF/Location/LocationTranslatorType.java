package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationTranslatorIterator theLocationTranslatorIterator = (LocationTranslatorIterator)findAncestorWithClass(this, LocationTranslatorIterator.class);
			pageContext.getOut().print(theLocationTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for translator tag ");
		}
		return SKIP_BODY;
	}
}

