package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001HasTitleIterator theBFO_0000001HasTitleIterator = (BFO_0000001HasTitleIterator)findAncestorWithClass(this, BFO_0000001HasTitleIterator.class);
			pageContext.getOut().print(theBFO_0000001HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

