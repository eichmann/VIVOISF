package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasTelephoneIterator theGeographicLocationHasTelephoneIterator = (GeographicLocationHasTelephoneIterator)findAncestorWithClass(this, GeographicLocationHasTelephoneIterator.class);
			pageContext.getOut().print(theGeographicLocationHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

