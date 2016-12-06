package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRO_0002353Iterator theGeopoliticalEntityRO_0002353Iterator = (GeopoliticalEntityRO_0002353Iterator)findAncestorWithClass(this, GeopoliticalEntityRO_0002353Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

