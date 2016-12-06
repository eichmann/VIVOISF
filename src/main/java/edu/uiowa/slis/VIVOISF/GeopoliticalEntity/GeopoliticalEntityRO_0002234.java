package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRO_0002234Iterator theGeopoliticalEntityRO_0002234Iterator = (GeopoliticalEntityRO_0002234Iterator)findAncestorWithClass(this, GeopoliticalEntityRO_0002234Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

