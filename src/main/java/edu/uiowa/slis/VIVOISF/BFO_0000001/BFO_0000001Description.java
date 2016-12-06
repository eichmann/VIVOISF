package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001Description extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001Description currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001Description.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001DescriptionIterator theBFO_0000001 = (BFO_0000001DescriptionIterator)findAncestorWithClass(this, BFO_0000001DescriptionIterator.class);
			pageContext.getOut().print(theBFO_0000001.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for description tag ");
		}
		return SKIP_BODY;
	}
}

