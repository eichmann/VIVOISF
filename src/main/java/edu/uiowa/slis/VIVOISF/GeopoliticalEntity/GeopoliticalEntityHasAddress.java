package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasAddressIterator theGeopoliticalEntityHasAddressIterator = (GeopoliticalEntityHasAddressIterator)findAncestorWithClass(this, GeopoliticalEntityHasAddressIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}
