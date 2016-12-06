package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004HasTitleIterator theBFO_0000004HasTitleIterator = (BFO_0000004HasTitleIterator)findAncestorWithClass(this, BFO_0000004HasTitleIterator.class);
			pageContext.getOut().print(theBFO_0000004HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

