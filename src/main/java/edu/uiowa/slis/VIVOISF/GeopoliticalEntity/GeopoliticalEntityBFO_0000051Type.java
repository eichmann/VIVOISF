package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityBFO_0000051Iterator theGeopoliticalEntityBFO_0000051Iterator = (GeopoliticalEntityBFO_0000051Iterator)findAncestorWithClass(this, GeopoliticalEntityBFO_0000051Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

