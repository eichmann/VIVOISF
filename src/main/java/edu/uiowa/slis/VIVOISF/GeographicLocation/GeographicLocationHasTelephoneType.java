package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasTelephoneIterator theGeographicLocationHasTelephoneIterator = (GeographicLocationHasTelephoneIterator)findAncestorWithClass(this, GeographicLocationHasTelephoneIterator.class);
			pageContext.getOut().print(theGeographicLocationHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

