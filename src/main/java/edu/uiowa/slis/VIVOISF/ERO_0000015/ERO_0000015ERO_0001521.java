package edu.uiowa.slis.VIVOISF.ERO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000015ERO_0001521 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000015ERO_0001521 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000015ERO_0001521.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000015ERO_0001521Iterator theERO_0000015ERO_0001521Iterator = (ERO_0000015ERO_0001521Iterator)findAncestorWithClass(this, ERO_0000015ERO_0001521Iterator.class);
			pageContext.getOut().print(theERO_0000015ERO_0001521Iterator.getERO_0001521());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000015 for ERO_0001521 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000015 for ERO_0001521 tag ");
		}
		return SKIP_BODY;
	}
}

