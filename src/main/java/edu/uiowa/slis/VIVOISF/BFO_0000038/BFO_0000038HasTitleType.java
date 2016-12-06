package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038HasTitleIterator theBFO_0000038HasTitleIterator = (BFO_0000038HasTitleIterator)findAncestorWithClass(this, BFO_0000038HasTitleIterator.class);
			pageContext.getOut().print(theBFO_0000038HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

