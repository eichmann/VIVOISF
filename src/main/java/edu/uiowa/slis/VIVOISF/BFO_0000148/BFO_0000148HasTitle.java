package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148HasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148HasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148HasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148HasTitleIterator theBFO_0000148HasTitleIterator = (BFO_0000148HasTitleIterator)findAncestorWithClass(this, BFO_0000148HasTitleIterator.class);
			pageContext.getOut().print(theBFO_0000148HasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

