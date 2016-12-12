package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationHasGeoIterator theCommunicationHasGeoIterator = (CommunicationHasGeoIterator)findAncestorWithClass(this, CommunicationHasGeoIterator.class);
			pageContext.getOut().print(theCommunicationHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

