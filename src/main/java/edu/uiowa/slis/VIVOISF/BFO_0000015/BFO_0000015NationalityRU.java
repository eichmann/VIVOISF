package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015NationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015NationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015NationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015NationalityRUIterator theBFO_0000015 = (BFO_0000015NationalityRUIterator)findAncestorWithClass(this, BFO_0000015NationalityRUIterator.class);
			pageContext.getOut().print(theBFO_0000015.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

