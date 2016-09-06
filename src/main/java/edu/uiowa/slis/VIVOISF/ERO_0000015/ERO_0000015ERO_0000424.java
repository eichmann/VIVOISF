package edu.uiowa.slis.VIVOISF.ERO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000015ERO_0000424 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000015ERO_0000424 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000015ERO_0000424.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000015ERO_0000424Iterator theERO_0000015 = (ERO_0000015ERO_0000424Iterator)findAncestorWithClass(this, ERO_0000015ERO_0000424Iterator.class);
			pageContext.getOut().print(theERO_0000015.getERO_0000424());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000015 for ERO_0000424 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000015 for ERO_0000424 tag ");
		}
		return SKIP_BODY;
	}
}

