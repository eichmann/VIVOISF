package edu.uiowa.slis.VIVOISF.ERO_0000071;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000071RO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000071RO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000071RO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000071RO_0000053Iterator theERO_0000071RO_0000053Iterator = (ERO_0000071RO_0000053Iterator)findAncestorWithClass(this, ERO_0000071RO_0000053Iterator.class);
			pageContext.getOut().print(theERO_0000071RO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000071 for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000071 for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

