package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004Description extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004Description currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004Description.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004DescriptionIterator theBFO_0000004 = (BFO_0000004DescriptionIterator)findAncestorWithClass(this, BFO_0000004DescriptionIterator.class);
			pageContext.getOut().print(theBFO_0000004.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for description tag ");
		}
		return SKIP_BODY;
	}
}

