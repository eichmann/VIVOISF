package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHDITotalIterator theself_governing = (self_governingHDITotalIterator)findAncestorWithClass(this, self_governingHDITotalIterator.class);
			pageContext.getOut().print(theself_governing.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

