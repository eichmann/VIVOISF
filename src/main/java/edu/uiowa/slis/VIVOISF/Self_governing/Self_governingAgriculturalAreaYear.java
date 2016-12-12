package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingAgriculturalAreaYearIterator theSelf_governing = (Self_governingAgriculturalAreaYearIterator)findAncestorWithClass(this, Self_governingAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theSelf_governing.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

