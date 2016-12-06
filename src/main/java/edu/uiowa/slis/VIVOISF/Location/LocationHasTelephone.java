package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasTelephoneIterator theLocationHasTelephoneIterator = (LocationHasTelephoneIterator)findAncestorWithClass(this, LocationHasTelephoneIterator.class);
			pageContext.getOut().print(theLocationHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

