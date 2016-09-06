package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(MapFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapFeaturesIterator theMapFeaturesIterator = (MapFeaturesIterator)findAncestorWithClass(this, MapFeaturesIterator.class);
			pageContext.getOut().print(theMapFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for features tag ");
		}
		return SKIP_BODY;
	}
}

