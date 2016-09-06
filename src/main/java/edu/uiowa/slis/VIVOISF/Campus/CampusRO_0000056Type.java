package edu.uiowa.slis.VIVOISF.Campus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CampusRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CampusRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CampusRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CampusRO_0000056Iterator theCampusRO_0000056Iterator = (CampusRO_0000056Iterator)findAncestorWithClass(this, CampusRO_0000056Iterator.class);
			pageContext.getOut().print(theCampusRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

