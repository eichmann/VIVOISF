package edu.uiowa.slis.VIVOISF.ERO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000007ERO_0000033InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000007ERO_0000033InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000007ERO_0000033InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000007ERO_0000033InverseIterator theERO_0000007ERO_0000033InverseIterator = (ERO_0000007ERO_0000033InverseIterator)findAncestorWithClass(this, ERO_0000007ERO_0000033InverseIterator.class);
			pageContext.getOut().print(theERO_0000007ERO_0000033InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000007 for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000007 for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

