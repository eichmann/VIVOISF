package edu.uiowa.slis.VIVOISF.ERO_0000071;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000071ERO_0000072 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000071ERO_0000072 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000071ERO_0000072.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000071ERO_0000072Iterator theERO_0000071 = (ERO_0000071ERO_0000072Iterator)findAncestorWithClass(this, ERO_0000071ERO_0000072Iterator.class);
			pageContext.getOut().print(theERO_0000071.getERO_0000072());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000071 for ERO_0000072 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000071 for ERO_0000072 tag ");
		}
		return SKIP_BODY;
	}
}

