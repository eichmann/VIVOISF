package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006HasTitleIterator theBFO_0000006HasTitleIterator = (BFO_0000006HasTitleIterator)findAncestorWithClass(this, BFO_0000006HasTitleIterator.class);
			pageContext.getOut().print(theBFO_0000006HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

