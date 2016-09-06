package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationFeaturesIterator theLocationFeaturesIterator = (LocationFeaturesIterator)findAncestorWithClass(this, LocationFeaturesIterator.class);
			pageContext.getOut().print(theLocationFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for features tag ");
		}
		return SKIP_BODY;
	}
}

