package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRO_0000056Iterator theGeopoliticalEntityRO_0000056Iterator = (GeopoliticalEntityRO_0000056Iterator)findAncestorWithClass(this, GeopoliticalEntityRO_0000056Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

