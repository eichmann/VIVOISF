package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityBFO_0000050Iterator theGeopoliticalEntityBFO_0000050Iterator = (GeopoliticalEntityBFO_0000050Iterator)findAncestorWithClass(this, GeopoliticalEntityBFO_0000050Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

