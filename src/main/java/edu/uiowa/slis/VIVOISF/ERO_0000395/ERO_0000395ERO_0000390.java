package edu.uiowa.slis.VIVOISF.ERO_0000395;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000395ERO_0000390 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000395ERO_0000390 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000395ERO_0000390.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000395ERO_0000390Iterator theERO_0000395ERO_0000390Iterator = (ERO_0000395ERO_0000390Iterator)findAncestorWithClass(this, ERO_0000395ERO_0000390Iterator.class);
			pageContext.getOut().print(theERO_0000395ERO_0000390Iterator.getERO_0000390());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000395 for ERO_0000390 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000395 for ERO_0000390 tag ");
		}
		return SKIP_BODY;
	}
}

