package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020NationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020NationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020NationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020NationalityITIterator theBFO_0000020 = (BFO_0000020NationalityITIterator)findAncestorWithClass(this, BFO_0000020NationalityITIterator.class);
			pageContext.getOut().print(theBFO_0000020.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

