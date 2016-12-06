package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030AgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030AgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030AgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030AgriculturalAreaYearIterator theIAO_0000030 = (IAO_0000030AgriculturalAreaYearIterator)findAncestorWithClass(this, IAO_0000030AgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theIAO_0000030.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

