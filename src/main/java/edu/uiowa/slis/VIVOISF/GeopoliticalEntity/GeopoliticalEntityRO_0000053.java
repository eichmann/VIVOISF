package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRO_0000053Iterator theGeopoliticalEntityRO_0000053Iterator = (GeopoliticalEntityRO_0000053Iterator)findAncestorWithClass(this, GeopoliticalEntityRO_0000053Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

