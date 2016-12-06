package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasTelephoneIterator theGeographicRegionHasTelephoneIterator = (GeographicRegionHasTelephoneIterator)findAncestorWithClass(this, GeographicRegionHasTelephoneIterator.class);
			pageContext.getOut().print(theGeographicRegionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

