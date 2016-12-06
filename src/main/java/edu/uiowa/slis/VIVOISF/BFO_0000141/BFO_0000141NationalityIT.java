package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141NationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141NationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141NationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141NationalityITIterator theBFO_0000141 = (BFO_0000141NationalityITIterator)findAncestorWithClass(this, BFO_0000141NationalityITIterator.class);
			pageContext.getOut().print(theBFO_0000141.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

