package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingAgriculturalAreaTotalIterator theSelf_governing = (Self_governingAgriculturalAreaTotalIterator)findAncestorWithClass(this, Self_governingAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theSelf_governing.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

