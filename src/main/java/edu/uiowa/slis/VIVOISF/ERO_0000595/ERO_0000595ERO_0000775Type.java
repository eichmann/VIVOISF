package edu.uiowa.slis.VIVOISF.ERO_0000595;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000595ERO_0000775Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000595ERO_0000775Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000595ERO_0000775Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000595ERO_0000775Iterator theERO_0000595ERO_0000775Iterator = (ERO_0000595ERO_0000775Iterator)findAncestorWithClass(this, ERO_0000595ERO_0000775Iterator.class);
			pageContext.getOut().print(theERO_0000595ERO_0000775Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000595 for ERO_0000775 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000595 for ERO_0000775 tag ");
		}
		return SKIP_BODY;
	}
}

