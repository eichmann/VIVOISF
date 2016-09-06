package edu.uiowa.slis.VIVOISF.ERO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000007ERO_0000398Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000007ERO_0000398Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000007ERO_0000398Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000007ERO_0000398Iterator theERO_0000007ERO_0000398Iterator = (ERO_0000007ERO_0000398Iterator)findAncestorWithClass(this, ERO_0000007ERO_0000398Iterator.class);
			pageContext.getOut().print(theERO_0000007ERO_0000398Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000007 for ERO_0000398 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000007 for ERO_0000398 tag ");
		}
		return SKIP_BODY;
	}
}

