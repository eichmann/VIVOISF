package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingAgriculturalAreaYearIterator theself_governing = (self_governingAgriculturalAreaYearIterator)findAncestorWithClass(this, self_governingAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theself_governing.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

