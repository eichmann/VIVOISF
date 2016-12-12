package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingAgriculturalAreaUnitIterator theSelf_governing = (Self_governingAgriculturalAreaUnitIterator)findAncestorWithClass(this, Self_governingAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theSelf_governing.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

