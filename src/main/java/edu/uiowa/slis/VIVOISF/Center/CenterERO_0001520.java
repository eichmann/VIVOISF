package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterERO_0001520Iterator theCenterERO_0001520Iterator = (CenterERO_0001520Iterator)findAncestorWithClass(this, CenterERO_0001520Iterator.class);
			pageContext.getOut().print(theCenterERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

