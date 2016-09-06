package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicalHasAddressIterator theGeographicalHasAddressIterator = (GeographicalHasAddressIterator)findAncestorWithClass(this, GeographicalHasAddressIterator.class);
			pageContext.getOut().print(theGeographicalHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

