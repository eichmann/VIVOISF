package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRO_0001015Iterator theGeopoliticalEntityRO_0001015Iterator = (GeopoliticalEntityRO_0001015Iterator)findAncestorWithClass(this, GeopoliticalEntityRO_0001015Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

