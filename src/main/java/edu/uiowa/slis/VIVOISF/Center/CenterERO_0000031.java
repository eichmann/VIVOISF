package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterERO_0000031Iterator theCenterERO_0000031Iterator = (CenterERO_0000031Iterator)findAncestorWithClass(this, CenterERO_0000031Iterator.class);
			pageContext.getOut().print(theCenterERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

