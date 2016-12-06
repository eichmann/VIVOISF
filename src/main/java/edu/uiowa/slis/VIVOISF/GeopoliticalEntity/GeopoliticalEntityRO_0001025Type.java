package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRO_0001025Iterator theGeopoliticalEntityRO_0001025Iterator = (GeopoliticalEntityRO_0001025Iterator)findAncestorWithClass(this, GeopoliticalEntityRO_0001025Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

