package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapInformationResourceSupportedByIterator theMapInformationResourceSupportedByIterator = (MapInformationResourceSupportedByIterator)findAncestorWithClass(this, MapInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theMapInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

