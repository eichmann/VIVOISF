package edu.uiowa.slis.VIVOISF.ERO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000020RO_0003000 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000020RO_0003000 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000020RO_0003000.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000020RO_0003000Iterator theERO_0000020RO_0003000Iterator = (ERO_0000020RO_0003000Iterator)findAncestorWithClass(this, ERO_0000020RO_0003000Iterator.class);
			pageContext.getOut().print(theERO_0000020RO_0003000Iterator.getRO_0003000());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000020 for RO_0003000 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000020 for RO_0003000 tag ");
		}
		return SKIP_BODY;
	}
}

