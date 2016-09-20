package edu.uiowa.slis.VIVOISF.ERO_0000777;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000777ERO_0000775InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000777ERO_0000775InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000777ERO_0000775InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000777ERO_0000775InverseIterator theERO_0000777ERO_0000775InverseIterator = (ERO_0000777ERO_0000775InverseIterator)findAncestorWithClass(this, ERO_0000777ERO_0000775InverseIterator.class);
			pageContext.getOut().print(theERO_0000777ERO_0000775InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000777 for ERO_0000775 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000777 for ERO_0000775 tag ");
		}
		return SKIP_BODY;
	}
}

