package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapFeaturesIterator theMapFeaturesIterator = (MapFeaturesIterator)findAncestorWithClass(this, MapFeaturesIterator.class);
			pageContext.getOut().print(theMapFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for features tag ");
		}
		return SKIP_BODY;
	}
}

